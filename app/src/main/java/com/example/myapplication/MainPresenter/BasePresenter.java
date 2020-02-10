package com.example.myapplication.MainPresenter;

import com.example.myapplication.BaseActivity;
import com.example.myapplication.BaseView;
import com.example.myapplication.MainView;

public class BasePresenter<T extends BaseView> {
    public T view;

    public void onAttach(T view) {
        //让p层拥有v层对象
        this.view=view;
    }
}
