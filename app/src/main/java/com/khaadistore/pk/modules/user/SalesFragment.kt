package com.khaadistore.pk.modules.user

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.khaadistore.pk.R
import com.khaadistore.pk.activities.HomeActivity
import com.khaadistore.pk.adapter.UserSalesAdapter
import kotlinx.android.synthetic.main.fragment_user_sales.view.*

class SalesFragment : Fragment() {
    companion object {

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_sales, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.listview.adapter = UserSalesAdapter(context!!)

        val toast = Toast.makeText(context!!,"You have successfully added this to your saved offers", Toast.LENGTH_LONG)
        toast.view.background.setColorFilter(ContextCompat.getColor(context!!,R.color.light_blue), PorterDuff.Mode.SRC_ATOP)
        toast.view.findViewById<TextView>(android.R.id.message).setTextColor(Color.WHITE)
        toast.show()
    }
}