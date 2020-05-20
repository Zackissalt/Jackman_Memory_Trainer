package com.zackjackman.jackmanmemorytrainer

import kotlin.math.round

class ColorGenerator {
    private var circles = ArrayList<Int>()
    private var colorRead = CircleColor()

    private fun randomizeColors(difficulty : Int){

        do {
            val random = (Math.random() * 6).toInt()
            circles.add(random)
        } while (circles.size < difficulty)
    }

    fun getList():ArrayList<Int> { return circles }

    fun getColorId(circleNumber : Int):Int{ return colorRead.getColor(circleNumber)}

    fun getColorIdList():ArrayList<Int>{
        val colorIdList = ArrayList<Int>()
        for (randomColor in circles ){
            colorIdList.add(getColorId(randomColor))
        }
        return colorIdList
    }
    fun getColorIdList(difficulty : Int):ArrayList<Int>{
        randomizeColors(difficulty)
        return getColorIdList()
    }

    fun getColorIdList(colors: ArrayList<Int>):ArrayList<Int>{
        circles = colors
        return getColorIdList()
    }
}