package ru.capralow.dt.conversion.plugin.ui;

import java.util.Collection;

import com._1c.g5.v8.derived.computer.IDerivedDataComputer;
import com._1c.g5.v8.derived.computer.IDerivedDataRemover;
import com._1c.g5.v8.derived.context.IContextCollector;
import com._1c.g5.v8.derived.context.IRemovalContextCollector;
import com._1c.g5.v8.derived.context.ITypeSpecificObjectContextFactory;
import com._1c.g5.v8.derived.pipeline.DerivedDataSegmentDefinition;

public class ConversionModuleDataConfigurationContributor
		implements com._1c.g5.v8.derived.IDerivedDataConfigurationContributor {

	@Override
	public Collection<IDerivedDataComputer> getComputers() {
		return null;
	}

	@Override
	public Collection<IContextCollector> getContextCollectors() {
		return null;
	}

	@Override
	public Collection<ITypeSpecificObjectContextFactory> getContextFactories() {
		return null;
	}

	@Override
	public Collection<IRemovalContextCollector> getRemovalContextCollectors() {
		return null;
	}

	@Override
	public Collection<IDerivedDataRemover> getRemovers() {
		return null;
	}

	@Override
	public Collection<DerivedDataSegmentDefinition> getSegmentDefinitions() {
		return null;
	}

}
