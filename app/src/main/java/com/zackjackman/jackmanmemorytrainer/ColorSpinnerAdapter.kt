package com.zackjackman.jackmanmemorytrainer
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Spinner

class ColorSpinnerAdapter(val context: Context, val color: ArrayList<Int>) : BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val circleColor = CircleColor()
        val inflator = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflator.inflate(R.layout.color_spinner, null)
        val menu : Spinner = view.findViewById(R.id.circle_spinner)
        val adapter = ColorViewAdapter(context, circleColor.getColorArray())
        menu.adapter = adapter
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