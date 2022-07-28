package com.example.adaptnewsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URL="https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<mainNews> getNews(
            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );

    @GET("top-headlines")
    Call<mainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("language") String language,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );

    @GET("everything")
    Call<mainNews> getSearch(
            @Query("q") String question,
            @Query("searchIn") String searchin,
            @Query("language") String language,
            @Query("sortBy") String sortby,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );
}
