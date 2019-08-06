package com.khaadistore.pk.modules.owner

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.baoyz.swipemenulistview.SwipeMenu
import com.baoyz.swipemenulistview.SwipeMenuCreator
import com.baoyz.swipemenulistview.SwipeMenuItem
import com.baoyz.swipemenulistview.SwipeMenuListView
import com.khaadistore.pk.R
import com.khaadistore.pk.adapter.PastSalesAdapter
import com.khaadistore.pk.adapter.SalesAdapter
import kotlinx.android.synthetic.main.fragment_main.*
import android.util.TypedValue
import android.widget.LinearLayout
import android.widget.TextView

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val menuCreator = SwipeMenuCreator() {

            val endItem = SwipeMenuItem(context)
            endItem.background = ContextCompat.getDrawable(context!!, R.drawable.ic_red)
            endItem.title = "END"
            endItem.titleSize = 16
            endItem.titleColor = ContextCompat.getColor(context!!, R.color.colorPrimary)
            endItem.width = dp2px(100)
            it.addMenuItem(endItem)
        }


        lv_acitive.setSwipeDirection(SwipeMenuListView.DIRECTION_LEFT)
        lv_acitive.smoothOpenMenu(0)
        val activeSalesAdapter = SalesAdapter(context)
        lv_acitive.adapter = activeSalesAdapter
        lv_acitive.setMenuCreator(menuCreator)
        val pastSalesAdapter = PastSalesAdapter(context)
        lv_pastSales.adapter = pastSalesAdapter

        lv_acitive.setOnMenuItemClickListener(SwipeMenuListView.OnMenuItemClickListener { position, menu, index ->
            when (index) {
                0 -> {
                    Log.i("tag_info", "Clicked")
                    OpenConfirmDialog()
                }
            }
            false
        })
    }

    fun dp2px(dp: Int): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(),
            resources.displayMetrics
        ).toInt()
    }

    fun OpenConfirmDialog(){
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.dialog_end_sale_confirm)
        val btnYes = dialog.findViewById<TextView>(R.id.bv_yes)
        val btnNo = dialog.findViewById<TextView>(R.id.bv_no)
        dialog.window.setLayout(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)
        dialog.window.setBackgroundDrawableResource(R.drawable.dialog_shape_end_sale)
        btnYes.setOnClickListener({
            dialog.dismiss()
        })
        btnNo.setOnClickListener({
            dialog.dismiss()
        })
        dialog.setCancelable(false)
        dialog.show()
    }
}