package com.example.exercicio2_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b1 = (Button)findViewById(R.id.button1);
		Button b2 = (Button)findViewById(R.id.button2);
		b1.setOnClickListener(new Toaster());
		b2.setOnClickListener(new Toaster());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private class Toaster implements OnClickListener {

		@Override
		public void onClick(View v) {
			int idButton = v.getId();
			String text = "";
			if(idButton == R.id.button1){
				text = "Hello!";
			}else if(idButton == R.id.button2){
				text = "Goodbye!";
			}
			
			Toast tempMessage = Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT);
			tempMessage.show();		
		}	
	}

}
