package com.example.myapplication.MainModel;

public interface NetCallBack<T> {
    void onSuccess(T result);
    void onFail(String s);
}
