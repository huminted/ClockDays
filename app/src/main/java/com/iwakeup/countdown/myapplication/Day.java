package com.iwakeup.countdown.myapplication;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.iwakeup.countdown.myapplication.States.CircleState;
import com.iwakeup.countdown.myapplication.States.DefaultState;

/**
 * Created by humin06 on 2018/12/19.
 */
public class Day extends RelativeLayout {


    private View mLine;
    private RelativeLayout mCircle;
    private ImageView mSignIcon;
    private TextView mCircleText;

    public Day(Context context) {
        super(context);
        initView();
    }

    public Day(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public Day(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView(){
        View view=LayoutInflater.from(getContext()).inflate(R.layout.day,null);
        mLine=view.findViewById(R.id.next_line);
        mCircle=view.findViewById(R.id.bg_singin_circle);
        mSignIcon=view.findViewById(R.id.iv_icon_sigin);
        mCircleText=view.findViewById(R.id.tv_sigin_content1);
        this.addView(view);
    }

    public void hideLine(){
        mLine.setVisibility(GONE);
    }

    public void setState(CircleState circleState){
        circleState.setText(mCircleText);
        circleState.setCircle(mCircle);
        circleState.setLine(mLine);
        circleState.setSignIcon(mSignIcon);
    }


    public void setDayText(String text){
        mCircleText.setText(text);
    }



}
