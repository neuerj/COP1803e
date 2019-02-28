package com.example.android.cop1803;

import android.app.Application;

public class MyApplication extends Application {






    /*private static MyApplication mInstance;
    public static final String TAG = MyApplication.class
            .getSimpleName();

    private RequestQueue mRequestQueue;



    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

    }
    public static MyApplication get() {
        return mInstance;
    }
   // public static synchronized MyApplication getInstance() {
      //  return mInstance;
 //  }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }

        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req, String tag) {
        // set the default tag if tag is empty
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(req);
    }

    public <T> void addToRequestQueue(Request<T> req) {
        req.setTag(TAG);
        getRequestQueue().add(req);
    }

    public void cancelPendingRequests(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }*/
}
