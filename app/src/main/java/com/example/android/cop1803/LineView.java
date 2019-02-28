package com.example.android.cop1803;
//bview.getViewTreeObserver().removeOnGlobalLayoutListener(this);

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

public class LineView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private int lineID;
    private String lineName;
    int stroke;
    double theta,radiusmult;
    static final double radiusmainfactor=1;
    static final double radiusbalancefactor=.8;

    private PointF pointA= new PointF(0, 0);;
    private PointF pointB= new PointF(0, 0);;

    Canvas canvas=new Canvas();

    private PointF pointFinal= new PointF(0, 0);
    private PointF pointFinaltri= new PointF();
    Globals g =Globals.getInstance();
    AppBarNavBarHeight appBarNavBarHeight=new AppBarNavBarHeight();

    Resources res = getResources();
    float lineStrokePercent;
    static float lengthCenterToCenter;
    static float lenthRadiusToRadius;
    static float radiuscenter;
    static float radiousouter;

    public LineView(Context context) {
        super(context);
    }
    public LineView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayerType(View.LAYER_TYPE_HARDWARE, null);
        init();
    }
    /*public LineView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }*/
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
    }

    private void init(){
        int color;
        boolean tabletSize;

        lineID = getId();
        lineName = res.getResourceEntryName(lineID);
        color = ContextCompat.getColor(getContext(), R.color.GradientStart);
        paint.setColor(color);
        tabletSize = getResources().getBoolean(R.bool.isTablet);

        if(tabletSize){
            stroke=getResources().getInteger(R.integer.lineStrokeTablet);
            paint.setStrokeWidth(stroke);}
        else
        {
            stroke=getResources().getInteger(R.integer.lineStrokeSmartPhone);
            paint.setStrokeWidth(stroke); }
       }

   @SuppressLint("ResourceAsColor")
    public void onDraw(Canvas canvas) {
            super.onDraw(canvas);

       switch (lineName) {

           case "LineView1021":
               radiusmult=radiusmainfactor;
               pointA.set(g.getx100().x,g.getx100().y);
               pointB.set(g.getx21());
               final_line(pointA,pointB,canvas,radiusmainfactor);
           break;
           case "LineView1022":
               radiusmult=radiusmainfactor;
               pointA.set(g.getx100().x,g.getx100().y);
               pointB.set(g.getx22());
               final_line(pointA,pointB,canvas,radiusmainfactor);
           break;
           case "LineView1023":
               radiusmult=radiusmainfactor;
               pointA.set(g.getx100().x,g.getx100().y);
               pointB.set(g.getx23());
               final_line(pointA,pointB,canvas,radiusmainfactor);
           break;
           case "LineView1024":
               radiusmult=1;
               pointA.set(g.getx100().x,g.getx100().y);
               pointB.set(g.getx24());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView1025":
               radiusmult=1;
               pointA.set(g.getx100().x,g.getx100().y);
               pointB.set(g.getx25());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView1026":
               radiusmult=1;
               pointA.set(g.getx100().x,g.getx100().y);
               pointB.set(g.getx26());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView1027":
               radiusmult=1;
               pointA.set(g.getx100().x,g.getx100().y);
               pointB.set(g.getx27());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView2131":
               radiusmult=1;
               pointA.set(g.getx21());
               pointB.set(g.getx31());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView2231":
               radiusmult=1;
               pointA.set(g.getx22());
               pointB.set(g.getx31());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView2331":
               radiusmult=1;
               pointA.set(g.getx23());
               pointB.set(g.getx31());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView2431":
               radiusmult=1;
               pointA.set(g.getx24());
               pointB.set(g.getx31());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView2531":
               radiusmult=1;
               pointA.set(g.getx25());
               pointB.set(g.getx31());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView2631":
               radiusmult=1;
               pointA.set(g.getx26());
               pointB.set(g.getx31());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView2731":
               radiusmult=1;
               pointB.set(g.getx31());
               pointA.set(g.getx27());
               final_line(pointA,pointB,canvas,radiusmainfactor);
           case "LineView3141":
               radiusmult=1;
               pointA.set(g.getx31());
               pointB.set(g.getx41());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView3142":
               radiusmult=1;
               pointA.set(g.getx31());
               pointB.set(g.getx42());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView3143":
               radiusmult=1;
               pointA.set(g.getx31());
               pointB.set(g.getx43());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView3144":
               radiusmult=1;
               pointA.set(g.getx31());
               pointB.set(g.getx44());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;
           case "LineView3145":
               radiusmult=1;
               pointA.set(g.getx31());
               pointB.set(g.getx45());
               final_line(pointA,pointB,canvas,radiusmainfactor);
               break;

           //float offset=(8 * Resources.getSystem().getDisplayMetrics().density);

           case "LineViewb1":
                   pointA.set(g.getx1());  //outterringcenter
                   pointB.set(g.getx0());
                   final_line(pointA, pointB, canvas, radiusbalancefactor);
                   //pointFinaltri.set(pointFinal.x, pointFinal.y - g.getSB());

               ///need to add this line to the rest of the lines and fix the tablet version.
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
                   g.setx1tri(pointFinaltri);
                   g.setx1triAngle(theta);
             break;
           case "LineViewb2":
               pointA.set(g.getx2());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx2tri(pointFinaltri);
               g.setx2triAngle(theta);
               break;
           case "LineViewb3":
               pointA.set(g.getx3());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx3tri(pointFinaltri);
               g.setx3triAngle(theta);
               break;
           case "LineViewb4":
               pointA.set(g.getx4());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx4tri(pointFinaltri);
               g.setx4triAngle(theta);
               break;
           case "LineViewb5":
               pointA.set(g.getx5());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx5tri(pointFinaltri);
               g.setx5triAngle(theta);
               break;
           case "LineViewb6":
               pointA.set(g.getx6());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx6tri(pointFinaltri);
               g.setx6triAngle(theta);
               break;
           case "LineViewb7":
               pointA.set(g.getx7());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx7tri(pointFinaltri);
               g.setx7triAngle(theta);
               break;
           case "LineViewb8":
               pointA.set(g.getx8());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx8tri(pointFinaltri);
               g.setx8triAngle(theta);
               break;
           case "LineViewb9":
               pointA.set(g.getx9());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx9tri(pointFinaltri);
               g.setx9triAngle(theta);
               break;
           case "LineViewb10":
               pointA.set(g.getx10());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx10tri(pointFinaltri);
               g.setx10triAngle(theta);
               break;
           case "LineViewb11":
               pointA.set(g.getx11());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx11tri(pointFinaltri);
               g.setx11triAngle(theta);
               break;
           case "LineViewb12":
               pointA.set(g.getx12());  //outterringcenter
               pointB.set(g.getx0());
               final_line(pointA, pointB, canvas, radiusbalancefactor);
               pointFinaltri.set(pointFinal.x- appBarNavBarHeight.dpToPx(8), pointFinal.y - (g.getSB()*.5f));
               g.setx12tri(pointFinaltri);
               g.setx12triAngle(theta);
               break;
       }      /**/

       }

    private void final_line (PointF pointA,PointF pointB,Canvas canvas,double radiusmult){
        String parentname=getResources().getResourceEntryName(((View) this.getParent()).getId());
        float x=0,y=0;

        if(radiusmult!=1){
            double radius= (float) radiusfinal(pointA,pointB, radiusmult);
            theta=angleOf(pointA,pointB); //get theta from method angleOf
            x= (float) (pointA.x - radius * Math.cos(Math.toRadians(theta)));
            y= (float) (pointA.y + radius * Math.sin(Math.toRadians(theta)));
            pointFinal.set(x,y);}


            else
        {pointFinal.set(pointB.x,pointB.y);}

        if(parentname.contentEquals("mylayoutcustom") ){
            //pointFinal.set(x,y-g.getSB());
            canvas.drawLine(pointA.x, pointA.y-g.getSB(),  pointFinal.x,pointFinal.y-g.getSB(), paint);}

        else{
            canvas.drawLine(pointA.x- appBarNavBarHeight.dpToPx(8), pointA.y-g.getSB(),  pointFinal.x- appBarNavBarHeight.dpToPx(8),pointFinal.y-(g.getSB()*.5f), paint);
        }

    }


    public static double angleOf(PointF p1, PointF p2) {
        // NOTE: Remember that most math has the Y axis as positive above the X.
        // However, for screens we have Y as positive below. For this reason,
        // the Y values are inverted to get the expected results.
        final double deltaY = (p1.y - p2.y);
        //final double deltaY =-(p2.y - p1.y);
        final double deltaX = (p2.x - p1.x);
        double result = Math.toDegrees(Math.atan2(deltaY, deltaX))-180;
        if (result < 0) {
            result  += 360;
        }

        return result;
    }

    public  double radiusfinal(PointF p1, PointF p2,double radiusmult) {
        double radius;
        lengthCenterToCenter=(float) Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2 .y, 2));
        // line lentgh for arrow pointing towards center
        radiuscenter=g.getx0width()/2;
        radiousouter=g.getx00width()/2;
        lenthRadiusToRadius= (float) lengthCenterToCenter-(radiousouter+radiuscenter);
        radius=(float) (radiousouter+(lenthRadiusToRadius*radiusmult));
        return  radius;
    }

    /**
     * Calculates the angle from centerPt to targetPt in degrees.
     * The return should range from [0,360), rotating CLOCKWISE,
     * 0 and 360 degrees represents NORTH,
     * 90 degrees represents EAST, etc...
     *
     * Assumes all points are in the same coordinate space.  If they are not,
     * you will need to call SwingUtilities.convertPointToScreen or equivalent
     * on all arguments before passing them  to this function.
     *
     * @param centerPt   Point we are rotating around.
     * @param targetPt   Point we want to calcuate the angle to.
     * @return angle in degrees.  This is the angle from centerPt to targetPt.
     */
    /*public static double calcRotationAngleInDegrees(PointF centerPt, PointF targetPt)
    {
        // calculate the angle theta from the deltaY and deltaX values
        // (atan2 returns radians values from [-PI,PI])
        // 0 currently points EAST.
        // NOTE: By preserving Y and X param order to atan2,  we are expecting
        // a CLOCKWISE angle direction.
        double theta = Math.atan2( centerPt.y-targetPt.y,   targetPt.x-centerPt.x);

        // rotate the theta angle clockwise by 90 degrees
        // (this makes 0 point NORTH)
        // NOTE: adding to an angle rotates it clockwise.
        // subtracting would rotate it counter-clockwise
        theta += Math.PI/2.0;

        // convert from radians to degrees
        // this will give you an angle from [0->270],[-180,0]
        double angle = Math.toDegrees(theta);

        // convert to positive range [0-360)
        // since we want to prevent negative angles, adjust them now.
        // we can assume that atan2 will not return a negative value
        // greater than one partial rotation
        if (angle < 0) {
            angle += 360;
        }

        return angle;
    }*/

    }
      /* if(lineName.length()==12)
       {canvas.drawLine(locationstart[0], locationstart[1]-g.getSB(),  locationend[0],locationend[1]-g.getSB(), paint);}
       else
       {canvas.drawLine(locationstart[0], locationstart[1]-g.getSB(),  locationendfinal[0],locationendfinal[1]-g.getSB(), paint);}*/

       // canvas.drawLine(mXStart, mYStart, mXEnd, mYEnd, paint);

        //Trace.endSection();

    /**
     * Sets the coordinates of the line drawn.
     */
/*    public void setCoords(int xStart, int yStart, int xEnd, int yEnd) {
        mXStart = xStart;
        mYStart = yStart;
        mXEnd = xEnd;
        mYEnd = yEnd;
         }*/



