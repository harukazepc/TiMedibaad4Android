/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package tv.harukaze.ti.medibaad.android;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.util.TiConfig;

@Kroll.module(name="Timedibaad4android", id="tv.harukaze.ti.medibaad.android")
public class Timedibaad4androidModule extends KrollModule
{

	// Standard Debugging variables
	public static String AUID;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public Timedibaad4androidModule(TiContext tiContext) {
		super(tiContext);
	}

	// Methods
	@Kroll.method
	public void setAuid(String auid){
		AUID = auid;
	}

}
