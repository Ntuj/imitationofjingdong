package com.bawei.imitationofjingdong.Overall;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.bawei.imitationofjingdong.R;

import java.util.Timer;
import java.util.TimerTask;

/*
* 开始时间：2017/12/25
* 目的：仿京东
* 时间：2017/12/25
* 此页面是：仿京东跳转页面
*
* handler+task 3秒跳转
* */
public class JumpPageActivity extends AppCompatActivity {

    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Intent i=new Intent(JumpPageActivity.this,OverallActivity.class);
            startActivity(i);
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);//必须放在setContentView之前执行，不然会报错的。
        setContentView(R.layout.activity_main);
        Timer t=new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(1);

            }
        },3000);
    }
}
