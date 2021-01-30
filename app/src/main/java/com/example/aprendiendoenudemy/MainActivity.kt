package com.example.aprendiendoenudemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name: EditText = findViewById(R.id.editTextName)
        val surname: EditText = findViewById(R.id.editTextSurname)
        val btn1: Button = findViewById(R.id.Button1)

        btn1.setOnClickListener{

            val name1 = name.text.toString()
            val surname1 = surname.text.toString()

            val intento1 = Intent(this, MainActivity2::class.java)
            intento1.putExtra("Name", name1)
            intento1.putExtra("surname", surname1)
            startActivity(intento1)
        }

    }


}

