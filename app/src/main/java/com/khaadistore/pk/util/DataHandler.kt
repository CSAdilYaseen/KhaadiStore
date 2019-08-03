package com.khaadistore.pk.util

import android.content.Context
import org.json.JSONArray

/**
 * Created on 6/30/2019
 * Email ynaseem@an10.io
 * Organization AN10
 */
class DataHandler(context: Context) {

    init {
        DataHandler.context = context
    }

    companion object {


        private var context: Context? = null
        private val FILE_NAME_SHARED_PREF = "KhaadiStore"

        fun setContext(context: Context) {

            DataHandler.context = context
        }

        /*fun updatePreferences(key: String, value: Long?) {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE)
            val editor = settings.edit()
            editor.putLong(key, value!!)
            editor.apply()

        }*/

        fun updatePreferences(key: String, value: JSONArray) {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE)
            val editor = settings.edit()
            editor.putString(key, value.toString())
            editor.apply()

        }

        fun getLongreferences(key: String): Long {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE)
            return settings.getLong(key, 0)
        }

        fun updatePreferences(key: String, value: Boolean?) {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE)
            val editor = settings.edit()
            editor.putBoolean(key, value!!)
            editor.apply()

        }

        fun updatePreferences(key: String, value: Int) {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE)
            val editor = settings.edit()
            editor.putInt(key, value)
            editor.apply()

        }

        fun updatePreferences(key: String, value: Double) {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE)
            val editor = settings.edit()
            editor.putLong(key, java.lang.Double.doubleToRawLongBits(value))
            editor.apply()

        }

        fun updatePreferences(key: String, value: String?) {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE)
            val editor = settings.edit()
            editor.putString(key, value)
            editor.apply()

        }

        fun getBooleanPreferences(key: String): Boolean {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, 0)
            return settings.getBoolean(key, false)

        }

        fun deletePreference(key: String) {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE)
            val editor = settings.edit()
            editor.remove(key)
            editor.apply()

        }

        fun getDoublePreference(key: String): Double {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, 0)

            return java.lang.Double.longBitsToDouble(settings.getLong(key, java.lang.Double.doubleToLongBits(0.0)))
        }

        fun getIntPreferences(key: String): Int {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, 0)
            return settings.getInt(key, -1)
        }

        // Preference for Passenger Mode
        fun getIntPreferencesPassengerMode(key: String): Int {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, 0)
            return settings.getInt(key, 0)
        }

        fun getStringPreferences(key: String): String {
            val settings = context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE)
            return settings.getString(key, "")

        }


        fun isContainKey(key:String):Boolean{
            return context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE).contains(key)
        }

        fun clear(){
            context!!.getSharedPreferences(FILE_NAME_SHARED_PREF, Context.MODE_PRIVATE).edit().clear().commit()
        }
    }


}