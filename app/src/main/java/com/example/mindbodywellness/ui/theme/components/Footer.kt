package com.example.mindbodywellness.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
// Removed: import androidx.compose.material.ripple.LocalRippleTheme (not needed if disabling ripple)
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mindbodywellless.navigation.Page
import androidx.compose.runtime.remember
// Removed: import androidx.compose.runtime.CompositionLocalProvider (not needed if disabling ripple)
import com.example.mindbodywellness.theme.AppTheme // Assuming AppTheme is correctly imported

@Composable
fun Footer(
    currentPage: Page,
    onNavigate: (Page) -> Unit,
    modifier: Modifier = Modifier // This modifier should only be applied to the root Column
) {
    val pages = listOf(Page.Home, Page.Meditate, Page.Move, Page.Sleep, Page.Profile)

    Column(
        modifier = modifier // Apply the incoming modifier to the root Column
            .fillMaxWidth()
            .background(AppTheme.colors.background)
    ) {
        Divider(
            modifier = Modifier.fillMaxWidth(),
            color = AppTheme.colors.textDescription.copy(alpha = 0.5f),
            thickness = 1.dp
        )
        Row(
            modifier = Modifier // This is now an independent modifier for the Row
                .fillMaxWidth()
                .padding(vertical = 8.dp), // Apply row-specific padding
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            pages.forEach { page ->
                val selected = page == currentPage
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null
                        ) { onNavigate(page) }
                        .padding(8.dp)
                ) {
                    Icon(
                        painter = painterResource(page.icon),
                        contentDescription = page.label,
                        tint = if (selected) AppTheme.colors.textPrimary else AppTheme.colors.textDescription, // Your chosen selected color
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = page.label,
                        style = AppTheme.typography.textFooter,
                        color = if (selected) AppTheme.colors.textPrimary else AppTheme.colors.textDescription // Your chosen selected color
                    )
                }
            }
        }
    }
}