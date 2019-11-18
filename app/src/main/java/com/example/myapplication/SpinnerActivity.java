package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    private List<String> listFood;
    private Spinner spinnerFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch4);

        initView();
        getDataSource();
        displaySpinnerList();
    }

    private void displaySpinnerList() {
        spinnerFood.setAdapter(getSpinnerAdapter());
    }

    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listFood);
    }

    private void getDataSource() {
        listFood = new ArrayList<>();
        listFood.add("Eclair");
        listFood.add("KitKat");
        listFood.add("CupCake");
        listFood.add("Donut");
        listFood.add("Pie");
    }

    private void initView() {
        spinnerFood = findViewById(R.id.spinnerFood);
    }
}
