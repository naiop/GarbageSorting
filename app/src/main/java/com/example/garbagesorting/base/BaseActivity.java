package com.example.garbagesorting.base;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


/**
 * ================================================
 * 作    者：FuYG Github地址：https://github.com/naiop
 * 创建日期：21/10/5
 * 描    述：
 * 功    能：Base
 */
public class BaseActivity extends AppCompatActivity {

    private static Context context;
    private Activity activity;
    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        activity = this;
        setTranslucent(activity);

    }

    //状态栏沉浸
    public  void setTranslucent(Activity activity) {
        Log.d(TAG, "setTranslucent");

        //去除标题栏
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // 设置状态栏透明
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);//应用全屏

            activity.getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }


}
