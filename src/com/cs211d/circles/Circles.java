package com.cs211d.circles;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;


public class Circles extends Activity
{
    
	
    /*******displayCircle()******************/
    public void displayCircle(View v)	
    {
    	FrameLayout fl = (FrameLayout)findViewById(R.id.container);
    	fl.addView(new DrawCircle(this)); 	
    }
    
    /*******clearScreen()******************/
    public void clearScreen(View v)
    {
    	FrameLayout fl = (FrameLayout)findViewById(R.id.container);
    	fl.addView(new square(this));
    }
    
    @Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
			
	}	

}
