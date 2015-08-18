package com.example.egidijusgecius.test_urbanairship;

import android.app.Application;

import com.urbanairship.UAirship;

/**
 * Single Responsibility:
 *
 * //todo
 */
public class CustomApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		UAirship.takeOff(this);
	}
}
