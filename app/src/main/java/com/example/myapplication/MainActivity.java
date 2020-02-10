package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.MainPresenter.Pre;

public class MainActivity extends BaseActivity<MainView,Pre> implements View.OnClickListener,MainView{

    private Button mSend;
//创建的时候会先走onCreate方法所以会走BaseActivity里的onCreate
    @Override
    protected Pre initPre() {
        return new Pre();
    }

    public void initView() {
        mSend = (Button) findViewById(R.id.send);
        mSend.setOnClickListener(this);
    }
//父类方法
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send:
                // TODO 20/02/10
                //这个p层对象在父类有
                mPre.getData();
                break;
            default:
                break;
        }
    }

    @Override
    public void SetData(String s) {
        mSend.setText(s);
    }

    @Override
    public void showToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
