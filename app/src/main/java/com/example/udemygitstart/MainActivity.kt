package com.example.udemygitstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stringHelloText = "hello text"

    }
    fun createNewFeatureOfBasic(){
        var texViewNew = findViewById<TextView>(R.id.textVv)
    }
    fun workingOnDataBase(){
        //some code for database
    }
}