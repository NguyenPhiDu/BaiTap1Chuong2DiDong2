package com.example.nhom09quanlyuser;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetAPI {
    @GET("users/{user}/followers")
    Call<List<UserModel>> loadFollowers(
            @Path("user") String user
    );
    @GET("users")
    Call<List<UserModel>> loadUser(
    );
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
