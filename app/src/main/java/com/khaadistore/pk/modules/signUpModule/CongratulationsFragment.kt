package com.khaadistore.pk.modules.signUpModule


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.khaadistore.pk.R
import com.khaadistore.pk.activities.HomeActivity
import kotlinx.android.synthetic.main.fragment_congratulations.*


class CongratulationsFragment : Fragment() {

    companion object {

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_congratulations, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btnCreate.setOnClickListener {
            startActivity(Intent(activity, HomeActivity::class.java))
            activity?.finish()
        }
    }

}
