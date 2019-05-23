package com.example.mainactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

// Satria Dwi Rizqi, 10016320, IF7, Kamis 23 Mei 2019s
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
                public void run () {
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
                        finish();
                    }
                }
        };
        thread.start();
    }
}
