package com.example.android.cop1803;

/**
 * Created by Neuer home on 12/22/2017.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.support.v7.widget.RecyclerView;

public class MyRecyclerView extends RecyclerView {
    private static final String TAG = "MainActivity";

    public MyRecyclerView(Context context) {
        super(context);
    }

    public MyRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecyclerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    Globals g =Globals.getInstance();
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked())
        {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyRecycler dispatchTouchEvent DOWN");
                g.setRecyclertouch(GlobalVariables.TRUE);
                break;
           case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyRecycler dispatchTouchEvent MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyRecycler dispatchTouchEvent UP");
                
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyRecycler dispatchTouchEvent CANCEL");
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
                Log.d(TAG, "MyRecycler onInterceptTouchEvent DOWN");
                break;
          /*  case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyRecycler onInterceptTouchEvent MOVE");
                break;*/
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyRecycler onInterceptTouchEvent UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyRecycler onInterceptTouchEvent CANCEL");
                break;
        }
        boolean b=super.onInterceptTouchEvent(ev);
        Log.d(TAG,"MyRecycler onInterceptTouchEvent RETURNS "+b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked())
        {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyRecycler onTouchEvent DOWN");
                break;
            /*case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyRecycler onTouchEvent MOVE");
                break;*/
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyRecycler onTouchEvent UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyRecycler onTouchEvent CANCEL");
                break;
        }
        boolean b=super.onTouchEvent(event);
        Log.d(TAG,"MyRecycler onTouchEvent RETURNS "+b);
        return b;
    }
}
