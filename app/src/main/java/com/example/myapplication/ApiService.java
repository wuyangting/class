package com.example.myapplication;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    String url="http://yun918.cn/study/public/index.php/";
    @GET("verify")
    Observable<Result> getData();

}
