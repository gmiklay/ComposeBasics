package com.example.composebasics.compose_elements.activity_main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HelloContentRemember() {
	Column(modifier = Modifier.padding(16.dp)) {
		var name by remember { mutableStateOf("") }
		Text(
			text = "Hello, $name",
			modifier = Modifier.padding(bottom = 8.dp),
			style = MaterialTheme.typography.h5
		)
		OutlinedTextField(
			value = name,
			onValueChange = { name = it },
			label = { Text("Name") }
		)
	}
}