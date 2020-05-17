package com.zackjackman.jackmanmemorytrainer

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.BaseAdapter
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColor
import kotlinx.android.synthetic.main.color_circle.view.*

class ColorViewAdapter(val context: Context, val color: ArrayList<Int>) : BaseAdapter() {

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val circle = color[p0]
        val inflator = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflator.inflate(R.layout.color_circle, null)
        view.circle.setColorFilter(ContextCompat.getColor(context, circle ))
        return view
    }

    override fun getItem(p0: Int): Any {
        return color[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return color.size
    }


}