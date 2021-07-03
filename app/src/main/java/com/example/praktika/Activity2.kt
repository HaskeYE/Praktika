package com.example.praktika

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import java.text.SimpleDateFormat
import java.util.*


class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)
        val db = baseContext.openOrCreateDatabase(
            "car.db",
            Context.MODE_PRIVATE,
            null
        )

        db.execSQL("CREATE TABLE IF NOT EXISTS car (name TEXT, type TEXT, description TEXT, date INTEGER)")
        val query: Cursor = db.rawQuery("SELECT * FROM car;", null)
        val textView = findViewById<View>(R.id.textView) as TextView
        while (query.moveToNext()) {
            val name: String = query.getString(0)
            val type: String = query.getString(1)
            val description: String = query.getString(2)
            val date: Int = query.getInt(3)
            textView.append("Name: $name Type: $type  Age: $date \n $description \n")
        }
        query.close()
        db.close()
    }
}