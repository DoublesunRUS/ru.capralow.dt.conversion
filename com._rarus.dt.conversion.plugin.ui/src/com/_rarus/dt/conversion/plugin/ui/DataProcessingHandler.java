/**
 * Copyright (C) 2018 1С-Рарус Капралов А.А.
 */
package com._rarus.dt.conversion.plugin.ui;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.antlr.stringtemplate.StringTemplate;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com._1c.g5.v8.dt.bsl.model.DeclareStatement;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.ModuleType;
import com._1c.g5.v8.dt.metadata.mdclass.AccumulationRegister;
import com._1c.g5.v8.dt.metadata.mdclass.BasicRegister;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Document;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

/**
 * Класс для просмотра модуля конвертации аналогично обработке НастройкаПравилОбмена конфигурации КД 3
  */
public class DataProcessingHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// получим активный Xtext редактор
		IWorkbenchPart part = HandlerUtil.getActivePart(event);
		XtextEditor target = part.getAdapter(XtextEditor.class);

		if (target == null)
			return null;
		
		// для полученного редактора убедимся, что под ним лежит файл в
		// проекте с конфигурацией, иначе это точно не модель объекта документа
		if (!(target.getEditorInput() instanceof IFileEditorInput))
			return null;
		IFileEditorInput input = (IFileEditorInput) target.getEditorInput();
		IFile file = input.getFile();
		if (file == null)
			return null;
		IProject project = file.getProject();
		if (project == null)
			return null;
		IXtextDocument doc = target.getDocument();

		// получим объект метаданных, к которому принадлежит модуль, из которого была вызвана команда
		EObject moduleOwner = getModuleOwner(doc);
		
		// проверим, что команда была вызвана из общего модуля
		if (!(moduleOwner instanceof CommonModule)) {
			// Данный модуль не является общим модулем, выдадим сообщение об этом и завершим работу
			MessageBox dialog = new MessageBox(Display.getCurrent().getActiveShell(), SWT.ERROR);
			dialog.setText(Messages.DataProcessingHandler_Error);
			dialog.setMessage(Messages.DataProcessingHandler_Error_not_common_module);
			dialog.open();
			return null;
		}
		
		// проверим что этот модуль от конвертации данных
		String moduleId;
		try {
			moduleId = doc.get(0, 15);
		} catch (BadLocationException e) {
			moduleId = "";
		}
		if (!moduleId.equals("// Конвертация ")) {
			// Данный модуль не является общим модулем конвертации
			MessageBox dialog = new MessageBox(Display.getCurrent().getActiveShell(), SWT.ERROR);
			dialog.setText(Messages.DataProcessingHandler_Error);
			dialog.setMessage(Messages.DataProcessingHandler_Error_not_convertation_module);
			dialog.open();
			return null;
		}
		
		String convertationId = "";
		try {
			convertationId = doc.get(15, doc.getLineLength(0) - 17);
		} catch (BadLocationException e) {
		}
		
		// создадим диалог аналогичный обработке НастройкаПравилОбмена конфигурации КД 3
		DataProcessingHandlerDialog dialog = new DataProcessingHandlerDialog(Display.getCurrent().getActiveShell(),
				convertationId);
		
		if (dialog.open() == Window.OK) {
			return null;
		}
		
		return null;
	}

	private EObject getModuleOwner(IXtextDocument doc) {
		// работа с семантической моделью встроенного языка через документ возможна только через специальный метод
		// использование других способов приведет к ошибкам
		return doc.readOnly(new IUnitOfWork<EObject, XtextResource>() {
			@Override
			public EObject exec(XtextResource res) throws Exception {
				// сперва проверяем, доступность семантической модели встроенного языка
				if (res.getContents() != null && !res.getContents().isEmpty()) {
					EObject obj = res.getContents().get(0);
					if (obj instanceof Module) // проверили, что работаем с правильным объектом семантической модели
					{
						if (((Module) obj).getModuleType() != ModuleType.COMMON_MODULE) // интересуют только общие модули
							return null;
						Module module = (Module) obj;
						return EcoreUtil.resolve(module.getOwner(), module);
					}
				}
				return null;
			}
		});
	}

	private static String readContents(CharSource source, String path) {
		try (Reader reader = source.openBufferedStream()) {
			return CharStreams.toString(reader);
		} catch (IOException | NullPointerException e) {
			return ""; //$NON-NLS-1$
		}
	}

}
