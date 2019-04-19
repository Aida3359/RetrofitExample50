package com.example.retrofitexample;


import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {
    @GET("/intern/user/1")
    Call<ResponseBody>getPosts();

    @GET("/users")
    Call<ResponseBody>getUsers();


}
