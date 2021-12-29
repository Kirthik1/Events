package com.skct.events.utils

import android.content.Context
import android.content.SharedPreferences

object PreferenceUtils {

    const val EMAIL = "email"
    const val USERNAME = "username"

    private fun getSharedPreference(ctx: Context): SharedPreferences? {
        return ctx.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
    }

    private fun editor(context: Context, const: String, string: String) {
        getSharedPreference(
            context
        )?.edit()?.putString(const, string)?.apply()
    }

    fun getEmail(context: Context) = getSharedPreference(
        context
    )?.getString(EMAIL, "")

    fun setEmail(context: Context, email: String) {
        editor(
            context,
            EMAIL,
            email
        )
    }

    fun setUsername(context: Context, username: String) {
        editor(
            context,
            USERNAME,
            username
        )
    }

    fun getUsername(context: Context) = getSharedPreference(
        context
    )?.getString(USERNAME, "")

}
