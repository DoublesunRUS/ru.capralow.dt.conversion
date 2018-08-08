package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
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

public class ConversionModuleEditor extends EditorPart {

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
		layout.numColumns = 2;
		parent.setLayout(layout);
		new Label(parent, SWT.NONE).setText("Summary");
		Text text = new Text(parent, SWT.BORDER);
		text.setText("111");
		text.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

		new Label(parent, SWT.NONE).setText("Description");
		Text lastName = new Text(parent, SWT.BORDER);
		lastName.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		lastName.setText("222");

		new Label(parent, SWT.NONE).setText("Done");
		Button doneBtn = new Button(parent, SWT.CHECK);
		doneBtn.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		doneBtn.setSelection(true);
	}

	@Override
	public void setFocus() {
		// TODO Автоматически созданная заглушка метода
		
	}
}
