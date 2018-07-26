/**
 * Copyright (C) 2018 1С-Рарус Капралов А.А.
 */
package com._rarus.dt.conversion.plugin.ui;

import org.eclipse.osgi.util.NLS;

/**
 * Данный класс - представитель локализации механизма строк в Eclipse.
 */
class Messages extends NLS {
	private static final String BUNDLE_NAME = "com._rarus.dt.conversion.plugin.ui.messages"; //$NON-NLS-1$

	public static String DataProcessingHandler_Error;
	public static String DataProcessingHandler_Error_not_common_module;
	public static String DataProcessingHandler_Error_not_convertation_module;

	public static String DataProcessingHandlerDialog_dialog_caption;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
