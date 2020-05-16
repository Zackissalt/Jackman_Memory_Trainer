package com.zackjackman.jackmanmemorytrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val difficulties = resources.getStringArray(R.array.difficulty)
        val menu :Spinner = findViewById(R.id.optionsMenu)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, difficulties )
        menu.adapter = adapter

        val start :Button = findViewById(R.id.startButton)
        start.setOnClickListener {
            val intent = Intent(this, Memorize::class.java)
            intent.putExtra("difficulty", menu.selectedItemPosition )
            this.startActivity(intent)
        }

    }
}
