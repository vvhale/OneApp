package ru.veloanapa.oneapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class OneApp extends Activity {
// первый комит
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one_app);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.one_app, menu);
		return true;
	}

}
