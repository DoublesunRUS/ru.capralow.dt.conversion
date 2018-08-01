package com._rarus.dt.conversion.plugin.ui;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * ������ ����� ������������ ����� ��������� ����� � ������ �������. � ���
 * ������� ������������� ������ �������� �������, � ��� �� ����������� ��������
 * ��� ���������� ������ �������. <br>
 *
 * ��� �� ������ ����� �������� � ���� ��� ������� ��� �������� �����������
 * ������
 */
public class Activator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "com._rarus.dt.conversion.plugin.ui"; //$NON-NLS-1$
	private static Activator plugin;

	private BundleContext bundleContext;

	private Injector injector;

	/**
	 * �������� ��������� �������. ����� ��������� ������� ����� �������� ������ �
	 * ������������� ���������� Eclipse, ����� ���:
	 * <ul>
	 * <li>������ ����������� ������ �������</li>
	 * <li>�������� ��������� ������� �������</li>
	 * <li>�������� ������������</li>
	 * </ul>
	 *
	 * @return ��������� �������, ������� �� ������ ���������� <code>null</code>
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * ������ ������� ������� � ��� ������ �������.
	 *
	 * @param status ������ ������� ��� �����������, �� ����� ����
	 *               <code>null</code>. ������ ������ �������� � ���� ���������� �
	 *               ������������ ������� (������ ����������, �������������
	 *               ��������������), ������� ���� ������������� � ������ ������
	 *               �������.
	 */
	public static void log(IStatus status) {
		plugin.getLog().log(status);
	}

	/**
	 * ������ ���������� � ��� ������ �������
	 *
	 * @param throwable ��������� ����������, �� ����� ���� <code>null</code>
	 */
	public static void logError(Throwable throwable) {
		log(createErrorStatus(throwable.getMessage(), throwable));
	}

	/**
	 * �������� ������ � ��������� ������ � ��� ������� ������� �� ����������
	 * ���������� � ���������, ��� �����������
	 *
	 * @param message   �������� ���������� ����������, �� ����� ����
	 *                  <code>null</code>
	 * @param throwable ��������� ����������, ����� ���� <code>null</code>
	 * @return ��������� ������ �������, �� ����� ���� <code>null</code>
	 */
	public static IStatus createErrorStatus(String message, Throwable throwable) {
		return new Status(IStatus.ERROR, PLUGIN_ID, 0, message, throwable);
	}

	/**
	 * �������� ������ � ��������� �������������� � ��� ������� �������
	 *
	 * @param message �������� ��������������, �� ����� ���� <code>null</code>
	 * @return ��������� ������ �������, �� ����� ���� <code>null</code>
	 */
	public static IStatus createWarningStatus(String message) {
		return new Status(IStatus.WARNING, PLUGIN_ID, 0, message, null);
	}

	/**
	 * �������� ������ � ��������� �������������� � ��� ������� ������� ��
	 * ���������� ���������� � ���������, ��� �����������
	 *
	 * @param message   �������� ���������� ����������, �� ����� ����
	 *                  <code>null</code>
	 * @param throwable ��������� ����������, ����� ���� <code>null</code>
	 * @return ��������� ������ �������, �� ����� ���� <code>null</code>
	 */
	public static IStatus createWarningStatus(final String message, Exception throwable) {
		return new Status(IStatus.WARNING, PLUGIN_ID, 0, message, throwable);
	}

	/**
	 * ������ ����� �������� ��������� ������ ������ �������
	 *
	 * @param bundleContext ������, ����������� OSGi Framework, ��� ������� �
	 *                      ������������� ��������, ��������, �� ������ � ���������
	 *                      ��������� ������ �������
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);

		this.bundleContext = bundleContext;
		plugin = this;
	}

	/**
	 * ������ ����� ���������� ��� ���������� ������ �������
	 *
	 * @param bundleContext ������, ����������� OSGi Framework, ��� ������� �
	 *                      ������������� ��������, ��������, �� ������ � ���������
	 *                      ��������� ������ �������
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		super.stop(bundleContext);
	}

	/**
	 * �������� ������, ����������� OSGi Framework, ��� ������� � �������������
	 * ��������, ��������, �� ������ � ��������� ��������� ������ �������
	 *
	 * @return ������, ����������� OSGi Framework, ��� ������� � �������������
	 *         ��������, ��������, �� ������ � ��������� ��������� ������ �������
	 */
	protected BundleContext getContext() {
		return bundleContext;
	}

	/**
	 * Returns Guice injector for this plugin.
	 *
	 * @return Guice injector for this plugin, never {@code null}
	 */
	public synchronized Injector getInjector() {
		if (injector == null)
			return injector = createInjector();
		return injector;
	}

	private Injector createInjector() {
		try {
			return Guice.createInjector(new ConversionExternalDependenciesModule(this));
		} catch (Exception e) {
			throw new RuntimeException("Failed to create injector for " + getBundle().getSymbolicName(), e);
		}
	}

	/**
	 * Returns the workspace instance.
	 */
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	/**
	 * Returns the string from the plugin's resource bundle, or 'key' if not found.
	 */
	public static ImageDescriptor getImageDescriptor(String name) {
		String iconPath = "icons/";
		return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, iconPath + name);
	}

}
