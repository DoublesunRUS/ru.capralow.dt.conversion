package ru.capralow.dt.conversion.plugin.ui.editors;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;

import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.resource.BslResource;
import com._1c.g5.v8.dt.bsl.resource.DynamicFeatureAccessComputer;
import com._1c.g5.v8.dt.bsl.scoping.BslCachedScopeProvider;
import com._1c.g5.v8.dt.lcore.validation.NotifyingResourceValidator;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

/**
 * Delegating {@link org.eclipse.xtext.validation.IResourceValidator}
 * implementation that notifies its listeners upon validation completion.
 */
@Singleton
public class ConversionResourceValidator extends NotifyingResourceValidator {
	@Inject
	private BslCachedScopeProvider cacheScopeProvider;

	@Inject
	private DynamicFeatureAccessComputer dynamicFeatureComputer;

	/**
	 * Constructor
	 * 
	 * @param injector
	 *            actual plugin injector, can't be <code>null</code>
	 */
	@Inject
	public ConversionResourceValidator(Injector injector) {
		super(injector);
	}

	@Override
	public List<Issue> validate(Resource resource, CheckMode mode, CancelIndicator indicator) {
		indicator = indicator == null ? CancelIndicator.NullImpl : indicator;
		CheckMode newMode = resource instanceof BslResource && ((BslResource) resource).isDeepAnalysing()
				? CheckMode.ALL
				: mode;
		try {
			return super.validate(resource, newMode, indicator);

		} finally {
			if (!resource.getContents().isEmpty() && resource.getContents().get(0) instanceof Module) {
				cacheScopeProvider.clearScopes((Module) resource.getContents().get(0));
			}
			dynamicFeatureComputer.clearCachedValues();
		}

	}

	@Override
	protected void resolveProxies(final Resource resource, final CancelIndicator monitor) {
		// Нечего делать
	}

	@Override
	protected void notifyListeners(Resource resource, List<Issue> issues) {
		// Нечего делать
	}
}
