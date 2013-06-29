package com.cs211d.circles;

import android.graphics.*;
import android.view.View;
import android.content.Context;

public class DrawCircle extends View
{
     Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
     int width,height;
	
     /***************rand()*******************/
	public int rand(int a, int b)
	{
	   return((int)((b-a+1)*Math.random() + a));
	} 
	 
    /****************DrawCircle()*****************/
	public DrawCircle(Context con)
     {
         super(con);
     }
     
	@Override
     public void onDraw(Canvas c)
     {
         super.onDraw(c);
     	 width = c.getWidth();
     	 height = c.getHeight();

         int co =  Color.rgb(rand(0,255), rand(0,255), rand(0,255));
         p.setColor(co);
         p.setStyle(Paint.Style.FILL);       
         c.drawCircle(rand(70,width), rand(70,height), 70, p);
     }
}

