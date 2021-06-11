package com.example.newsapplication

import retrofit2.Response
import retrofit2.http.GET

interface NewsAPI {

    @GET("/NewsAPI/top-headlines/category/health/in.json")
    fun getArticles(): Response<List<News>>
}