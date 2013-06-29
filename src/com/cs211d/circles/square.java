package com.cs211d.circles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class square extends View
{
	Paint p = new Paint();
	public square(Context con)
    {
        super(con);
    }
	
	@Override
    public void onDraw(Canvas c)
    {
        super.onDraw(c);
    	int x2 = c.getWidth();
    	int y2 = c.getHeight(); 
        p.setColor(getResources().getColor(R.color.canvasBackground));
        p.setStyle(Paint.Style.FILL);       
        c.drawRect(0,0,x2,y2,p);
    }
}
