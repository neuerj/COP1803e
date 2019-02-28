package com.example.android.cop1803;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

import static com.example.android.cop1803.MainActivity.TAG;

/**
 * TODO: document your custom view class.
 */
public class MyViewbutton extends android.support.v7.widget.AppCompatButton {


    public MyViewbutton(Context context) {
        super(context);
centerpoint();
    }

    public MyViewbutton(Context context, AttributeSet attrs) {
        super(context, attrs);
centerpoint();
    }

    public MyViewbutton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    Globals g =Globals.getInstance();
    MainActivity mMainActivit = new MainActivity();
    int location[] = new int[2];
    //float bcoordinate[] = new float[2];
    private PointF pointbcoor=new PointF(0,0);
    private PointF pointbcoortest=new PointF(0,0);
    private PointF Pointloc = new PointF(0, 0);
    int lineID=0;
    String buttonname,parentname;
    float statusBarHeight;
    AppBarNavBarHeight appBarNavBarHeight=new AppBarNavBarHeight();

    private void centerpoint(){
        lineID = this.getId();
          buttonname = getResources().getResourceEntryName(lineID);
     }


    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        this.getLocationInWindow(location);
        float x= (float) location[0];
        float y= (float) location[1];
        Pointloc.set(x,y);

//        float buttonwidth=getWidth();
//        float buttonheight=getHeight();
//        float buttonwidth=this.getWidth();
//        float buttonheight=this.getHeight();

        parentname=getResources().getResourceEntryName(((View) this.getParent()).getId()).toString();//2131361982
        int offsetmult=1;
        if(parentname.contentEquals("mylayoutcustom") ){ offsetmult=0;}

        //pointbcoor.set((Pointloc.x + (getWidth() / 2)) - (appBarNavBarHeight.dpToPx(8)*offsetmult) ,Pointloc.y-statusBarHeight  + (getHeight()/2));
        pointbcoor.set((Pointloc.x + (getWidth() / 2)) - (appBarNavBarHeight.dpToPx(8)*offsetmult) ,Pointloc.y  + (getHeight()/2));


        switch (buttonname) {

            case "MainCOPbtn":
                statusBarHeight= (float) getstatusBarHeight();
                g.setSB(statusBarHeight);
                //pointbcoortest.set((Pointloc.x + (getWidth() / 2)) - (appBarNavBarHeight.dpToPx(8)*offsetmult),Pointloc.y+statusBarHeight  + (getHeight()/2));
                pointbcoor.set((Pointloc.x + (getWidth() / 2)) - (appBarNavBarHeight.dpToPx(8)*offsetmult),Pointloc.y  + (getHeight()/2));
                g.setx100(pointbcoor);

                break;
            case "x21":
                g.setx21(pointbcoor);
                break;
            case "x22":
                g.setx22(pointbcoor);
                break;
            case "x23":
                g.setx23(pointbcoor);
                break;
            case "x24":
                g.setx24(pointbcoor);
                break;
            case "x25":
                g.setx25(pointbcoor);
                break;
            case "x26":
                g.setx26(pointbcoor);
                break;
            case "x27":
                g.setx27(pointbcoor);
                break;
            case "x31":
                g.setx31(pointbcoor);
                break;
            case "x41":
                g.setx41(pointbcoor);
                break;
            case "x42":
                g.setx42(pointbcoor);
                break;
            case "x43":
                g.setx43(pointbcoor);
                break;
            case "x44":
                g.setx44(pointbcoor);
                break;
            case "x45":
                g.setx45(pointbcoor);
                break;


            case "x0":
                g.setx0(pointbcoor);
                g.setx0width(getWidth());
                break;
            case "x1":
                g.setx1(pointbcoor);
                g.setx00width(getWidth());
                break;
                //1920
            //mwindowleft=262
            case "x2":
                g.setx2(pointbcoor);
                break;
            case "x3":
                g.setx3(pointbcoor);
                break;
            case "x4":
                g.setx4(pointbcoor);
                break;
            case "x5":
                g.setx5(pointbcoor);
                break;
            case "x6":
                g.setx6(pointbcoor);
                break;
            case "x7":
                g.setx7(pointbcoor);
                break;
            case "x8":
                g.setx8(pointbcoor);
                break;
            case "x9":
                g.setx9(pointbcoor);
                break;
            case "x10":
                g.setx10(pointbcoor);
                break;
            case "x11":
                g.setx11(pointbcoor);
                break;
            case "x12":
                g.setx12(pointbcoor);
                break;
            default:
                break;
        }

    }


    @Override
        public boolean dispatchTouchEvent(MotionEvent event) {
            switch (event.getActionMasked())
            {
                case MotionEvent.ACTION_DOWN:
                    Log.d(TAG, "View dispatchTouchEvent DOWN");
                    String aa= String.valueOf(MyViewbutton.this.getText());
                    g.setJustclicked(aa);
                    g.setButtontouch(GlobalVariables.TRUE);

                    break;
              /*  case MotionEvent.ACTION_MOVE:
                    Log.d(TAG, "View dispatchTouchEvent MOVE");
                    break;*/
                case MotionEvent.ACTION_UP:
                    Log.d(TAG, "View dispatchTouchEvent UP");

                    break;
                case MotionEvent.ACTION_CANCEL:
                    Log.d(TAG, "View dispatchTouchEvent CANCEL");
                    break;
            }
            boolean b=super.dispatchTouchEvent(event);
            Log.d(TAG,"View dispatchTouchEvent RETURNS "+b);
            return b;
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            switch (event.getActionMasked())
            {
                case MotionEvent.ACTION_DOWN:
                    Log.d(TAG, "View onTouchEvent DOWN");
                   this.setPressed(true);
                    break;
              /* case MotionEvent.ACTION_MOVE:

                    Log.d(TAG, "View onTouchEvent MOVE");
                    break;*/
                case MotionEvent.ACTION_UP:
                    Log.d(TAG, "View onTouchEvent UP");
                    break;
                case MotionEvent.ACTION_CANCEL:
                    Log.d(TAG, "View onTouchEvent CANCEL");
                    break;
            }
            boolean b=super.onTouchEvent(event);
            Log.d(TAG,"View onTouchEvent RETURNS "+b);
            return b;
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
    public int getstatusBarHeight () {
        Rect rectangle = new Rect();
        Window window = ((Activity) getContext()).getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(rectangle);
        int statusBarHeight = rectangle.top;
       return statusBarHeight;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.v(buttonname+" Button onMeasure w", MeasureSpec.toString(widthMeasureSpec));
        Log.v(buttonname+"Button onMeasure h", MeasureSpec.toString(heightMeasureSpec));

        int desiredWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int desiredHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();

        setMeasuredDimension(measureDimension(desiredWidth, widthMeasureSpec),
                measureDimension(desiredHeight, heightMeasureSpec));
    }
    private int measureDimension(int desiredSize, int measureSpec) {
        int result;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else {
            result = desiredSize;
            if (specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }

        if (result < desiredSize){
            Log.e("Button "+buttonname, "The view is too small, the content might get cut");
        }
        return result;
    }
}



