package com.example.staggeredgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int NUM_COLUMNS = 2;

    private ArrayList<String> mnames=new ArrayList<>();
    private ArrayList<String> mimage=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }
    private void init(){
        Log.d(TAG, "init: preparing");
    mnames.add("RELATIVE LAYOUT");mimage.add("@mipmap/background");
    mnames.add("CONSTRAINT LAYOUT");mimage.add("@mipmap/background");
    mnames.add("LINEAR LAYOUT");mimage.add("@mipmap/background");
    mnames.add("GRID LAYOUT");mimage.add("@mipmap/background");
    mnames.add("RELATIVE LAYOUT");mimage.add("@mipmap/background");
    mnames.add("CONSTRAINT LAYOUT");mimage.add("@mipmap/background");
    mnames.add("LINEAR LAYOUT");mimage.add("@mipmap/background");
    mnames.add("GRID LAYOUT");mimage.add("@mipmap/background");

    initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initialising");

        RecyclerView recyclerView =findViewById(R.id.recyclerview);
        adapter adapter=new adapter(this,mnames,mimage);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}
