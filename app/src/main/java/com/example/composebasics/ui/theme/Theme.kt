package com.example.composebasics.ui.theme

import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
	primary = Purple200,
	primaryVariant = Purple700,
	secondary = Teal200
)

private val LightColorPalette = lightColors(
	primary = Purple500,
	primaryVariant = Purple700,
	secondary = Teal200

	/* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

val lightThemeColors = lightColors(
	primary = Color(0xFF212121),
	primaryVariant = Color(0xFF484848),
	secondary = Color(0xFFF57F17),
	secondaryVariant = Color(0xFFFFB04C),
	background = Color(0xFF484848),
	surface = Color(0xFF484848),
	error = Color(0xFF484848),
	onPrimary = Color(0xFFFFFFFF),
	onSecondary = Color(0xFF000000),
	onBackground = Color(0xFF484848),
	onSurface = Color(0xFF484848),
	onError = Color(0xFF484848)
)

val darkThemeColors = darkColors(
	primary = Color(0xFF212121),
	primaryVariant = Color(0xFF484848),
	secondary = Color(0xFFF57F17),
	secondaryVariant = Color(0xFFFFB04C),
	background = Color(0xFF484848),
	surface = Color(0xFF484848),
	error = Color(0xFF484848),
	onPrimary = Color(0xFFFFFFFF),
	onSecondary = Color(0xFF000000),
	onBackground = Color(0xFF484848),
	onSurface = Color(0xFF484848),
	onError = Color(0xFF484848)
)

@Composable
fun ComposeBasicsTheme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable() () -> Unit
) {
	Log.d("from_me", "ComposeBAsicsTheme darkTheme: $darkTheme")
	val colors = if (darkTheme) {
		DarkColorPalette
	} else {
		LightColorPalette
	}

	MaterialTheme(
		colors = DarkColorPalette,
		typography = Typography,
		shapes = Shapes,
		content = content
	)
}