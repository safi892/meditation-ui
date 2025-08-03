package com.example.mindbodywellness.ui.theme.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults // NEW: Import TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color // NEW: Import Color if you use hardcoded colors
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight // NEW: Example for text style
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp // NEW: Example for text size
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mindbodywellless.navigation.Page
import com.example.mindbodywellness.ui.theme.OnboardingPrefs
import com.example.mindbodywellness.ui.theme.components.Footer
import com.example.mindbodywellness.ui.theme.pages.HomeScreen
import com.example.mindbodywellness.ui.theme.pages.MeditateScreen
import com.example.mindbodywellness.ui.theme.pages.MoveScreen
import com.example.mindbodywellness.ui.theme.pages.ProfileScreen
import com.example.mindbodywellness.ui.theme.pages.SleepScreen
import com.example.mindbodywellness.ui.theme.pages.WellnessHubScreen
import com.example.mindbodywellness.ui.theme.pages.WelcomeScreen
import com.example.mindbodywellness.theme.AppTheme // Assuming AppTheme is in this package structure

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RootApp() {
    val context = LocalContext.current
    val navController = rememberNavController()

    val startDestination = remember {
        if (OnboardingPrefs.isDone(context)) Page.Home.route else Page.Welcome.route
    }

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val currentPage = Page.fromRoute(currentRoute)


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = currentPage.title,
                        // --- NEW: Edit title text appearance ---
                        style = AppTheme.typography.pageHeading, // Use your custom typography
                        color = AppTheme.colors.textPrimary ,

                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 77.dp)
                            .wrapContentWidth(Alignment.CenterHorizontally),
//                             You can also apply specific modifiers if not using AppTheme typography:

                    )
                },
                navigationIcon = {
                    if (currentPage.showUpButton && navController.previousBackStackEntry != null) {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = AppTheme.colors.textPrimary // Set icon tint
                            )
                        }
                    }
                },
                // --- NEW: Change TopAppBar colors ---
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = AppTheme.colors.background, // Background color of the TopAppBar
                    // You can also set other colors like:
                     titleContentColor = AppTheme.colors.textPrimary,
                     navigationIconContentColor = AppTheme.colors.textDescription, // Color for navigation icon (if not overridden above)
                )
            )

        },
        bottomBar = {
            if (currentPage != Page.Welcome  && currentPage != Page.WellnessHub) {
                Footer(
                    currentPage = currentPage,
                    onNavigate = { page ->
                        navController.navigate(page.route) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = startDestination,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Page.Welcome.route) {
                WelcomeScreen {
                    navController.navigate(Page.WellnessHub.route) {
                        popUpTo(Page.Welcome.route) { inclusive = true }
                    }
                }
            }
            composable(Page.WellnessHub.route) {
                WellnessHubScreen(
                    onNavigateToHome = {
                        navController.navigate(Page.Home.route) {
                            popUpTo(Page.WellnessHub.route) { inclusive = true }
                        }
                        OnboardingPrefs.markDone(context)
                    }
                )
            }
            composable(Page.Home.route) { HomeScreen() }
            composable(Page.Meditate.route) { MeditateScreen() }
            composable(Page.Move.route) { MoveScreen() }
            composable(Page.Sleep.route) { SleepScreen() }
            composable(Page.Profile.route) { ProfileScreen() }
        }
    }
}