package com.iwakeup.countdown.myapplication.States;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.iwakeup.countdown.myapplication.R;

import static android.view.View.VISIBLE;

/**
 * Created by humin06 on 2018/12/20.
 */
public class SignedState implements CircleState {

    @Override
    public void setText(TextView text) {
        text.setTextColor(Color.GRAY);
    }

    @Override
    public void setSignIcon(ImageView imageView) {
        imageView.setVisibility(VISIBLE);
        imageView.setBackgroundResource(R.drawable.mission_gray_sigin_icon);
    }

    @Override
    public void setCircle(RelativeLayout circle) {
        circle.setBackgroundResource(R.drawable.bg_circle_gray);
    }

    @Override
    public void setLine(View line) {
        line.setBackgroundColor(Color.GRAY);
    }
}
