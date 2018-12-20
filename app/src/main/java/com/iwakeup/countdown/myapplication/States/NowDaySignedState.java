package com.iwakeup.countdown.myapplication.States;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.iwakeup.countdown.myapplication.R;



/**
 * Created by humin06 on 2018/12/20.
 */
public class NowDaySignedState implements CircleState {
    @Override
    public void setText(TextView text) {

    }

    @Override
    public void setSignIcon(ImageView imageView) {
        imageView.setVisibility(View.VISIBLE);
        imageView.setBackgroundResource(R.drawable.mission_green_sigin_icon);

        ObjectAnimator alpha=ObjectAnimator.ofFloat(imageView,"alpha",0,1);
        ObjectAnimator scaleX=ObjectAnimator.ofFloat(imageView,"scaleX",0,1);
        ObjectAnimator scaleY=ObjectAnimator.ofFloat(imageView,"scaleY",0,1);

        AnimatorSet set=new AnimatorSet();
        set.playTogether(alpha,scaleX,scaleY);
        set.setDuration(500);
        set.start();
    }

    @Override
    public void setCircle(RelativeLayout circle) {
        circle.setBackgroundResource(R.drawable.bg_circle_green);
    }

    @Override
    public void setLine(View line) {

    }
}
