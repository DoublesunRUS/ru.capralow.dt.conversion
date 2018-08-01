package com._rarus.dt.conversion.plugin.ui.editors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

import com._1c.g5.v8.dt.core.platform.IConfigurationProvider;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._rarus.dt.conversion.plugin.ui.MovingBoxContentProvider;
import com.google.common.base.Preconditions;
import com.google.inject.Inject;

public class RegistrationModuleEditor extends TextEditor {
	@Inject
	private IConfigurationProvider configurationProvider;
	
	protected TreeViewer treeViewer;
	protected Text text;
//	protected RegistrationModuleLabelProvider labelProvider;
	
//	protected Action onlyBoardGamesAction, atLeatThreeItems;
//	protected Action booksBoxesGamesAction, noArticleAction;
//	protected Action addBookAction, removeAction;
//	protected ViewerFilter onlyBoardGamesFilter, atLeastThreeFilter;
//	protected ViewerSorter booksBoxesGamesSorter, noArticleSorter;
//	
//	protected MovingBox root;
	
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
		/* Create a grid layout object so the text and treeviewer
		 * are layed out the way I want. */
		GridLayout layout = new GridLayout();
		layout.numColumns		= 1;
		layout.verticalSpacing	= 2;
		layout.marginWidth		= 0;
		layout.marginHeight		= 2;
		parent.setLayout(layout);
		
		GridDataFactory.fillDefaults().grab(true, true).applyTo(parent);
		
		// Create the tree viewer as a child of the composite parent
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new MovingBoxContentProvider());
		
		treeViewer.setUseHashlookup(true);
		
		// layout the tree viewer below the text field
		GridData layoutData = new GridData();
		layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.grabExcessVerticalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.verticalAlignment = GridData.FILL;
		treeViewer.getControl().setLayoutData(layoutData);
		
	}

	@Override
	public void setFocus() {
		// TODO Автоматически созданная заглушка метода
		
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
