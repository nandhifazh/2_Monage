package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HistoryAdapter historyAdapter;
    private ArrayList<History> historyArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        historyAdapter = new HistoryAdapter(historyArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(historyAdapter);
    }

    public void getData() {
        historyArrayList = new ArrayList<>();
        historyArrayList.add(new History("2.500.000","1.000.000","01/04/2021"));
        historyArrayList.add(new History("300.000","0","25/03/2021"));
        historyArrayList.add(new History("200.000","50.000","21/03/2021"));
        historyArrayList.add(new History("50.000","25.000","20/03/2021"));
        historyArrayList.add(new History("90.000","40.000","19/03/2021"));
    }
}