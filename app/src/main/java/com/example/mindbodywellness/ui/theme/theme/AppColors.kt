// theme/AppColors.kt
package com.example.mindbodywellness.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class AppColors(
    val primary: Color,
    val textPrimary: Color,
    val secondary: Color,
    val onSecondary: Color,
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val outline: Color,
    val textDescription: Color,
)

internal val LightColors = AppColors(
    primary      = Color(0xFFF27A24),
    textPrimary    = Color(0xFF1C120D),
    secondary    = Color(0xFFF5EDE8),
    onSecondary  = Color(0xFF1C120D),
    background   = Color(0xFFFCFAF7),
    onBackground = Color(0xFF1C120D),
    surface      = Color(0xFFFCFAF7),
    onSurface    = Color(0xFF1C120D),
    outline      = Color(0xFFE8D9CF),
    textDescription      = Color(0xFF9C6B4A),
)

internal val DarkColors = AppColors(
    primary      = Color(0xFFF27A24),
    textPrimary    = Color(0xFFF8F3F3),
    secondary    = Color(0xFF694730),
    onSecondary  = Color(0xFFF8F3F3),
    background   = Color(0xFF24170F),
    onBackground = Color(0xFFF8F3F3),
    surface      = Color(0xFF24170F),
    onSurface    = Color(0xFFF8F3F3),
    outline      = Color(0xFF694730),
    textDescription      = Color(0xFFCCA88F),

)

val LocalAppColors = staticCompositionLocalOf { LightColors }