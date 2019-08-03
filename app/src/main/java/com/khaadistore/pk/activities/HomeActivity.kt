package com.khaadistore.pk.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.khaadistore.pk.R
import com.khaadistore.pk.util.DataHandler
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar_nav_drawer.*

class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate( savedInstanceState)
        setContentView(R.layout.activity_home)


        val navController = findNavController(R.id.fragment)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false);
        NavigationUI.setupActionBarWithNavController(this, navController, drawer_layout)

        nav_view.setNavigationItemSelectedListener(this)
    }
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(Navigation.findNavController(this, R.id.fragment), drawer_layout)
    }

    override fun onResume() {
        super.onResume()

        tvKhaadiStore.visibility = View.VISIBLE
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        nav_view.menu.findItem(p0.itemId).isChecked = true
        when (p0.itemId) {
            R.id.premium -> {
                /*try{
                    val navController = Navigation.findNavController(this!!, R.id.fragment)
                    navController.navigate(R.id.action_conferenceTypeFragment_to_preferenceFragment2)
                }catch (e: IllegalArgumentException){
                    Log.e("IllegalArgumentExp","${e.stackTrace}")
                }*/

            }
            R.id.term_and_conditions -> {
                /*val navController = Navigation.findNavController(this!!, R.id.fragment)
                navController.navigate(R.id.action_conferenceTypeFragment_to_myEventFragment)*/
            }

            R.id.account_settings -> {
                /*val navController = Navigation.findNavController(this!!, R.id.fragment)
                navController.navigate(R.id.action_conferenceTypeFragment_to_myFavoritesFragment2)*/
            }

            /*R.id.nav_signOut -> {
                DataHandler.deletePreference(AppConstants.SP_USER_NAME)
                DataHandler.deletePreference(AppConstants.SP_EMAIL)
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }*/
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
