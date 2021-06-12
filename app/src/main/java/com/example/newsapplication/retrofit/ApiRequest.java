package com.example.newsapplication.retrofit;

import com.example.newsapplication.response.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

import static com.example.newsapplication.constants.AppConstant.API_KEY;


public interface ApiRequest {

    @GET("top-headlines?country=us&apiKey="+API_KEY)
    Call<ArticleResponse> getTopHeadlines();


}
