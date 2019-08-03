package com.khaadistore.pk.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.khaadistore.pk.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inflater = fragment.findNavController().navInflater
        val graph = inflater.inflate(R.navigation.nav_graph)
        fragment.findNavController().graph = graph
        Navigation.findNavController(this, R.id.fragment).handleDeepLink(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Navigation.findNavController(this, R.id.fragment).handleDeepLink(intent)
    }
    override fun onSupportNavigateUp() =
        Navigation.findNavController(this, R.id.fragment).navigateUp()
}
