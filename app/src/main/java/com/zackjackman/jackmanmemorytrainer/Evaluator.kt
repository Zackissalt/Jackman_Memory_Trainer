package com.zackjackman.jackmanmemorytrainer

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Spinner
import androidx.core.view.iterator

class Evaluator(val group: ViewGroup, val memColors: ArrayList<Int>) {

    fun compareColors():ArrayList<Boolean>{
        val answers = ArrayList<Boolean>()
        for (view in group ) {
            val menu = view.findViewById<Spinner>(R.id.circle_spinner)
                if(menu is Spinner){
                    answers.add(menu.selectedItemPosition == memColors[group.indexOfChild(view)])
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