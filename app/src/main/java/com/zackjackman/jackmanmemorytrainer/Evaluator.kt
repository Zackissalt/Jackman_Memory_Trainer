package com.zackjackman.jackmanmemorytrainer

import android.content.Context
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Spinner
import androidx.core.content.ContextCompat
import androidx.core.view.iterator

class Evaluator(val context: Context, val group: ViewGroup, val memColors: ArrayList<Int>) {
    val color = CircleColor()
    fun compareColors():ArrayList<Boolean>{
        val answers = ArrayList<Boolean>()
        for (view in group ) {
            val menu = view.findViewById<Spinner>(R.id.circle_spinner)
                if(menu is Spinner){
                    val spinnerColor = memColors[group.indexOfChild(view)]
                    answers.add(menu.selectedItemPosition == spinnerColor)
                    view.setBackgroundColor((ContextCompat.getColor(context, color.getColor(spinnerColor))))

                }

        }
        return answers
    }

    fun getPercentRight():Int {
        var right = 0
        val answers = compareColors()
        for (answer: Boolean in answers ){
            if(answer) right++
        }
        return (right * 100)/(answers.size)
    }
}