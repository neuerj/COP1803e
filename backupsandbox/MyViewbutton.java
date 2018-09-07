package com.example.android.cop1803;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import static com.example.android.cop1803.MainActivity.TAG;

/**
 * TODO: document your custom view class.
 */
public class MyViewbutton extends android.support.v7.widget.AppCompatButton {


    public MyViewbutton(Context context) {
        super(context);

    }

    public MyViewbutton(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public MyViewbutton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

        @Override
        public boolean dispatchTouchEvent(MotionEvent event) {
            switch (event.getActionMasked())
            {
                case MotionEvent.ACTION_DOWN:
                    Log.d(TAG, "View dispatchTouchEvent DOWN");
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



}



