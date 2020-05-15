package com.zackjackman.jackmanmemorytrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val difficulties = resources.getStringArray(R.array.difficulty)
        val menu :Spinner = findViewById(R.id.optionsMenu)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, difficulties )
        menu.adapter = adapter

    }
}
