package com.example.android.cop1803;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class TriangleView extends View {
    //private Paint paint = new Paint();
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);


    public TriangleView(Context context) {
        super(context);
        //   init();
    }

    public TriangleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //   init();
    }

    public TriangleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // init();
    }
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);

        int x= 30; int y= 30;int width=30;

        //int strokeWidth=50;// paint.setStrokeWidth(strokeWidth);

        int halfWidth = width / 2;

        int color=getContext().getColor(R.color.GradientEnd);
        paint.setColor(color);

        Path path = new Path();
        path.moveTo(x, y - halfWidth); // Top
        path.lineTo(x - halfWidth, y + halfWidth); // Bottom left
        path.lineTo(x + halfWidth, y + halfWidth); // Bottom right
        path.lineTo(x, y - halfWidth); // Back to Top
        path.close();
        canvas.drawPath(path, paint);

    }


    public void drawtri(){
        invalidate();
        requestLayout();
    }
}

