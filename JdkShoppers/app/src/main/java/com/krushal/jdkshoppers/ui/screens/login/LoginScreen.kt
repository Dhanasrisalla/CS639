package com.krushal.jdkshoppers.ui.screens.login

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(
    viewModel: LoginViewModel, onLoginSuccess: () -> Unit
) {

    val context = LocalContext.current
    var userName by remember {
        mutableStateOf(TextFieldValue())
    }
    var password by remember {
        mutableStateOf(TextFieldValue())
    }


    Column(Modifier.padding(20.dp)) {

        Spacer(modifier = Modifier.size(190.dp))

        TextField(
            value = userName,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { userName = it },
            placeholder = { Text(text = "Enter user name") }
        )
        Spacer(modifier = Modifier.size(10.dp))

        TextField(
            value = password,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation(),
            placeholder = { Text(text = "Enter password") }
        )

        Spacer(modifier = Modifier.size(10.dp))

        Button(
            onClick = {
                if (viewModel.login(userName.text, password.text)) {
                    onLoginSuccess()
                    Toast.makeText(context, "Logged in successfully", Toast.LENGTH_SHORT).show()
                }
                else
                    Toast.makeText(context, "Invalid credentials", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Login")
        }


    }
}