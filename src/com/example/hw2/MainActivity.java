package com.example.hw2;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView mTextView = (TextView) findViewById(R.id.textView1);
        mTextView.setText("Brian Beehcer");

        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		mTextView.setText("You pushed the button!");
        		}
        	});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
