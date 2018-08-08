package ru.capralow.dt.conversion.plugin.ui;

import org.eclipse.core.runtime.Plugin;

import com._1c.g5.v8.dt.core.platform.IConfigurationProvider;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.wiring.AbstractServiceAwareModule;

/**
 * My plugin Guice module that is aware of DT IDE Services.
 */
public class ConversionExternalDependenciesModule extends AbstractServiceAwareModule {
	/**
	* Constructor of {@link ConversionExternalDependenciesModule}.
	*
	* @param bundle the parent bundle, cannot be {@code null}
	*/
	public ConversionExternalDependenciesModule(Plugin bundle)
	{
		super(bundle);
	}

	@Override
	protected void doConfigure() {
		// ������� ������ ������ ���������� IConfigurationProvider
		bind(IConfigurationProvider.class).toService();
		bind(IV8ProjectManager.class).toService();
	}

}
