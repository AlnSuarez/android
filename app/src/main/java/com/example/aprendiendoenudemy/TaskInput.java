package com.example.aprendiendoenudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TaskInput extends AppCompatActivity {
    Button Message;
    public static final String  DATA_ENTERED = "DATA_ENTERED" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_input);
        EditText EntradaTexto = findViewById(R.id.editTextTASK);
        Message = findViewById(R.id.buttonConfirm);
        Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TextoDeVuelta = EntradaTexto.getText().toString();
                Intent intent = new Intent();
                intent.putExtra(DATA_ENTERED, TextoDeVuelta);
                setResult(RESULT_OK,intent);
                finish();
            }
        } );





    }
    public void sendMessage(){
        String message = Message.getText().toString();
        Intent returnIntent = new Intent();
//        returnIntent.putExtra("message", message);
        startActivity(returnIntent);
        finish();
    }
}