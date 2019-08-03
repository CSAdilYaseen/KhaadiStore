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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvDidNotReceive = SpannableString(tvDidNotReceivePin.text.toString())


        tvDidNotReceive.setSpan(
            ForegroundColorSpan(resources.getColor(R.color.txt_color_heading)),
            21, 26,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        val tvTermsAndConditionsClickableSpan = object : ClickableSpan() {
            override fun onClick(textView: View) {
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = true
            }
        }
        tvDidNotReceive.setSpan(
            tvTermsAndConditionsClickableSpan,
            21,
            26,
            SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        tvDidNotReceivePin.text = tvDidNotReceive
        tvDidNotReceivePin.movementMethod = LinkMovementMethod.getInstance()

        val linePinField = view.findViewById<PinField>(R.id.lineField)
        linePinField.onTextCompleteListener = object : PinField.OnTextCompleteListener {
            override fun onTextComplete(@NotNull enteredText: String): Boolean {
                Toast.makeText(requireContext(), enteredText, Toast.LENGTH_SHORT).show()
                return true // Return true to keep the keyboard open else return false to close the keyboard
            }
        }

        btnRegister.setOnClickListener {
            val navController = Navigation.findNavController(activity!!, R.id.fragment)
            navController.navigate(R.id.action_verificationFragment_to_forgotPasswordFragment)
        }
    }
}
