package com.example.praktika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loadButtonImage = findViewById<Button>(R.id.button)
        loadButtonImage.setOnClickListener {
            startActivity(Intent(this, Activity1::class.java))
        }
        val loadButtonImage1 = findViewById<Button>(R.id.button1)
        loadButtonImage.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}