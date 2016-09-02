package com.cdytj.cdytj.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cdytj.cdytj.R;

import cn.bmob.v3.Bmob;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Bmob.initialize(this,"4290863f4edb1aa0eafb6f0438ca58cd");//用Bmob后台新建应用时提供的APP_ID来在应用中初始化Bmob的服务

    }
}
