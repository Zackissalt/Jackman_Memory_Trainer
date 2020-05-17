package com.zackjackman.jackmanmemorytrainer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_recall.*

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class Recall : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recall)
        val bundle : Bundle = intent.extras.getBundle("bundle")
        val colorNumbers : ArrayList<Int> = bundle.getIntegerArrayList("colorsNumbers")
        val colors = ColorGenerator().getColorIdList(colorNumbers)
        val adapter = ColorSpinnerAdapter(this, colors )
        colorGrid.adapter = adapter
        val evaluator = Evaluator(this, colorGrid, colorNumbers)
        val commit : Button = findViewById(R.id.commit)
        var switch = false
        commit.setOnClickListener {
            if (switch) {
                val intent = Intent(this, MainActivity::class.java)
                this.startActivity(intent)
            } else {
                findViewById<TextView>(R.id.match).text =
                    evaluator.getPercentRight().toString() + "%"
                commit.setText(R.string.again)
                switch = true
            }
        }

    }
}
