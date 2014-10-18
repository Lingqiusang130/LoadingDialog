package com.example.loadingdialog;

import com.duguang.baseanimation.ui.customview.lodingdialog.LoadingDialog;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	LoadingDialog dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dialog = new LoadingDialog(this);
		
	}

	public void myClick(View v){
		switch (v.getId()) {
		case R.id.button1:
			dialog.show();
			break;

		default:
			break;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
