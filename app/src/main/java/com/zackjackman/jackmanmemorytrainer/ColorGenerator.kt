package com.zackjackman.jackmanmemorytrainer

import kotlin.math.round

class ColorGenerator(private val difficulty : Int) {
    private var circles = ArrayList<Int>()
    private var colorRead = CircleColor()
    init {
        randomizeColors()

    }

    private fun randomizeColors(){

        do {
            val random = (Math.random() * 6).toInt()
            circles.add(random)
        } while (circles.size < difficulty)
    }

    fun getList():ArrayList<Int> { return circles }

    fun getColorId(circleNumber : Int):Int{ return colorRead.getColor(circles[circleNumber])}

    fun getColorIdList():ArrayList<Int>{
        val colorIdList = ArrayList<Int>()
        for (randomColor in circles ){
            colorIdList.add(getColorId(randomColor))
        }
        return colorIdList

    }
}