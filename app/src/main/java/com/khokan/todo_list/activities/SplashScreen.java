package com.khokan.todo_list.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.khokan.todo_list.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    long Delay = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Timer RunSplash = new Timer();

        TimerTask showSplash = new TimerTask() {
            @Override
            public void run() {
                finish();

                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
            }
        };
        RunSplash.schedule(showSplash,Delay);
    }
}
