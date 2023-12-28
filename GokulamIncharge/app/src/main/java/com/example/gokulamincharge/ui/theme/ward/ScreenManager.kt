package com.example.gokulamincharge.ui.theme.ward

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gokulamincharge.WhatsApp
import com.example.gokulamincharge.ui.theme.OpeningWindow


@Composable
fun MyApp(){
    ScreenManager()
}

@Composable
fun ScreenManager() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "OpeningWindow") {
        composable("OpeningWindow") {
            OpeningWindow(navController)
        }
        composable("ReadData") {
            ReadData(navController)
        }
        composable("WhatsApp") {
            WhatsApp(navController)
        }


       // WhatsApp


    }

}