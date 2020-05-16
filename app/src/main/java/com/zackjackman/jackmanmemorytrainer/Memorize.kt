package com.zackjackman.jackmanmemorytrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_memorize.*
import kotlinx.android.synthetic.main.activity_recall.*

class Memorize : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memorize)

        val difficulty  = (intent.extras.getInt("difficulty") + 1) * 3
        val colors = ColorGenerator(difficulty)




    }


}
