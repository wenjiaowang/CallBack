package com.example.callback

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonApp1: Button = findViewById(R.id.buttonApp1)
        val buttonApp2: Button = findViewById(R.id.buttonApp2)


        buttonApp1.setOnClickListener {
            // Calculator
            val intent = Intent()
            intent.component = ComponentName("com.example.calculator", "com.example.calculator.MainActivity")
            intent.putExtra("message", "Hello from MyApp!")
            startActivity(intent)
        }

        buttonApp2.setOnClickListener {
            // Surprise
            val intent = Intent()
            intent.component = ComponentName("com.example.surprise", "com.example.surprise.MainActivity2")
            intent.putExtra("message", "Hello from MyApp!")
            startActivity(intent)
        }


    }
}