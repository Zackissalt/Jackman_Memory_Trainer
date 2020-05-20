package com.zackjackman.jackmanmemorytrainer


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_memorize.*



class Memorize : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memorize)

        val difficulty  = ((intent.extras!!.getInt("difficulty")) + 1) * 3
        val colors = ColorGenerator()
        val colorsId : ArrayList<Int> = colors.getColorIdList(difficulty)
        val colorsNumbers = colors.getList()
        val adapter = ColorViewAdapter(this, colorsId )
        colorGrid.adapter = adapter
        val intent = Intent(this, Recall::class.java)
        val bundle = Bundle()
        bundle.putIntegerArrayList("colorsNumbers", colorsNumbers)
        intent.putExtra("bundle", bundle  )

        val countdown = object : CountDownTimer(30000,1000) {
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft  = (millisUntilFinished/1000).toString()
                findViewById<TextView>(R.id.timer).text = timeLeft
            }
            override fun onFinish() {
                this@Memorize.startActivity(intent)
            }

        }
        countdown.start()



    }


}
