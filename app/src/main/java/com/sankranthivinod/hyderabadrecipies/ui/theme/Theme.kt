package com.sankranthivinod.hyderabadrecipies.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = BluePrimary,
    onPrimary = White,
    primaryContainer = BluePrimaryVariant,
    secondary = GreenSecondary,
    onSecondary = White,
    secondaryContainer = GreenSecondaryVariant,
    background = BackgroundLight,
    onBackground = Black,
    surface = SurfaceLight,
    onSurface = Black,
    error = ErrorRed,
    onError = White
)

private val DarkColorScheme = darkColorScheme(
    primary = BluePrimaryDark,
    onPrimary = Black,
    primaryContainer = BluePrimaryVariantDark,
    secondary = GreenSecondaryDark,
    onSecondary = Black,
    secondaryContainer = GreenSecondaryVariantDark,
    background = BackgroundDark,
    onBackground = White,
    surface = SurfaceDark,
    onSurface = White,
    error = ErrorDark,
    onError = Black
)

@Composable
fun HyderabadRecipesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
