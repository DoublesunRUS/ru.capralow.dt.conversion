package ru.capralow.dt.conversion.plugin.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com._1c.g5.wiring.InjectorAwareServiceRegistrator;
//import com._1c.g5.wiring.InitializationJob;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Activator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "ru.capralow.dt.conversion.plugin.ui"; //$NON-NLS-1$
	private static Activator plugin;

	private BundleContext bundleContext;

	private Injector injector;
	private InjectorAwareServiceRegistrator registrator;

	public static Activator getDefault() {
		return plugin;
	}

	public static void log(IStatus status) {
		plugin.getLog().log(status);
	}

	public static void logError(Throwable throwable) {
		log(createErrorStatus(throwable.getMessage(), throwable));
	}

	public static IStatus createErrorStatus(String message, Throwable throwable) {
		return new Status(IStatus.ERROR, PLUGIN_ID, 0, message, throwable);
	}

	public static IStatus createWarningStatus(String message) {
		return new Status(IStatus.WARNING, PLUGIN_ID, 0, message, null);
	}

	public static IStatus createWarningStatus(final String message, Exception throwable) {
		return new Status(IStatus.WARNING, PLUGIN_ID, 0, message, throwable);
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);

		this.bundleContext = bundleContext;
		plugin = this;

		registrator = new InjectorAwareServiceRegistrator(bundleContext, this::getInjector);

//		InitializationJob.schedule(monitor -> {
//			// register services from injector
//			registrator.service(ISomeService.class).registerInjected();
//			
//			// register qualified service from injector
//			registrator.service(ISomeQualifiedService.class).withProperty("qualifier", "MdImplementation")
//					.registerInjected(ISomeQualifiedService.class, Names.named("MdImplementation"));
//			
//			// register instance
//			registrator.service(ISomeInstanceService.class).registerInstance(new ISomeInstanceService() {
//				@Override
//				public void method() {
//					// do nothing
//				}
//			});
//			return Status.OK_STATUS;
//		});
		
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		registrator.unregisterServices();

		plugin = null;
		super.stop(bundleContext);
	}

	protected BundleContext getContext() {
		return bundleContext;
	}

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

	public static ImageDescriptor getImageDescriptor(String name) {
		String iconPath = "icons/";
		return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, iconPath + name);
	}

}
