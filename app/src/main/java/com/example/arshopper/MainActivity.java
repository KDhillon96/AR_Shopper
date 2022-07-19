package com.example.arshopper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<MyListModel> modelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.idRVImages);

        modelArrayList = new ArrayList<>();
        modelArrayList.add(new MyListModel("armchair",R.drawable.armchair));
        modelArrayList.add(new MyListModel("chair",R.drawable.chair));
        modelArrayList.add(new MyListModel("chaise_haute_conforama",R.drawable.chaise_haute_conforama));
        modelArrayList.add(new MyListModel("las_vegas",R.drawable.las_vegas));
        modelArrayList.add(new MyListModel("modern_armchair",R.drawable.modern_armchair));
        modelArrayList.add(new MyListModel("modern_chair_dark",R.drawable.modern_chair_dark));
        modelArrayList.add(new MyListModel("n01_beech",R.drawable.n01_beech));
        modelArrayList.add(new MyListModel("n01_black",R.drawable.n01_black));
        modelArrayList.add(new MyListModel("ottoman",R.drawable.ottoman));
        modelArrayList.add(new MyListModel("recliner_chair",R.drawable.recliner_chair));
        modelArrayList.add(new MyListModel("rockingchair",R.drawable.rockingchair));
        modelArrayList.add(new MyListModel("silla_moderna",R.drawable.silla_moderna));
        modelArrayList.add(new MyListModel("sofa_armchair",R.drawable.sofa_armchair));

        MyListAdapter myListAdapter = new MyListAdapter(this,modelArrayList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(myListAdapter);

    }
}