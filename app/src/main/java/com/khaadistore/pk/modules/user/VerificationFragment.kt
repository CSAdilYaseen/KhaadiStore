package com.khaadistore.pk.modules.user


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
import com.khaadistore.pk.R
import android.widget.Toast
import androidx.navigation.Navigation
import com.poovam.pinedittextfield.PinField
import kotlinx.android.synthetic.main.fragment_verification.*
import org.jetbrains.annotations.NotNull


class VerificationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_verification, container, false)
    }


}
