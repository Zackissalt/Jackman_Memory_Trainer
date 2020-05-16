package com.zackjackman.jackmanmemorytrainer

class CircleColor() {


    fun getColor(circle:Int):Int{
        return when(circle){
            0-> R.color.blue
            1-> R.color.red
            2-> R.color.yellow
            3-> R.color.green
            4-> R.color.orange
            else -> R.color.purple
        }

    }



}