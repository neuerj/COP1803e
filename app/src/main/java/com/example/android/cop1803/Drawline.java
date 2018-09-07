package com.example.android.cop1803;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;

import java.security.AccessControlContext;
import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class Drawline {



    public void drawLines(List<LineView> mlinesToDraw,ArrayList<Button> buttonsbalance, Context
            context,Button btnbase,List<Triangle> mTriToDraw,ArrayList<Float> mRadius) {
        float Xcenter,Ycenter;
        float centerXringbutton,centerYringbutton;
        float xOuterring,yOuterring;
        float radiuscenter,radiousouter;
        float lengthCenterToCenter,lenthRadiusToRadius,radius,linelength;

        // clone
        ConstraintSet mConstraintSetarrow = new ConstraintSet(); // create a Constraint Set

        View view_instance = null;

        List<LineView> mLine = mlinesToDraw;
        List<Triangle> mTri = mTriToDraw;
        ArrayList<Button> btns = buttonsbalance;
        PointF pointA = null;
        PointF pointB=null;
        Context context1;
        Resources res=context.getResources();
        float angle,xOuterringEndpt,yOuterringEndpt;
        int theta;


        // get x,y coordinates and radius of center balance button
            Button buttoncenter = btnbase;
            radiuscenter=(buttoncenter.getWidth() / 2);  //cartesian radius
            Xcenter=buttoncenter.getLeft()+radiuscenter;
            Ycenter=buttoncenter.getTop()+radiuscenter;

            //float arrowWidth= (mTri.get(0).getWidth())/2;
           // float arrowHeight= (mTri.get(0).getHeight())/2;

        // loop through outer ring buttons and get their coordinates.
            for (int i = 0; i < mLine.size(); i++) {

                //get center of outer ring button
                Button ringbutton = btns.get(i );
                centerXringbutton = ringbutton.getWidth() / 2;
                centerYringbutton = (ringbutton.getHeight()) / 2;
                radiousouter=centerXringbutton;

                // outer ring button coordinates
                xOuterring = ringbutton.getLeft()+ centerXringbutton;
                yOuterring = ringbutton.getTop() + (centerYringbutton);

                //define center to center line distance
                lengthCenterToCenter= (float) Math.sqrt(Math.pow(xOuterring - Xcenter,2) + Math
                        .pow(yOuterring - Ycenter, 2));


               lenthRadiusToRadius= (float) lengthCenterToCenter-(radiousouter+radiuscenter);
               linelength=(float) (radiousouter+(lenthRadiusToRadius*.8));
               radius= linelength;
               mRadius.add(radius);


                //set coordinates and line angles
                switch (i) {
                    case 0:
                        //theta=105;
                        theta = theta = res.getInteger(R.integer.BCangle1) + 90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt = (float) (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA = new PointF(xOuterring, (float) yOuterring);
                        pointB = new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 1:
                        theta = res.getInteger(R.integer.BCangle2) + 90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt = (float) (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA = new PointF(xOuterring, (float) yOuterring);
                        pointB = new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 2:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle3) + 90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt = (float) (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA = new PointF(xOuterring, (float) yOuterring);
                        pointB = new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 3:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle4)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA= new PointF(xOuterring, (float) yOuterring);
                        pointB =new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 4:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle5)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA= new PointF(xOuterring, (float) yOuterring);
                        pointB =new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 5:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle6)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA= new PointF(xOuterring, (float) yOuterring);
                        pointB =new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 6:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle7)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA= new PointF(xOuterring, (float) yOuterring);
                        pointB =new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 7:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle8)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA= new PointF(xOuterring, (float) yOuterring);
                        pointB =new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 8:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle9)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA= new PointF(xOuterring, (float) yOuterring);
                        pointB =new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 9:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle10)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA= new PointF(xOuterring, (float) yOuterring);
                        pointB =new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 10:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle11)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA= new PointF(xOuterring, (float) yOuterring);
                        pointB =new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                    case 11:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle12)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(Math.PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(Math.PI * theta / 180.0)));
                        pointA= new PointF(xOuterring, (float) yOuterring);
                        pointB =new PointF(xOuterringEndpt, (float) yOuterringEndpt);
                        break;
                }
                        mLine.get(i).setPointA(pointA);
                        mLine.get(i).setPointB(pointB);
                        mLine.get(i).draw();
            }


     }

}

