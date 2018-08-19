package ru.capralow.dt.conversion.plugin.ui;

import org.eclipse.core.runtime.Plugin;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.wiring.AbstractServiceAwareModule;

public class ConversionExternalDependenciesModule extends AbstractServiceAwareModule {

	public ConversionExternalDependenciesModule(Plugin bundle) {
		super(bundle);
	}

	@Override
	protected void doConfigure() {
		bind(IV8ProjectManager.class).toService();
		bind(IBmEmfIndexManager.class).toService();
	}

}
