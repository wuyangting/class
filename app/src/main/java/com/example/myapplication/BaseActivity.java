package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

import com.example.myapplication.MainPresenter.BasePresenter;
import com.example.myapplication.MainPresenter.Pre;
//所有Activity的基类所有Activity重复的代码都会在这里
public abstract class BaseActivity<V extends BaseView,P extends BasePresenter> extends AppCompatActivity {

    public P mPre;//拥有P层对象，方便子类使用

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //放置布局因为不同的Activity的布局不一样，所以必须要重写getLayoutId()这个方法，所以这个方法是抽象的。
        setContentView(getLayoutId());
        initView();
        //设置p层
        mPre = initPre();
        if(mPre!=null){
            //传递v层对象不再使用构造,使用方法传递,v和p层在父类中统一相互持有对方对象
            mPre.onAttach((V) this);
        }
        initData();
        initListener();
    }
    //由子类提供对应的P层对象
    protected abstract P initPre();


    protected void initListener() {

    }

    protected void initData() {

    }

    protected   void initView(){}
    //专门提供布局id的,必须由子类复写
    protected abstract int getLayoutId();
}
