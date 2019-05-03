package ru.capralow.dt.conversion.plugin.ui;

import org.osgi.framework.Bundle;

import com._1c.g5.wiring.AbstractGuiceAwareExecutableExtensionFactory;
import com.google.inject.Injector;

public class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ConversionPlugin.getDefault().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return ConversionPlugin.getDefault().getInjector();
	}

}
