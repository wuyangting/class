package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String a="asd";
    String b="asd";
    String c="asd";
    public void insert(){
        String a1="请问1";
    }
    public void delay() throws InterruptedException {
        Thread.sleep(2000);
    }
}
