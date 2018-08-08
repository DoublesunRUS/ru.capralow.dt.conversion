package com._rarus.dt.conversion.plugin.ui.editors;

import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com._rarus.dt.conversion.plugin.core.rm.AutoRegistration;
import com._rarus.dt.conversion.plugin.core.rm.ExchangePlanContent;
import com._rarus.dt.conversion.plugin.core.rm.RegistrationModule;
import com._rarus.dt.conversion.plugin.core.rm.RegistrationModuleContentProvider;
import com._rarus.dt.conversion.plugin.core.rm.impl.ExchangePlanContentImpl;
import com._rarus.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl;
import com.google.common.base.Preconditions;

public class RegistrationModuleEditor extends TextEditor {
//	@Inject
//	private IConfigurationProvider configurationProvider;

	protected TreeViewer treeViewer;
//	protected RegistrationModuleLabelProvider labelProvider;

//	protected Action onlyBoardGamesAction, atLeatThreeItems;
//	protected Action booksBoxesGamesAction, noArticleAction;
//	protected Action addBookAction, removeAction;
//	protected ViewerFilter onlyBoardGamesFilter, atLeastThreeFilter;
//	protected ViewerSorter booksBoxesGamesSorter, noArticleSorter;
//	
//	protected MovingBox root;

	protected RegistrationModule registrationModule;

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		Preconditions.checkArgument(input instanceof IFileEditorInput, "IFileEditorInput expected, but actual: %s",
				input);

		setSite(site);
		setInput(input);
		
		readRegistrationModule(((FileEditorInput) input).getFile());

		IProject project = ((FileEditorInput) input).getFile().getProject();
//		Configuration configuration = configurationProvider.getConfiguration(project);
//
//		EList<ExchangePlan> exchangePlans = configuration.getExchangePlans();
//		ExchangePlan currentObject = exchangePlans.get(5);
//		Template registrationModuleTemplate = currentObject.getTemplates().get(1);
//		FileAwareTextDocumentImpl templateContext = (FileAwareTextDocumentImpl) registrationModuleTemplate
//				.getTemplate();

//		ITextEditor editor = (ITextEditor) getAdapter(ITextEditor.class);
//		XtextDocumentProvider provider = (XtextDocumentProvider) editor.getDocumentProvider();
//		IXtextDocument document = (IXtextDocument) provider.getDocument(editor);
//		
//		// получим объект метаданных, к которому принадлежит модуль, из
//		// которого была вызвана команда
//		EObject moduleOwner = getModuleOwner(document);

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public void doSaveAs() {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public boolean isDirty() {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 2;
		layout.marginWidth = 0;
		layout.marginHeight = 2;
		parent.setLayout(layout);
		
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new RegistrationModuleContentProvider());
//		labelProvider = new MovingBoxLabelProvider();
//		treeViewer.setLabelProvider(labelProvider);
		
		treeViewer.setUseHashlookup(true);
		
		GridData layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.grabExcessVerticalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.verticalAlignment = GridData.FILL;
		treeViewer.getControl().setLayoutData(layoutData);

		treeViewer.setInput(registrationModule);
		treeViewer.expandAll();
	}

	@Override
	public void setFocus() {
		// TODO Автоматически созданная заглушка метода

	}

	private void readRegistrationModule(IFile file) {
		registrationModule = new RegistrationModuleImpl();
		
		InputStream fileInput;
		try {
			fileInput = file.getContents();
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(fileInput);

			Element documentElement = document.getDocumentElement();

			if (documentElement.getNodeName() != "ПравилаРегистрации") {
				return;
			}

			NodeList nodeList = documentElement.getChildNodes();
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				String nodeName = node.getNodeName();
				if (nodeName == "ВерсияФормата") {
					registrationModule.setModuleVersion(node.getFirstChild().getTextContent());

				} else if (nodeName == "Ид") {
					registrationModule.setModuleRef(node.getFirstChild().getTextContent());

				} else if (nodeName == "Наименование") {
					registrationModule.setModuleName(node.getFirstChild().getTextContent());

				} else if (nodeName == "ДатаВремяСоздания") {
					// TODO: registrationModule.setModuleCreationDate(node.getNodeValue());

				} else if (nodeName == "ПланОбмена") {
					registrationModule.setExchangePlanName(node.getAttributes().getNamedItem("Имя").getTextContent());
					registrationModule.setExchangePlanMdObject(node.getFirstChild().getTextContent());

				} else if (nodeName == "Конфигурация") {
					NamedNodeMap attributes = node.getAttributes();
					registrationModule.setConfigurationName(node.getFirstChild().getTextContent());
					registrationModule
							.setConfigurationSynonym(attributes.getNamedItem("СинонимКонфигурации").getTextContent());
					registrationModule
							.setConfigurationVersion(attributes.getNamedItem("ВерсияКонфигурации").getTextContent());
					registrationModule.setRuntimeVersion(attributes.getNamedItem("ВерсияПлатформы").getTextContent());

				} else if (nodeName == "СоставПланаОбмена") {
					EList<ExchangePlanContent> exchangePlanContent = registrationModule.getExchangePlanContent();

					NodeList childNodeList = node.getChildNodes();
					for (int ci = 0; ci < childNodeList.getLength(); ci++) {
						Node childNode = childNodeList.item(ci);
						if (childNode.getNodeName() != "Элемент") {
							continue;
						}

						ExchangePlanContentImpl exchangePlanContentElement = new ExchangePlanContentImpl();

						NodeList childChildNodeList = childNode.getChildNodes();
						for (int cci = 0; cci < childChildNodeList.getLength(); cci++) {
							Node childChildNode = childChildNodeList.item(cci);
							if (childChildNode.getNodeName() == "Тип") {
								exchangePlanContentElement.setMdObject(childChildNode.getFirstChild().getTextContent());

							} else if (childChildNode.getNodeName() == "Авторегистрация") {
								if (childChildNode.getFirstChild().getTextContent() == "true") {
									exchangePlanContentElement.setAutoRecord(AutoRegistration.ALLOW);

								} else {
									exchangePlanContentElement.setAutoRecord(AutoRegistration.DENY);

								}
							}
						}

						exchangePlanContent.add(exchangePlanContentElement);
					}

				} else if (nodeName == "ПравилаРегистрацииОбъектов") {
					registrationModule.setExchangePlanName(node.getFirstChild().getTextContent());

				}
			}
//			fileInput.close();
			
		} catch (InvalidPropertiesFormatException e) {
			// TODO Автоматически созданный блок catch
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Автоматически созданный блок catch
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Автоматически созданный блок catch
			e.printStackTrace();
		} catch (CoreException e1) {
			// TODO Автоматически созданный блок catch
			e1.printStackTrace();
		} catch (SAXException e) {
			// TODO Автоматически созданный блок catch
			e.printStackTrace();
		}
	}

//	private static class CustomLabelProvider extends LabelProvider implements IStyledLabelProvider {
//		@Override
//		public String getText(Object element) {
//			return super.getText(element);
//		}
//
//		@Override
//		public StyledString getStyledText(Object element) {
//			return new StyledString(super.getText(element));
//		}
//
//		@Override
//		public Image getImage(Object element) {
//			return super.getImage(element);
//		}
//	}
//
//	private EObject getModuleOwner(IXtextDocument doc) {
//		// работа с семантической моделью встроенного языка через документ возможна
//		// только через специальный метод
//		// использование других способов приведет к ошибкам
//		return doc.readOnly(new IUnitOfWork<EObject, XtextResource>() {
//			@Override
//			public EObject exec(XtextResource res) throws Exception {
//				// сперва проверяем, доступность семантической модели встроенного языка
//				if (res.getContents() != null && !res.getContents().isEmpty()) {
//					EObject obj = res.getContents().get(0);
//					if (obj instanceof Module) // проверили, что работаем с правильным объектом семантической модели
//					{
//						if (((Module) obj).getModuleType() != ModuleType.OBJECT_MODULE) // интересуют только объектные
//																						// модули
//							return null;
//						Module module = (Module) obj;
//						return EcoreUtil.resolve(module.getOwner(), module);
//					}
//				}
//				return null;
//			}
//		});
//	}
}
