package com._rarus.dt.conversion.plugin.ui.editors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import com._1c.g5.v8.dt.core.platform.IConfigurationProvider;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

public class RegistrationModuleEditor extends EditorPart {

	@Inject
	private IConfigurationProvider configurationProvider;

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		Preconditions.checkArgument(input instanceof IFileEditorInput, "IFileEditorInput expected, but actual: %s",
				input);

		setSite(site);
		setInput(input);

		IProject project = ((FileEditorInput) input).getFile().getProject();
		Configuration configuration = configurationProvider.getConfiguration(project);
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO јвтоматически созданна€ заглушка метода
		
	}

	@Override
	public void doSaveAs() {
		// TODO јвтоматически созданна€ заглушка метода
		
	}

	@Override
	public boolean isDirty() {
		// TODO јвтоматически созданна€ заглушка метода
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO јвтоматически созданна€ заглушка метода
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		parent.setLayout(layout);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(parent);
		
		TableViewer tableViewer = new TableViewer(parent, SWT.BORDER | SWT.V_SCROLL | SWT.FULL_SELECTION);
		
		int height = tableViewer.getTable().getItemHeight() * 5;
		
		tableViewer.getTable().setHeaderVisible(true);

		GridDataFactory.fillDefaults().hint(SWT.DEFAULT, height).grab(true, false).applyTo(tableViewer.getTable());
		
		TableViewerColumn column = new TableViewerColumn(tableViewer, SWT.BORDER);
		
		column.getColumn().setText("«аголовок");
		
		column.setLabelProvider(new DelegatingStyledCellLabelProvider(new CustomLabelProvider()));
		
//		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
//		tableViewer.setInput(content);
		
		column.getColumn().pack();
	}

	@Override
	public void setFocus() {
		// TODO јвтоматически созданна€ заглушка метода
		
	}
	
	private static class CustomLabelProvider extends LabelProvider implements IStyledLabelProvider {
		@Override
		public String getText(Object element) {
			return super.getText(element);
		}

		@Override
		public StyledString getStyledText(Object element) {
			return new StyledString(super.getText(element));
		}

		@Override
		public Image getImage(Object element) {
			return super.getImage(element);
		}
	}}
