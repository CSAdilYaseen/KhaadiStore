package com.khaadistore.pk

import android.content.Context
import android.support.multidex.MultiDexApplication
import com.khaadistore.pk.util.DataHandler
import java.util.*

/**
 * Created on 6/30/2019
 * Email ynaseem@an10.io
 * Organization AN10
 */
class AppController : MultiDexApplication() {


    companion object {
        lateinit var ApplicationContext: Context
    }

    override fun onCreate() {
        super.onCreate()

        //initialize on app level here
        ApplicationContext = this
        DataHandler(ApplicationContext)
    }
}