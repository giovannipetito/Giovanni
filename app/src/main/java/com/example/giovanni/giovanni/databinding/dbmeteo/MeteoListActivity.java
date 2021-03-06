package com.example.giovanni.giovanni.databinding.dbmeteo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.giovanni.giovanni.R;
import com.example.giovanni.giovanni.bean.DataBindingModel;

import java.util.Arrays;
import java.util.List;

public class MeteoListActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_binding_list);

        RecyclerView recyclerView = findViewById(R.id.list_meteo);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<DataBindingModel> list = Arrays.asList(
                new DataBindingModel("Napoli", "30°"),
                new DataBindingModel("Milano", "25°"),
                new DataBindingModel("Roma", "28°"),
                new DataBindingModel("Torino", "20°"),
                new DataBindingModel("Palermo", "35°"),
                new DataBindingModel("Firenze", "28°")
        );

        RecyclerView.Adapter adapter = new MeteoListAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}