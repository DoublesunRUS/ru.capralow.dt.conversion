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
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public Collection<IContextCollector> getContextCollectors() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public Collection<ITypeSpecificObjectContextFactory> getContextFactories() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public Collection<IRemovalContextCollector> getRemovalContextCollectors() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public Collection<IDerivedDataRemover> getRemovers() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public Collection<DerivedDataSegmentDefinition> getSegmentDefinitions() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

}
