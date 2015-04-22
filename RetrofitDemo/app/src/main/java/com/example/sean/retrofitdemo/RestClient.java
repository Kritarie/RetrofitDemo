package com.example.sean.retrofitdemo;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Matthew on 4/15/2015.
 */
public class RestClient {

    private static RestApi REST_CLIENT;
    private static final String ROOT = "http://seedle.azurewebsites.net/";

    static {
        setupRestClient();
    }

    private RestClient() {

    }

    public static RestApi get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {
        System.out.println("Setup");

        RestAdapter.Builder builder =  new RestAdapter.Builder()
                .setEndpoint(ROOT)
                .setClient(new OkClient(new OkHttpClient()))
                .setLogLevel(RestAdapter.LogLevel.FULL);

        RestAdapter restAdapter = builder.build();
        REST_CLIENT = restAdapter.create(RestApi.class);
    }
}
