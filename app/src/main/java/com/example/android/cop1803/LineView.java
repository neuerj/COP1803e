package com.example.android.cop1803;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

public class LineView extends View {
   private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
   private PointF pointA;
    public PointF pointB;
    Globals g =Globals.getInstance();
    Resources res = getResources();
   float lineStrokePercent;

//    private void init() {
//        paint.setColor(Color.BLACK);
//    }

    public LineView(Context context) {
        super(context);
     //   init();
    }

    public LineView(Context context, AttributeSet attrs) {
        super(context, attrs);
     //   init();
    }

    public LineView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
       // init();
    }

    @Override
    public Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        // Save current View's state here
        return bundle;
    }

    @Override
    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(state);
        // Restore View's state here

    }



    @SuppressLint("ResourceAsColor")
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int color = ContextCompat.getColor(getContext(), R.color.GradientStart);
        paint.setColor(color);
        paint.setAntiAlias(true);
        float btnwidth=g.getBtn0width();
        String viewbeingdrawn=g.getViewlinesbeingdrawn();
        if (viewbeingdrawn.equals("mainview")) {lineStrokePercent =(float) res.getInteger(R.integer.lineStrokePercentMain);}
        if (viewbeingdrawn.equals("balanceview")) {
            lineStrokePercent =(float) res.getInteger(R.integer.lineStrokePercentBalance);}

        if(btnwidth>0) {
            float lineStrokePconversion = (float) (lineStrokePercent * .01);
            float lineStroke = (float) lineStrokePconversion * btnwidth;
            paint.setStrokeWidth(lineStroke);
        }


      //  paint.setColor(Color.BLUE);

        //canvas.drawLine(x1, y1, x2, y2, paint);
        canvas.drawLine(pointA.x, pointA.y, pointB.x, pointB.y, paint);



    }
    public void setPointA(PointF point){
            pointA=point;}
    public void setPointB(PointF point){
        pointB=point;}

    public void draw(){
        invalidate();
        requestLayout();
    }}

