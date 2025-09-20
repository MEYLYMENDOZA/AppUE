package com.example.appue.presentation.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

//nombre,correo, contraseña y confirmar contraseña
@Composable
fun RegisterScreen(navController: NavController){
    var name by remember { mutableStateOf("") }
    var email by remember {mutableStateOf("")}
    var password by remember {mutableStateOf("")}
    var repetirpassword by remember {mutableStateOf("")}

    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Spacer (modifier = Modifier.padding(16.dp))
        Text( "Registro Usuario", style = MaterialTheme.typography.titleLarge)


      //OutlinedTextField for name
        OutlinedTextField(
            value = name,
            onValueChange =  {name =it},
            label = { Text ("Nombre ")},
            placeholder = {Text("Nombre")},
            modifier =Modifier.fillMaxWidth()
        )

        //OutlinedTextField for email
        OutlinedTextField(
            value = email,
            onValueChange =  {email =it},
            label = { Text ("Correo electrónico")},
            placeholder = {Text("Correo electrónico")},
            modifier =Modifier.fillMaxWidth()
        )

        //OutlinedTextField for password
        OutlinedTextField(
            value = password,
            onValueChange =  {password =it},
            label = { Text ("Contraseña")},
            placeholder = {Text("Contraseña")},
            modifier =Modifier.fillMaxWidth()
        )

        //OutlinedTextField for repetir password
        OutlinedTextField(
            value = repetirpassword,
            onValueChange =  {repetirpassword =it},
            label = { Text ("repetir password")},
            placeholder = {Text("repetir password")},
            modifier =Modifier.fillMaxWidth()
        )

        Spacer(modifier =Modifier.height(16.dp))

        Button(onClick = {
            if (email.isNotBlank() && password.isNotBlank() && password==repetirpassword){

                navController.navigate("home")
                }
        }, modifier = Modifier.fillMaxWidth()
        ) {
            Text("Iniciar Sesión") ////1112
        }
    }
}