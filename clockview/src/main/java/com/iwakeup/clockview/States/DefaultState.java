package com.iwakeup.clockview.States;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.iwakeup.clockview.R;


/**
 * Created by humin06 on 2018/12/20.
 */
public class DefaultState implements CircleState {
    @Override
    public void setText(TextView text) {
        text.setText(R.string.text);
        text.setTextColor(Color.parseColor("#4ACA6D"));
    }

    @Override
    public void setSignIcon(ImageView imageView) {
        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.mission_gray_sigin_icon);
    }

    @Override
    public void setCircle(RelativeLayout circle) {
        circle.setBackgroundResource(R.drawable.bg_circle_green_solid);
    }

    @Override
    public void setLine(View line) {
        line.setBackgroundColor(Color.parseColor("#4ACA6D"));
    }
}
