package com.example.hwhong.snapchatclone;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by hwhong on 7/25/16.
 */
public class Imageview extends AppCompatActivity {

    ImageView imageView;
    private String VALUE_KEY = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);

        imageView = (ImageView) findViewById(R.id.imageView);

        Intent intent = getIntent();

        String item = intent.getStringExtra(VALUE_KEY);

        switch (item) {
            case "Snapchat":
                imageView.setBackgroundResource(R.drawable.snapchat);
                break;
            case "Google":
                imageView.setBackgroundResource(R.drawable.google);
                break;
            case "Tumblr":
                imageView.setBackgroundResource(R.drawable.tumblr);
                break;
            case "Twitter":
                imageView.setBackgroundResource(R.drawable.twitter);
                break;
            case "Beme":
                imageView.setBackgroundResource(R.drawable.beme);
                break;
            case "Uber":
                imageView.setBackgroundResource(R.drawable.uber);
                break;
        }

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                finish();
            }
        }, 2000);

    }
}
