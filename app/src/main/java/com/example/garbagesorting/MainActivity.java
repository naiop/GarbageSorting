package com.example.garbagesorting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.garbagesorting.base.BaseActivity;
import com.example.garbagesorting.base.MainActivityBase;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


/**
 * ================================================
 * 作    者：FuYG Github地址：https://github.com/naiop
 * 创建日期：21/10/5
 * 描    述： 导播图页
 * 功    能：
 */
public class MainActivity extends BaseActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageview);
        imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.splash, null)); //加载drawable 资源


        msleep();
    }
    // 使程序休眠几秒后跳转
    private void msleep() {
        //创建子线程 延续
        Thread myThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);//使程序休眠3秒
                    Intent intent=new Intent(MainActivity.this, MainActivityBase.class);
                    startActivity(intent);
                    finish();//关闭当前活动
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();//启动线程

    }


}