/*package com.example.android.cop1803;

import android.content.Context;
import android.content.res.Resources;
import android.os.Trace;
import android.support.constraint.ConstraintSet;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.PI;

public class Drawline {*/



/*   public void drawLines(List<LineView> mlinesToDraw, ArrayList<Button> buttonsbalance, Context
            context, Button btnbase, List<Triangle> mTriToDraw, ArrayList<Float> mRadius) {
        float Xcenter,Ycenter;
        float centerXringbutton,centerYringbutton;
        float xOuterring;
       float yOuterring;
       float radiuscenter,radiousouter;
        float lengthCenterToCenter,lenthRadiusToRadius,radius,linelength;

        // clone
        ConstraintSet mConstraintSetarrow = new ConstraintSet(); // create a Constraint Set

        View view_instance = null;

        List<LineView> mLine = mlinesToDraw;
        List<Triangle> mTri = mTriToDraw;
        ArrayList<Button> btns = buttonsbalance;
        Resources res=context.getResources();
        float angle,xOuterringEndpt=0,yOuterringEndpt=0;
        int theta=0;
        int thetatri=0;
        int strokeoffsetx=0;
        int strokeoffsety=0;
        int stroke=0;



        // get x,y coordinates and radius of center balance button
            Button buttoncenter = btnbase;
            radiuscenter=(buttoncenter.getWidth() / 2);  //cartesian radius
            Xcenter=buttoncenter.getLeft()+radiuscenter;
            Ycenter=buttoncenter.getTop()+radiuscenter;

            //float arrowWidth= (mTri.get(0).getWidth())/2;
           // float arrowHeight= (mTri.get(0).getHeight())/2;

        // loop through outer ring buttons and get their coordinates.

        for (int i = 0; i < mLine.size(); i++) {
   Trace.beginSection("DrawLineLoop");
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

                // line for arrow pointing towards center
               lenthRadiusToRadius= (float) lengthCenterToCenter-(radiousouter+radiuscenter);
               linelength=(float) (radiousouter+(lenthRadiusToRadius*.8));
               radius= linelength;
               mRadius.add(radius);

               boolean tabletSize = res.getBoolean(R.bool.isTablet);
                if(tabletSize)
                {stroke=res.getInteger(R.integer.lineStrokeTablet);}
                else
                {stroke=res.getInteger(R.integer.lineStrokeSmartPhone);}
                int strokesegment=stroke/6;
            //To convert from Polar Coordinates (r,θ) to Cartesian Coordinates (x,y) :
                //x = r × cos( θ )
                //y = r × sin( θ )

                //set coordinates and line angles
                switch (i) {
                    case 0:
                        //theta=105;
                        theta =  res.getInteger(R.integer.BCangle1) +90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta /180.0)));
                        yOuterringEndpt = (float) (yOuterring + (radius * Math.sin(PI * theta /180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle1);
                        strokeoffsetx=strokesegment*5;
                        strokeoffsety=strokesegment*1;
                        break;
                    case 1:
                        theta = res.getInteger(R.integer.BCangle2) + 90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt = (float) (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle2);
                        strokeoffsetx=strokesegment*4;
                        strokeoffsety=strokesegment*2;
                        break;
                    case 2:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle3) + 90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt = (float) (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle3);
                        strokeoffsetx=strokesegment*3;
                        strokeoffsety=strokesegment*3;
                        break;
                    case 3:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle4)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle4);
                        strokeoffsetx=strokesegment*3;
                        strokeoffsety=strokesegment*3;
                       break;
                    case 4:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle5)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle5);
                        strokeoffsetx=strokesegment*-2;
                        strokeoffsety=strokesegment*4;
                        break;
                    case 5:
                        //theta=105;
                        theta = res.getInteger(R.integer.BCangle6)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle6);
                        strokeoffsetx=strokesegment*-5;
                        strokeoffsety=strokesegment*1;
                        break;

                    case 6:
                        //Color Pigment
                        theta = res.getInteger(R.integer.BCangle7)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle7);
                        strokeoffsetx=strokesegment*-5;
                        strokeoffsety=strokesegment*1;
                        break;

                    case 7:
                        //shape
                        theta = res.getInteger(R.integer.BCangle8)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle8);
                        strokeoffsetx=strokesegment*-4;
                        strokeoffsety=strokesegment*2;
                        break;
                    case 8:
                        //theta=Aromatic
                        theta = res.getInteger(R.integer.BCangle9)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle9);
                        strokeoffsetx=strokesegment*-6;
                        strokeoffsety=strokesegment*0;
                        break;
                    case 9:
                        //Hot warm cold
                        theta = res.getInteger(R.integer.BCangle10)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle10);
                        strokeoffsetx=strokesegment*-3;
                        strokeoffsety=strokesegment*-4;
                        break;
                    case 10:
                        //tender soft
                        theta = res.getInteger(R.integer.BCangle11)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle11);
                        strokeoffsetx=strokesegment*-1;
                        strokeoffsety=strokesegment*-5;

                       break;
                    case 11:
                        //Crispy crunchy
                        theta = res.getInteger(R.integer.BCangle12)+90;
                        xOuterringEndpt = (float) (xOuterring + (radius * Math.cos(PI * theta / 180.0)));
                        yOuterringEndpt= (float)  (yOuterring + (radius * Math.sin(PI * theta / 180.0)));
                        thetatri=res.getInteger(R.integer.BCtriangle12);
                        strokeoffsetx=strokesegment*1;
                        strokeoffsety=strokesegment*-3;
                        break;
                }

                int xOuterringfinal=(int) xOuterring;
                int yOuterringfinal=(int) yOuterring;
                int xOuterringEndptfinal=(int) xOuterringEndpt;
                int yOuterringEndptfinal=(int) yOuterringEndpt;

Trace.endSection();*/
//                mLine.get(i).setCoords(xOuterringfinal, yOuterringfinal, xOuterringEndptfinal,yOuterringEndptfinal);
                //mTri.get(i).setTriCoords(xOuterringEndptfinal+strokeoffsetx,
                       // yOuterringEndptfinal+strokeoffsety,30,thetatri);

                //mTri.get(i).setRotation(30f);


                // mTri.get(i).setTriCoords(250,30,30);
//            }
//
//
//     }
//
//}

