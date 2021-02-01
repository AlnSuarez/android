package com.example.aprendiendoenudemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.aprendiendoenudemy.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





            Handler().postDelayed({
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }, 3000)







    }


}

