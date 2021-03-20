package com.example.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.composebasics.compose_elements.activity_main.HelloContentRemember
import com.example.composebasics.compose_elements.activity_main.HelloScreenViewModel
import com.example.composebasics.compose_elements.activity_main.HelloViewModel
import com.example.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {

	private val viewModel by viewModels<HelloViewModel>()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ComposeBasicsTheme() {
				Surface(modifier = Modifier.fillMaxSize()) {
					HelloContentRemember()
					//HelloScreenRememberSaveable()
					//HelloScreenViewModel(viewModel)
				}
			}
		}
	}
}