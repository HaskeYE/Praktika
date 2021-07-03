package com.example.praktika

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)

        val button = findViewById<Button>(R.id.button_insert)
        button.setOnClickListener {
            val db = baseContext.openOrCreateDatabase(
                "car.db",
                Context.MODE_PRIVATE,
                null
            )
            val name = findViewById<TextView>(R.id.name).text
            val type = findViewById<TextView>(R.id.type).text
            val description = findViewById<TextView>(R.id.description).text
            val date = findViewById<TextView>(R.id.date)
            db.execSQL("CREATE TABLE IF NOT EXISTS car (name TEXT, type TEXT, description TEXT, date INTEGER)")
            db.execSQL("INSERT INTO Car VALUES ($name, $type, $description, $date);")
            finish()
        }
    }
}