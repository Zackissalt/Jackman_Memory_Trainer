package com.zackjackman.jackmanmemorytrainer

class CircleColor() {
    val colors = ArrayList<Int>()
    init {
        colors.add(R.color.blue)
        colors.add(R.color.red)
        colors.add(R.color.yellow)
        colors.add(R.color.green)
        colors.add(R.color.orange)
        colors.add(R.color.purple)
    }

    fun getColor(circle:Int):Int{
        return colors[circle]

    }

    fun getColorArray():ArrayList<Int>{
        return colors
    }



}