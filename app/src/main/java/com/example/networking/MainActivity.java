package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonTask(this).execute(JSON_URL);

        List<String> mountains = Arrays.asList("K2", "Mount Everest", "Mount Blanc", "Olympus");
        ArrayList <String> Mountain = new ArrayList<String>();
        RecyclerView.Adapter;

        recyclerView = findViewById(R.id.recyclerview);
        AdapterMountain adapterMountain = new AdapterMountain(mountains);
        recyclerView.setAdapter(adapterMountain);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
