package com.example.local;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface mapi {
    @GET("posts")
    Call<List<Model>> getmodel();
}
