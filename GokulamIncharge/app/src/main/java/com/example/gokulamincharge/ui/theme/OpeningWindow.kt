package com.example.gokulamincharge.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun OpeningWindow(navController: NavController) {

    Surface(color = Color(0xFF7E8CF5)) {
        Column {


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                // verticalArrangement = Arrangement.Center
            )
            {
                Box(modifier = Modifier.padding(20.dp)) {
                    Text(
                        "GOKULAM HOSPITAL ADMINISTRATION", color = Color.White,
                        fontSize = 20.sp, fontWeight = FontWeight.SemiBold
                    )
                }

            }
            Divider(thickness = 5.dp, color = Color.White)
            Spacer(modifier = Modifier.height(3.dp))

            Divider(color = Color.White)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {
                TextButton(
                    onClick = {
                              navController.navigate("ReadData")
                    },
                    colors = buttonColors(Color(0xFF283593))


                ) {

                    Text(
                        "Add Data", fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        //color = Color(0xFF3543A8)
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))
                TextButton(
                    onClick = {
                              navController.navigate("WhatsApp")
                    },
                    colors = buttonColors(Color(0xFF283593))
                ) {
                    Text(
                        "Send Data", fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                        //color = Color(0xFF3543A8)
                    )
                }


            }


        }
    }
}

@Preview (showBackground = true)
@Composable
fun OpeningWindowPreview(){
   // OpeningWindow()
}

