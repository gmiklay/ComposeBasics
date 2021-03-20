package com.example.composebasics.compose_elements.activity_main

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebasics.ui.theme.ComposeBasicsTheme

@Composable
fun HelloScreenRememberSaveable() {
	var startingName by rememberSaveable { mutableStateOf("") }

	HelloContentRememberSaveable(name = startingName) {
		Log.d("from_me", "onNameChange: (String) -> Unit: $it")
		startingName = it
	}
}

@Composable
fun HelloContentRememberSaveable(name: String, onNameChange: (String) -> Unit) {
	Column(modifier = Modifier.padding(16.dp)) {
		Text(
			text = "Hello, $name",
			modifier = Modifier.padding(bottom = 8.dp),
			style = MaterialTheme.typography.h5
		)
		OutlinedTextField(
			value = name,
			onValueChange = { onNameChange(it) },
			label = { Text("Name") }
		)
	}
}

@Preview(showBackground = true)
@Composable
fun HelloScreenRememberSaveablePreview() {
	ComposeBasicsTheme {
		HelloScreenRememberSaveable()
	}
}