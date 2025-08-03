package com.example.mindbodywellness.ui.theme


import android.content.Context

object OnboardingPrefs {
    private const val KEY_DONE = "onboarding_done"
    fun isDone(context: Context): Boolean =
        context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
            .getBoolean(KEY_DONE, false)

    fun markDone(context: Context) =
        context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_DONE, true)
            .apply()
}