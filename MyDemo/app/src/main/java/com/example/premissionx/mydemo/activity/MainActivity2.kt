package com.example.premissionx.mydemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button1=findViewById<Button>(R.id.button1)
        val button2=findViewById<Button>(R.id.button2)
        button1.setOnClickListener{

        }
        button2.setOnClickListener{

        }
    }

}