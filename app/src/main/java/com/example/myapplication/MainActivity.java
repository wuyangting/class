package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a=10;
    int b=20;
    int c=30;
    public void insert(){
        String a1="阿搜到";
    }
    public void delay() throws InterruptedException {
        Thread.sleep(1000);
    }
}
