/**
* This file was auto-generated by the Titanium Module SDK helper for Android
* Appcelerator Titanium Mobile
* Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
* Licensed under the terms of the Apache Public License
* Please see the LICENSE included with this distribution for details.
*
*/
package tv.harukaze.ti.medibaad.android;

import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.view.TiUIView;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.kroll.KrollDict;
import mediba.ad.sdk.android.openx.MasAdView;

public class MedibaadView extends TiUIView
{
	private MasAdView mad = null;

	// Constructor
	public MedibaadView(final TiViewProxy proxy) {
		super(proxy);
	    mad = new MasAdView(proxy.getActivity());
	    mad.setAuid(Timedibaad4androidModule.AUID);
	    mad.start();
//	    layout.addView(mad);
	    setNativeView(mad);
	}

	@Override
	public void processProperties(KrollDict d){
		super.processProperties(d);
	}
}