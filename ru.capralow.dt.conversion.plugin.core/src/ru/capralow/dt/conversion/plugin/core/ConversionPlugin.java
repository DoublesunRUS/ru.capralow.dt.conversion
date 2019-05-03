package ru.capralow.dt.conversion.plugin.core;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com._1c.g5.wiring.InjectorAwareServiceRegistrator;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ConversionPlugin extends AbstractUIPlugin {
	public static final String ID = "ru.capralow.dt.conversion.plugin.core";
	private static ConversionPlugin plugin;

	public static IStatus createErrorStatus(String message) {
		return new Status(IStatus.ERROR, ID, 0, message, (Throwable) null);
	}

	public static IStatus createErrorStatus(String message, int code) {
		return new Status(IStatus.ERROR, ID, code, message, (Throwable) null);
	}

	public static IStatus createErrorStatus(String message, int code, Throwable throwable) {
		return new Status(IStatus.ERROR, ID, code, message, throwable);
	}

	public static IStatus createErrorStatus(String message, Throwable throwable) {
		return new Status(IStatus.ERROR, ID, 0, message, throwable);
	}

	public static IStatus createWarningStatus(String message) {
		return new Status(IStatus.WARNING, ID, 0, message, (Throwable) null);
	}

	public static ConversionPlugin getDefault() {
		return plugin;
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

	private InjectorAwareServiceRegistrator registrator;

	private Injector injector;

	public synchronized Injector getInjector() {
		if (injector == null)
			injector = createInjector();

		return injector;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;
		registrator = new InjectorAwareServiceRegistrator(bundleContext, this::getInjector);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		super.stop(bundleContext);
		registrator.deactivateManagedServices(this);
	}

	private Injector createInjector() {
		try {
			return Guice.createInjector(new ExternalDependenciesModule(this));

		} catch (Exception e) {
			String msg = String.format("Не удалось создать injector для \"%1$s\"", getBundle().getSymbolicName());
			log(createErrorStatus(msg, e));
			return null;

		}
	}

}