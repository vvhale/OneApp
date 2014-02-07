package ru.veloanapa.oneapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;

public class OneApp extends Activity {
// первый комит
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new DrawView(this));
	}
class DrawView extends View{
	public DrawView(Context context){
		super(context);
	}
protected void onDraw(Canvas canvas){
	canvas.drawColor(Color.BLUE);
}
	
}
	
	
	//@Override
	//public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	//	getMenuInflater().inflate(R.menu.one_app, menu);
	//	return true;
	//}

}
