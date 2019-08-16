package com.khaadistore.pk.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.khaadistore.pk.R

class UserSalesAdapter : BaseAdapter {
    val context:Context
    constructor(context: Context){
        this.context = context
    }
    override fun getView(position: Int, view: View?, p2: ViewGroup?): View {
        val v = LayoutInflater.from(context).inflate(R.layout.list_item_user_sales,null)
        return v
    }

    override fun getItem(p0: Int): Any {
        return null!!
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return 4
    }
}