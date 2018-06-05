package com.example.lanil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LayoutActivity extends AppCompatActivity {

    List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, data);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }
}
