# ClockDays 打卡控件

![](https://github.com/huminted/ClockDays/blob/master/pic.png?raw=true)

前两个为`setDaysSigned()下已经打卡的状态`，第三个为 `setNowDaySinged()`今日状态，  后为默认未打卡状态  

下方为`setNowDay()`状态

![](https://github.com/huminted/ClockDays/blob/master/pic_nowday.png?raw=true)







##### 1.引用

```





```

##### 2.使用

###### 2.1 Layout

```xml
<com.iwakeup.countdown.myapplication.DayGroup
        android:id="@+id/group"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:gravity="center"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"></com.iwakeup.countdown.myapplication.DayGroup>
```

###### 2.2 Activity

```java
 DayGroup group = findViewById(R.id.group);
 group.addDays(6); 
```

> 添加Day

```java
group.addDays(6); 
```

> 获得Day

```java
group.getDayAt(0)
```

> 给特定Day设置文字

```java
group.getDayAt(0).setDayText("Text");
```

> 给Day设置不同的状态

```java
// 今日状态,应打卡,但未打卡
group.setNowDay(0);

// 今日状态,打卡成功的状态
group.setNowDaySinged(0);

// 往日所有打卡成功的状态，
group.setDaysSigned(0);
```



##### 3.自定义状态

###### 1.分别实现四种个性化状态，继承至CircleState

```java
/**
 * Created by humin06 on 2018/12/20.
 */
public class SignedState implements CircleState {

    @Override
    public void setText(TextView text) {
        // 中心的文字
        text.setTextColor(Color.GRAY);
    }

    @Override
    public void setSignIcon(ImageView imageView) {
        // 签到的右下角小图标
        imageView.setVisibility(VISIBLE);
        imageView.setBackgroundResource(R.drawable.mission_gray_sigin_icon);
    }

    @Override
    public void setCircle(RelativeLayout circle) {
        // 每个Day的背景
        circle.setBackgroundResource(R.drawable.bg_circle_gray);
    }

    @Override
    public void setLine(View line) {
        // 每个Day的连接线
        line.setBackgroundColor(Color.GRAY);
    }
}

```

##### 2.DayGroup 加载自定义的状态

```java
group.setCustomeState(
CircleState signedState, 		// 已经打卡成功的状态
CircleState nowDaySignedState,  // 当日打卡成功的状态
CircleState nowDayState,		// 当日未打卡的状态
CircleState defaultState)		// 未来天数的状态
```

