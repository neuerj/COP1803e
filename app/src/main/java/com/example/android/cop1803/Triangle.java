package com.example.android.cop1803;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

public class Triangle extends View {
   private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
   private Path path=new Path();
   private  int x,y,width,stroke;
   private  float strokesegment,strokeoffsetx,strokeoffsety;
    Globals g =Globals.getInstance();
    Resources res = getResources();
    private PointF pointtri= new PointF(0, 0);
    int triID;
    String triName;
    Matrix mMatrix = new Matrix();
    RectF bounds = new RectF();
    double rotate;
    int flag=0;


    public Triangle(Context context) {
        super(context);
      }

    public Triangle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
         }

    private void init(){
        triID = this.getId();
        triName = res.getResourceEntryName(triID);
        int color = ContextCompat.getColor(getContext(), R.color.GradientStart);
        paint.setColor(color);
        paint.setAntiAlias(true);
        paint.setDither(true);
        boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
        if(tabletSize){
            stroke=getResources().getInteger(R.integer.lineStrokeTablet);
            width=30;
            }
        else{
            stroke=getResources().getInteger(R.integer.lineStrokeSmartPhone);
            width=25;
            }
        strokesegment=stroke/6;
        paint.setStrokeWidth(stroke);
      }

    public void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        switch (triName) {
            case "triangle1":
                setTriCoords(g.getx1tri().x, g.getx1tri().y, g.getx1triAngle(), canvas);
            case "triangle2":
                setTriCoords(g.getx2tri().x, g.getx2tri().y, g.getx2triAngle(), canvas);
            case "triangle3":
                setTriCoords(g.getx3tri().x, g.getx3tri().y, g.getx3triAngle(), canvas);
            case "triangle4":
                setTriCoords(g.getx4tri().x, g.getx4tri().y, g.getx4triAngle(), canvas);
            case "triangle5":
                setTriCoords(g.getx5tri().x, g.getx5tri().y, g.getx5triAngle(), canvas);
            case "triangle6":
                setTriCoords(g.getx6tri().x, g.getx6tri().y, g.getx6triAngle(), canvas);
            case "triangle7":
                setTriCoords(g.getx7tri().x, g.getx7tri().y, g.getx7triAngle(), canvas);
            case "triangle8":
                setTriCoords(g.getx8tri().x, g.getx8tri().y, g.getx8triAngle(), canvas);
            case "triangle9":
                setTriCoords(g.getx9tri().x, g.getx9tri().y, g.getx9triAngle(), canvas);
            case "triangle10":
                setTriCoords(g.getx10tri().x, g.getx10tri().y, g.getx10triAngle(), canvas);
            case "triangle11":
                setTriCoords(g.getx11tri().x, g.getx11tri().y, g.getx11triAngle(), canvas);
            case "triangle12":
                setTriCoords(g.getx12tri().x, g.getx12tri().y, g.getx12triAngle(), canvas);
        }


   }
    public void setTriCoords(float x,float y,double angle,Canvas canvas) {
        int halfWidth;
        Matrix mMatrix = new Matrix();
        RectF bounds = new RectF();
        float xpassed,ypassed,dx1,dy1,dx2,dy2,dx3,dy3;
        double rotate,theta1;
        flag+=1;
        PointF t1 = new PointF();
        PointF t2 = new PointF();
        PointF t3 =  new PointF();





        xpassed=x;
        ypassed=y;
        theta1=angle;

                halfWidth = width / 2;
                dx1 = (float) (halfWidth * Math.cos(Math.toRadians(theta1 + 90)));
                dy1 = (float) (halfWidth * Math.sin(Math.toRadians(theta1 + 90))) * -1;
                t1.set(xpassed + dx1, ypassed + dy1);


                dx2 = (float) (halfWidth * Math.cos(Math.toRadians(theta1 + 180)));
                dy2 = (float) (halfWidth * Math.sin(Math.toRadians(theta1 + 180))) * -1;
                t2.set(xpassed + dx2, ypassed + dy2);

                dx3 = (float) (halfWidth * Math.cos(Math.toRadians(theta1 + 270)));
                dy3 = (float) (halfWidth * Math.sin(Math.toRadians(theta1 + 270))) * -1;
                t3.set(xpassed + dx3, ypassed + dy3);


        path.moveTo(t1.x, t1.y); // Top
        path.lineTo(t2.x, t2.y); // Bottom left
        path.lineTo(t3.x, t3.y); // Bottom right
        path.lineTo(t1.x, t1.y ); // Back to Top
        path.close();
        // Top


      /*  */
/*
       halfWidth = width / 2;
       path.moveTo(xpassed, ypassed - halfWidth); // Top
       path.lineTo(xpassed - halfWidth, ypassed + halfWidth); // Bottom left
       path.lineTo(xpassed + halfWidth, ypassed + halfWidth); // Bottom right
       path.lineTo(xpassed, ypassed - halfWidth); // Back to Top
       path.close();*/

/*       rotate=angle;
       path.computeBounds(bounds, true);
       mMatrix.postRotate((float) rotate, bounds.centerX(), bounds.centerY());
       path.transform(mMatrix);*/
       canvas.drawPath(path,paint);
       //path.reset();
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



}
