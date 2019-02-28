package com.example.android.cop1803;

/**
 * Created by Neuer home on 1/28/2018.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by Windows on 07-01-2015.
 */
public class LayoutCustom extends ConstraintLayout {
    public static final String TAG="Jim";
    Paint paint=null;
    public LayoutCustom(Context context) {
        super(context);
//        View v=context.g
//        String caption=((Button)super.getViewById(getId())).getText();
        init();
    }

    public LayoutCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LayoutCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

       // init();
    }
    public void init(){
        paint=new Paint();

        paint.setAntiAlias(true);
        setWillNotDraw(false);

    }


    Globals g =Globals.getInstance();
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        switch (ev.getActionMasked())
        {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyLayout dispatchTouchEvent DOWN");
                g.setRecyclertouch(GlobalVariables.FALSE);
                break;
           /* case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyLayout dispatchTouchEvent MOVE");
                break;*/
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyLayout dispatchTouchEvent UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyLayout dispatchTouchEvent CANCEL");
                break;
        }
        boolean b=super.dispatchTouchEvent(ev);
        Log.d(TAG,"MyLayout dispatchTouchEvent RETURNS "+b);
        return b;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked())
        {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyLayout onInterceptTouchEvent DOWN");
                break;
           /* case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyLayout onInterceptTouchEvent MOVE");
                break;*/
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyLayout onInterceptTouchEvent UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyLayout onInterceptTouchEvent CANCEL");
                break;
        }
        boolean b=super.onInterceptTouchEvent(ev);
        Log.d(TAG,"MyLayout onInterceptTouchEvent RETURNS "+b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked())
        {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyLayout onTouchEvent DOWN");
                this.setPressed(true);
                break;
            /*case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyLayout onTouchEvent MOVE");
                break;*/
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyLayout onTouchEvent UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyLayout onTouchEvent CANCEL");
                break;
        }
        boolean b=super.onTouchEvent(event);
        Log.d(TAG,"MyLayout onTouchEvent RETURNS "+b);
        return b;


    }

  @Override
    protected void onDraw(Canvas canvas) {
      g.SetMainWindowWidth(getWidth());
  }


}


//    protected void onLayout(boolean changed, int l, int t, int r, int b) {
//        // show current-1, current, current+1
//        int count = 0;
//        for(int i = 1; i >= -1; i--) {
//            // determine index of child
//            // the mod does a modulo
//            int index =  getChildCount();
//            // position in row from left to right
//            this.getChildAt(index).layout(count*this.getWidth(), 0, (count+1)*this.getWidth(), height);
//            count++;
//        }
//        // scroll to middle view
//        this.scrollTo(getWidth(), 0);
//
//    }