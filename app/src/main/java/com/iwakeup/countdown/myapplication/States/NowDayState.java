package com.iwakeup.countdown.myapplication.States;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.iwakeup.countdown.myapplication.R;

/**
 * Created by humin06 on 2018/12/20.
 */
public class NowDayState implements CircleState {
    @Override
    public void setText(TextView text) {

    }

    @Override
    public void setSignIcon(ImageView imageView) {
        imageView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setCircle(RelativeLayout circle) {
        circle.setBackgroundResource(R.drawable.bg_circle_green);
    }

    @Override
    public void setLine(View line) {

    }
}
