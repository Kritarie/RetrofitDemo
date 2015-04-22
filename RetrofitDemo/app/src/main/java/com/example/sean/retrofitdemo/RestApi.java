package com.example.sean.retrofitdemo;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Matthew on 4/15/2015.
 */
public interface RestApi {

    @GET("/api/Users/GetUser")
    public void getUser(@Query("id") long id, Callback<User> cb);

}
