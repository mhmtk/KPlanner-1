package com.hornets.kplanner;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
	/*
	 * method for mehmet's test button to call for test purposes
	 */
	public void testMehmet(View view)
	{
		Intent intent = new Intent(this, ExpensesActivity.class);
		startActivity(intent);
	}
	/*
	 * method to test my Income button.
	 */
	
	public void testIncomeCall(View view) {
		Intent intent = new Intent(this, IncomeActivity.class);
		startActivity(intent);		
	}
    
}	