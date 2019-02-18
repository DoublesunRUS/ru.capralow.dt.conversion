package ru.capralow.dt.conversion.plugin.ui.editors;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.part.FileEditorInput;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com._1c.g5.v8.dt.md.ui.editor.base.DtGranularEditorPage;
import com._1c.g5.v8.dt.ui.editor.input.IDtEditorInput;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration;
import ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent;
import ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule;
import ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanContentImpl;
import ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl;

public class RegistrationModuleEditor extends DtGranularEditorPage<EObject> {
	public static final java.lang.String PAGE_ID = "ru.capralow.dt.conversion.plugin.ui.editors.RegistrationModuleEditor";

	// @Inject
	// private IConfigurationProvider configurationProvider;

	@Inject
	public RegistrationModuleEditor(String id, String title) {
		super(id, "Правила регистрации");
	}

	@Override
	public void init(IEditorSite site, IDtEditorInput<EObject> input) throws PartInitException {
		super.init(site, input);

		readRegistrationModule(((FileEditorInput) input).getFile());

		// IProject project = ((FileEditorInput) input).getFile().getProject();
		// Configuration configuration =
		// configurationProvider.getConfiguration(project);
		//
		// EList<ExchangePlan> exchangePlans = configuration.getExchangePlans();
		// ExchangePlan currentObject = exchangePlans.get(5);
		// Template registrationModuleTemplate = currentObject.getTemplates().get(1);
		// FileAwareTextDocumentImpl templateContext = (FileAwareTextDocumentImpl)
		// registrationModuleTemplate
		// .getTemplate();

		// ITextEditor editor = (ITextEditor) getAdapter(ITextEditor.class);
		// XtextDocumentProvider provider = (XtextDocumentProvider)
		// editor.getDocumentProvider();
		// IXtextDocument document = (IXtextDocument) provider.getDocument(editor);
		//
		// // ������� ������ ����������, � �������� ����������� ������, ��
		// // �������� ���� ������� �������
		// EObject moduleOwner = getModuleOwner(document);

	}

	@Override
	protected Layout createPageLayout() {
		return super.createPageLayout();
	}

	// @Override
	// public void createPartControl(Composite parent) {
	// super.createPartControl(parent);
	//
	// GridLayout layout = new GridLayout();
	// layout.numColumns = 1;
	// layout.verticalSpacing = 2;
	// layout.marginWidth = 0;
	// layout.marginHeight = 2;
	// parent.setLayout(layout);

	// treeViewer = new TreeViewer(parent);
	// treeViewer.setContentProvider(new RegistrationModuleContentProvider());
	// labelProvider = new MovingBoxLabelProvider();
	// treeViewer.setLabelProvider(labelProvider);

	// treeViewer.setUseHashlookup(true);
	//
	// GridData layoutData = new GridData();
	// layoutData.grabExcessHorizontalSpace = true;
	// layoutData.grabExcessVerticalSpace = true;
	// layoutData.horizontalAlignment = GridData.FILL;
	// layoutData.verticalAlignment = GridData.FILL;
	// treeViewer.getControl().setLayoutData(layoutData);
	//
	// treeViewer.setInput(registrationModule);
	// treeViewer.expandAll();
	// }

	protected TreeViewer treeViewer;
	// protected RegistrationModuleLabelProvider labelProvider;

	// protected Action onlyBoardGamesAction, atLeatThreeItems;
	// protected Action booksBoxesGamesAction, noArticleAction;
	// protected Action addBookAction, removeAction;
	// protected ViewerFilter onlyBoardGamesFilter, atLeastThreeFilter;
	// protected ViewerSorter booksBoxesGamesSorter, noArticleSorter;
	//
	// protected MovingBox root;

	protected RegistrationModule registrationModule;

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void setFocus() {
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

			if (documentElement.getNodeName() != "������������������") {
				return;
			}

			NodeList nodeList = documentElement.getChildNodes();
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				String nodeName = node.getNodeName();
				if (nodeName == "�������������") {
					registrationModule.setModuleVersion(node.getFirstChild().getTextContent());

				} else if (nodeName == "��") {
					registrationModule.setModuleRef(node.getFirstChild().getTextContent());

				} else if (nodeName == "������������") {
					registrationModule.setModuleName(node.getFirstChild().getTextContent());

				} else if (nodeName == "�����������������") {
					// TODO: registrationModule.setModuleCreationDate(node.getNodeValue());

				} else if (nodeName == "����������") {
					registrationModule.setExchangePlanName(node.getAttributes().getNamedItem("���").getTextContent());
					registrationModule.setExchangePlanMdObject(node.getFirstChild().getTextContent());

				} else if (nodeName == "������������") {
					NamedNodeMap attributes = node.getAttributes();
					registrationModule.setConfigurationName(node.getFirstChild().getTextContent());
					registrationModule
							.setConfigurationSynonym(attributes.getNamedItem("�������������������").getTextContent());
					registrationModule
							.setConfigurationVersion(attributes.getNamedItem("������������������").getTextContent());
					registrationModule.setRuntimeVersion(attributes.getNamedItem("���������������").getTextContent());

				} else if (nodeName == "�����������������") {
					EList<ExchangePlanContent> exchangePlanContent = registrationModule.getExchangePlanContent();

					NodeList childNodeList = node.getChildNodes();
					for (int ci = 0; ci < childNodeList.getLength(); ci++) {
						Node childNode = childNodeList.item(ci);
						if (childNode.getNodeName() != "�������") {
							continue;
						}

						ExchangePlanContentImpl exchangePlanContentElement = new ExchangePlanContentImpl();

						NodeList childChildNodeList = childNode.getChildNodes();
						for (int cci = 0; cci < childChildNodeList.getLength(); cci++) {
							Node childChildNode = childChildNodeList.item(cci);
							if (childChildNode.getNodeName() == "���") {
								exchangePlanContentElement.setMdObject(childChildNode.getFirstChild().getTextContent());

							} else if (childChildNode.getNodeName() == "���������������") {
								if (childChildNode.getFirstChild().getTextContent() == "true") {
									exchangePlanContentElement.setAutoRecord(AutoRegistration.ALLOW);

								} else {
									exchangePlanContentElement.setAutoRecord(AutoRegistration.DENY);

								}
							}
						}

						exchangePlanContent.add(exchangePlanContentElement);
					}

				} else if (nodeName == "��������������������������") {
					registrationModule.setExchangePlanName(node.getFirstChild().getTextContent());

				}
			}
			// fileInput.close();

		} catch (CoreException | ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void createPageControls(IManagedForm arg0) {
	}

	// private static class CustomLabelProvider extends LabelProvider implements
	// IStyledLabelProvider {
	// @Override
	// public String getText(Object element) {
	// return super.getText(element);
	// }
	//
	// @Override
	// public StyledString getStyledText(Object element) {
	// return new StyledString(super.getText(element));
	// }
	//
	// @Override
	// public Image getImage(Object element) {
	// return super.getImage(element);
	// }
	// }
	//
	// private EObject getModuleOwner(IXtextDocument doc) {
	// // ������ � ������������� ������� ����������� ����� ����� �������� ��������
	// // ������ ����� ����������� �����
	// // ������������� ������ �������� �������� � �������
	// return doc.readOnly(new IUnitOfWork<EObject, XtextResource>() {
	// @Override
	// public EObject exec(XtextResource res) throws Exception {
	// // ������ ���������, ����������� ������������� ������ ����������� �����
	// if (res.getContents() != null && !res.getContents().isEmpty()) {
	// EObject obj = res.getContents().get(0);
	// if (obj instanceof Module) // ���������, ��� �������� � ���������� ��������
	// ������������� ������
	// {
	// if (((Module) obj).getModuleType() != ModuleType.OBJECT_MODULE) // ����������
	// ������ ���������
	// // ������
	// return null;
	// Module module = (Module) obj;
	// return EcoreUtil.resolve(module.getOwner(), module);
	// }
	// }
	// return null;
	// }
	// });
	// }
}
