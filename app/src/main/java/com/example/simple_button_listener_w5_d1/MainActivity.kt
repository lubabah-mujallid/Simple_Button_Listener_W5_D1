package com.example.simple_button_listener_w5_d1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.tv1)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            tv.text = "Changed With Kotlin!"
        }
    }
    fun sendMessage(view: View) {
        val tv: TextView = findViewById(R.id.tv2)
        Log.d("XML","Changing button")
        tv.text = "Changed With XML!"
    }

}

/*
Create two Buttons
Both Buttons should display the same Toast message when pressed
The implementation of the Buttons will be different
One Button should be implemented using Kotlin code, while the other should be implemented using XML
*/