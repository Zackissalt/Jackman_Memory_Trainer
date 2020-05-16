package com.zackjackman.jackmanmemorytrainer

class CircleColor(private val circle: Int) {


    fun getColor():Int{
        return when(circle){
            1-> R.color.blue
            2-> R.color.red
            3-> R.color.yellow
            4-> R.color.green
            5-> R.color.orange
            else -> R.color.purple
        }

    }



}