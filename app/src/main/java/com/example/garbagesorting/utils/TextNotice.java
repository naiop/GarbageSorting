package com.example.garbagesorting.utils;


import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * ================================================
 * 作    者：FuYG Github地址：https://github.com/naiop
 * 创建日期：21/10/5
 * 描    述： 重写TextNotice
 * 功    能：重写TextNotice实现跑马灯效果textview
 * ================================================
 */
@SuppressLint("AppCompatCustomView")
public class TextNotice extends TextView {
    public TextNotice(Context context) {
        super(context);
    }

    public TextNotice(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    public TextNotice(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isFocused() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override//去掉焦点
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        if(hasWindowFocus) {
            super.onWindowFocusChanged(hasWindowFocus);
        }
    }




//  XML 的引用
/*    <com.example.demo.utils.TextNotice
    android:layout_marginLeft="10dp"
    android:layout_marginRight="10dp"
    android:id="@+id/text_id"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textColor="#fff544b4"
    android:singleLine="true"
    android:ellipsize="marquee"
    android:focusable="true"
    android:focusableInTouchMode="true"
    android:marqueeRepeatLimit="marquee_forever" />*/
}

