package com.example.appue.presentation.home

import ads_mobile_sdk.h6
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun HomeScreen(navController: NavController){
    // Variable de estado para controlar si el usuario ha iniciado sesión
    var loggedIn by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
    Spacer(modifier = Modifier.weight(1f))
        //Bienvenido a la panatlla principal
        Text  ("Bienvenido a pantalla principal")
    }
}