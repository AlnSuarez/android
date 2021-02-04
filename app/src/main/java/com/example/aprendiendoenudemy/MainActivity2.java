package com.example.aprendiendoenudemy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<String> ListaNombres = new ArrayList<>();
    public static final int  message_request = 01;
    public final static int REQ_CODE=100;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        ListView Lista = findViewById(R.id.listView);
        ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ListaNombres);
        Lista.setAdapter(adaptador);

        Intent intent2 = new Intent(this, TaskInput.class);

        Button addButton = (Button)findViewById(R.id.AddButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intent2, REQ_CODE);
            }
        });


        Button popButton = (Button)findViewById(R.id.popButton);
        popButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reviso si no tira error por lista vacia en el try catch
                //elimina elementos de la lista.
                try {
                    ListaNombres.remove(0);
                    adaptador.notifyDataSetChanged();
                }catch(Exception e){
                    Toast.makeText(MainActivity2.this, "No hay elementos a borrar.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String Textito = data.getStringExtra(TaskInput.DATA_ENTERED);
        Toast.makeText(this, "TEXTO:"+Textito, Toast.LENGTH_SHORT).show();


    }
}