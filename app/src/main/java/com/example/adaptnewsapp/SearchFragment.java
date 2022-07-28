package com.example.adaptnewsapp;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchFragment extends Fragment{

    String api="c1c144d7abe640c3b57f30ab7a0a7dfd";
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    String language="en";
    String searchIn="title";
    String sortBy="relevancy";
    private RecyclerView recyclerViewofsearch;
    private String search;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.searchfragment, null);

        recyclerViewofsearch=v.findViewById(R.id.recyclerviewofsearch);
        modelClassArrayList=new ArrayList<>();
        recyclerViewofsearch.setLayoutManager(new LinearLayoutManager(container.getContext()));
        adapter=new Adapter(container.getContext(), modelClassArrayList);
        recyclerViewofsearch.setAdapter(adapter);

        findNews();
        return v;
    }

    private void findNews() {
        ApiUtilities.getApiInterface().getSearch(search,searchIn,language,sortBy,100,api).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });

    }
}
