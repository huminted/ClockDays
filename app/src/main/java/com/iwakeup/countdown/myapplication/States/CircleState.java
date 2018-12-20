package com.iwakeup.countdown.myapplication.States;


import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by humin06 on 2018/12/20.
 */
public interface CircleState {
    void setText(TextView text);
    void setSignIcon(ImageView imageView);
    void setCircle(RelativeLayout circle);
    void setLine(View line);
}
