package com.khaadistore.pk.modules.signUpModule


import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Spannable
import android.text.SpannableString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.khaadistore.pk.R
import kotlinx.android.synthetic.main.fragment_sign_up.*

/**
 * Created on 6/30/2019
 * Email ynaseem@an10.io
 * Organization AN10
 */
class SignUpFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvLogin = SpannableString(tvAlreadyHaveAccount.text.toString())
        tvLogin.setSpan(
            ForegroundColorSpan(resources.getColor(R.color.txt_color_heading)),
            23, 28,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        val tvTermsAndConditionsClickableSpan = object : ClickableSpan() {
            override fun onClick(textView: View) {
                val navController = Navigation.findNavController(activity!!, R.id.fragment)
                navController.navigate(R.id.action_signUpFragment_to_signInFragment)
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = true
            }
        }
        tvLogin.setSpan(
            tvTermsAndConditionsClickableSpan,
            23,
            28,
            SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        tvAlreadyHaveAccount.text = tvLogin
        tvAlreadyHaveAccount.movementMethod = LinkMovementMethod.getInstance()

        btnRegister.setOnClickListener {
            val navController = Navigation.findNavController(activity!!, R.id.fragment)
            navController.navigate(R.id.action_signUpFragment_to_verificationFragment)

        }
    }
}
