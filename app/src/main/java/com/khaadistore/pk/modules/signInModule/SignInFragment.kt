package com.khaadistore.pk.modules.signInModule


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.khaadistore.pk.R
import kotlinx.android.synthetic.main.fragment_sign_in.*

/**
 * Created on 6/30/2019
 * Email ynaseem@an10.io
 * Organization AN10
 */
class SignInFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvNeedToRegister.setOnClickListener {
            val navController = Navigation.findNavController(activity!!, R.id.fragment)
            navController.navigate(R.id.action_signInFragment_to_signUpFragment)
        }
    }
}
