package com.example.adaptnewsapp;

import java.util.ArrayList;

public class mainNews {
    private String status;
    private String TotalResults;
    private ArrayList<ModelClass> articles;

    public mainNews(String status, String totalResults, ArrayList<ModelClass> articles) {
        this.status = status;
        TotalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return TotalResults;
    }

    public void setTotalResults(String totalResults) {
        TotalResults = totalResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
