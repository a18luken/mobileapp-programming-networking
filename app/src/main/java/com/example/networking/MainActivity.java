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
    private ArrayList<String> mountains = new ArrayList<String>();
    AdapterMountain adapterMountain = new AdapterMountain(mountains);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mountains.add("K2");
        mountains.add("MountEverest");
        mountains.add("MountBlanc");
        new JsonTask(this).execute(JSON_URL);

        ArrayList <String> Mountain = new ArrayList<String>();


        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setAdapter(adapterMountain);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    @Override
    public void onPostExecute(String json) {
        this.mountains.add("foo");
        Log.d("MainActivity", this.mountains.toString());
        adapterMountain.notifyDataSetChanged();
    }

}
