package com.bw.ymy.zy1.refit;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

public interface BaseApi<T> {
    //post
    @POST
    Observable<ResponseBody> post(@Url String url, @QueryMap Map<String, String> map);

    //get
    @GET
    Observable<ResponseBody> get(@Url String url);
}
