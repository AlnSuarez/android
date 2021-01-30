package com.example.aprendiendoenudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayList<String> ListaNombres = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView Lista = findViewById(R.id.listView);


        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("Name");


        ListaNombres.add("Alan");
        ListaNombres.add("John");
        ListaNombres.add("Juan");
        ListaNombres.add("Taco");

        ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ListaNombres);


        Lista.setAdapter(adaptador);

        Lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.i("APP", "Version click:" + ListaNombres.get(i));
    }
}