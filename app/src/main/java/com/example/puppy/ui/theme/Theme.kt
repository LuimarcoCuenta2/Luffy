package com.example.puppy.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LuffyColorScheme = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = DarkPrimaryColor,

    secondary = DarkPrimaryColor,
    onSecondary = WhiteColor,

    tertiary = AccentColor,
    onTertiary = WhiteColor,

    background = WhiteColor,
    surface = WhiteColor,

    onBackground = DarkPrimaryColor,
    onSurface = DarkPrimaryColor
)

@Composable
fun LuffyTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LuffyColorScheme,
        typography = Typography,
        content = content
    )
}