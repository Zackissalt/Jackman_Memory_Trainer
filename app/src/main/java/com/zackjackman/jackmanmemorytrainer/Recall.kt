package com.zackjackman.jackmanmemorytrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recall.*

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class Recall : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recall)

        val colors : ArrayList<Int>  = (intent.extras.getBundle("bundle").getIntegerArrayList("colors"))
        val adapter = ColorSpinnerAdapter(this, colors )
        colorGrid.adapter = adapter


    }
}
