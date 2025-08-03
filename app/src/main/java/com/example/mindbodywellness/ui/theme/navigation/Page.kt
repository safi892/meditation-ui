package com.example.mindbodywellless.navigation

import androidx.annotation.DrawableRes
import com.example.mindbodywellness.R // Make sure this is correctly imported

sealed class Page(
    val route: String,
    @DrawableRes val icon: Int = 0,
    val label: String = "",
    val title: String = "", // NEW: Title for the TopAppBar
    val showUpButton: Boolean = false // NEW: Control if an Up button should be shown
) {
    // For Welcome, you might not want it in the footer, but it's a "page"
    object Welcome    : Page("welcome", title = "Welcome ") // No icon/label for footer
    object WellnessHub: Page("wellnessHub", title = "Meditation Focus", showUpButton = true) // No icon/label for footer
    object Home       : Page("home",    R.drawable.home,    "Home", "Home", false) // Home typically doesn't have an Up button
    object Meditate   : Page("meditate",R.drawable.hand,    "Meditate", "Meditate", true)
    object Move       : Page("move",    R.drawable.move,    "Move", "Move", true)
    object Sleep      : Page("sleep",   R.drawable.night_sleep, "Sleep", "Sleep", true)
    object Profile    : Page("profile", R.drawable.profile, "Profile", "Profile", true)

    companion object {
        fun fromRoute(route: String?): Page {
            return when (route) {
                Welcome.route -> Welcome
                WellnessHub.route -> WellnessHub
                Home.route -> Home
                Meditate.route -> Meditate
                Move.route -> Move
                Sleep.route -> Sleep
                Profile.route -> Profile
                else -> Home // Default to Home if route is unknown or null
            }
        }
    }
}