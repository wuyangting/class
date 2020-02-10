package com.example.myapplication.MainPresenter;

import com.example.myapplication.MainActivity;
import com.example.myapplication.MainModel.NetCallBack;
import com.example.myapplication.MainModel.model;
import com.example.myapplication.MainView;
import com.example.myapplication.Result;

public class Pre extends BasePresenter<MainView> implements NetCallBack<Result> {

    private final com.example.myapplication.MainModel.model model;

    public Pre() {
        model = new model();
    }

    public void getData() {
        model.getData(this);
    }

    @Override
    public void onSuccess(Result result) {
        view.SetData(result.getData());
    }

    @Override
    public void onFail(String s) {
        view.showToast(s);
    }
}
