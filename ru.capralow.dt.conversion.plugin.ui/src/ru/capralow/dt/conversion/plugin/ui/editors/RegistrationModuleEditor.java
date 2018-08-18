package ru.capralow.dt.conversion.plugin.ui.editors;

import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
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

import com.google.common.base.Preconditions;

import ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration;
import ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent;
import ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule;
import ru.capralow.dt.conversion.plugin.core.rm.RegistrationModuleContentProvider;
import ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanContentImpl;
import ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl;

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

//		IProject project = ((FileEditorInput) input).getFile().getProject();
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
//		// ������� ������ ����������, � �������� ����������� ������, ��
//		// �������� ���� ������� �������
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
//			fileInput.close();
			
		} catch (InvalidPropertiesFormatException e) {
			// TODO Автоматически созданная заглушка метода
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Автоматически созданная заглушка метода
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Автоматически созданная заглушка метода
			e.printStackTrace();
		} catch (CoreException e1) {
			// TODO Автоматически созданная заглушка метода
			e1.printStackTrace();
		} catch (SAXException e) {
			// TODO Автоматически созданная заглушка метода
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
//		// ������ � ������������� ������� ����������� ����� ����� �������� ��������
//		// ������ ����� ����������� �����
//		// ������������� ������ �������� �������� � �������
//		return doc.readOnly(new IUnitOfWork<EObject, XtextResource>() {
//			@Override
//			public EObject exec(XtextResource res) throws Exception {
//				// ������ ���������, ����������� ������������� ������ ����������� �����
//				if (res.getContents() != null && !res.getContents().isEmpty()) {
//					EObject obj = res.getContents().get(0);
//					if (obj instanceof Module) // ���������, ��� �������� � ���������� �������� ������������� ������
//					{
//						if (((Module) obj).getModuleType() != ModuleType.OBJECT_MODULE) // ���������� ������ ���������
//																						// ������
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
