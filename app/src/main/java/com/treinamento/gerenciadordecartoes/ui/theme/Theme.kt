package com.example.cardmanager.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Navy = Color(0xFF172B4D)
val DeepNavy = Color(0xFF07386F)
val Blue = Color(0xFF246BEB)
val Purple = Color(0xFF6549F5)
val CardBlue = Color(0xFF1676E9)
val CardPurple = Color(0xFF4533C8)
val Aqua = Color(0xFF32C9AF)
val PaleBlue = Color(0xFFEEF3FF)
val Background = Color(0xFFF7F8FC)
val Success = Color(0xFF11845B)

private val Colors = lightColorScheme(
    primary = Blue,
    onPrimary = Color.White,
    secondary = Navy,
    background = Background,
    surface = Color.White,
    surfaceVariant = Color(0xFFF0F3FA),
    error = Color(0xFFBA1A1A),
)

@Composable
fun CardManagerTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = Colors, content = content)
}
