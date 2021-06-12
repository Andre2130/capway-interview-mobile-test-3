package com.example.newsapplication.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.newsapplication.response.ArticleResponse;
import com.example.newsapplication.retrofit.ApiRequest;
import com.example.newsapplication.retrofit.RetrofitRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticleRepository {

    private static final String TAg = ArticleRepository.class.getSimpleName();
    private final ApiRequest apiRequest;


    public ArticleRepository(){
        apiRequest = RetrofitRequest.getRetrofitInstance().create(ApiRequest.class);
    }

    public LiveData<ArticleResponse> getDashBoardNews(){
        final MutableLiveData<ArticleResponse> data= new MutableLiveData<>();
        apiRequest.getTopHeadlines()
                .enqueue(new Callback<ArticleResponse>() {
                    @Override
                    public void onResponse(Call<ArticleResponse> call, Response<ArticleResponse> response) {
                        if(response.body()!=null){
                            data.setValue(response.body());
                        }
                    }

                    @Override
                    public void onFailure(Call<ArticleResponse> call, Throwable t) {

                        data.setValue(null);

                    }
                });
        return data;
    }
}

