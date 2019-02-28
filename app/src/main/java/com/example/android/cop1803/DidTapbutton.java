package com.example.android.cop1803;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class DidTapbutton {
    public void Buttonbounce(View view, Button button, Context context) {
        //Button button = (Button)findViewById(R.id.button);

        final Animation myAnim = AnimationUtils.loadAnimation(context, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 30);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
    }

}
