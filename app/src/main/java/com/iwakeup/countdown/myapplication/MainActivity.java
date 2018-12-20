package com.iwakeup.countdown.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  DayGroup group;
    // 连续打卡天数
    private int day=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signnowday = findViewById(R.id.signnowday);
        Button fixtext = findViewById(R.id.fixtext);
        Button nextday = findViewById(R.id.nextday);
        Button reset = findViewById(R.id.reset);
        signnowday.setOnClickListener(this);
        fixtext.setOnClickListener(this);
        nextday.setOnClickListener(this);
        reset.setOnClickListener(this);

        group = findViewById(R.id.group);
        group.addDays(6);

        setNowDay();
        continueSignedDay();

    }

    // 今日打卡状态,应打卡，却未打卡
    private void setNowDay(){
        group.setNowDay(day);
    }

    // 为今日打卡
    private void signNowDay(){
        group.setNowDaySinged(day);
    }

    // 设置连续打卡状态
    private void continueSignedDay(){
        for (int i = 0; i <day ; i++) {
            group.setDaysSigned(i);
        }
    }
    // 设置Day Text
    private void setDayText(int i,String text){
        group.getDayAt(i).setDayText(text);
    }

    // 下一天
    private void nextDay(){
        if (day<group.getDays()-1){
            day+=1;
            setNowDay();
            continueSignedDay();
        }
        else {
            Toast.makeText(this, "已经全部签到完成", Toast.LENGTH_SHORT).show();
        }
    }

    // 重置状态，所有Day恢复默认状态
    private void reset(){
        day=0;
        group.reset();
        setNowDay();
        continueSignedDay();

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.signnowday:
                signNowDay();
                break;
            case R.id.fixtext:
                setDayText(day,"今天");
                break;
            case R.id.nextday:
                nextDay();
                break;
            case R.id.reset:
                reset();
                break;
        }
    }


}
