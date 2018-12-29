package com.iwakeup.countdown.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.iwakeup.countdown.myapplication.States.CircleState;
import com.iwakeup.countdown.myapplication.States.DefaultState;
import com.iwakeup.countdown.myapplication.States.NowDaySignedState;
import com.iwakeup.countdown.myapplication.States.NowDayState;
import com.iwakeup.countdown.myapplication.States.SignedState;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by humin06 on 2018/12/19.
 */
public class DayGroup extends LinearLayout {

    private List<Day> mDayList=new ArrayList<>();
    private CircleState signedState,nowDaySignedState,nowDayState,defaultState;
    private boolean mUseDefaultState=true;

    public DayGroup(Context context) {
        super(context);
        initView();
    }

    public DayGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public DayGroup(Context context,AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }



    private void initView(){
        setOrientation(LinearLayout.HORIZONTAL);
        setAllState();
    }

    public int getDays(){
       return mDayList.size();
    }


    private void setAllState(){
        if (mUseDefaultState){
            signedState=new SignedState();
            nowDaySignedState=new NowDaySignedState();
            nowDayState=new NowDayState();
            defaultState=new DefaultState();
        }
    }

    public void addDays(int num){
        for (int i = 0; i <num ; i++) {
            mDayList.add(new Day(getContext()));
            addView(mDayList.get(i));
        }
        mDayList.get(getDays()-1).hideLine();
    }


    public void setDaysSigned(int i){
        mDayList.get(i).setState(signedState);
    }
    public void setNowDay(int i){
        mDayList.get(i).setState(nowDayState);
    }

    public void setNowDaySinged(int i){
        mDayList.get(i).setState(nowDaySignedState);
    }


    public Day getDayAt(int i){
        return mDayList.get(i);
    }

    public void reset(){
        for (Day day: mDayList) {
            day.setState(defaultState);
        }
    }

    public void setCustomeState(CircleState signedState,CircleState nowDaySignedState,
                                CircleState nowDayState,CircleState defaultState){
        mUseDefaultState=false;
        this.signedState=signedState;
        this.nowDaySignedState=nowDaySignedState;
        this.nowDayState=nowDayState;
        this.defaultState=defaultState;
    }
}
