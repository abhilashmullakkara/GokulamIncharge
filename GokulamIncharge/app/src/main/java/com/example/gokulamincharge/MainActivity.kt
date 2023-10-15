package com.example.gokulamincharge

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gokulamincharge.ui.theme.GokulamInchargeTheme
import com.example.gokulamincharge.ui.theme.ward.Ward
import com.example.gokulamincharge.ui.theme.ward.readData
import java.util.Date

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GokulamInchargeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // Greeting()
					readData()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    Surface(
        // on below line we are specifying modifier and color for our app
        modifier = Modifier.fillMaxSize(), color = Color(0xFF41B79A)
    ) {

        // on the below line we are specifying
        // the theme as the scaffold.
        Scaffold(

            // in scaffold we are specifying the top bar.
            topBar = {

                // inside top bar we are specifying background color.
                TopAppBar(

                    // along with that we are specifying
                    // title for our top bar.
                    title = {

                        // in the top bar we are
                        // specifying tile as a text
                        Text(
                            // on below line we are specifying
                            // text to display in top app bar.
                            text = "UPDATE HOSPITAL DETAILS",

                            // on below line we are specifying
                            // modifier to fill max width.
                            modifier = Modifier.fillMaxWidth(),

                            // on below line we are specifying
                            // text alignment.
                            textAlign = TextAlign.Center,

                            // on below line we are specifying
                            // color for our text.
                            color =Color(0xFF651FFF)
                        )
                    })
            }) {
            // on below line we are calling connection information
            // method to display UI
            //SendWhatsAppMessage(context = LocalContext.current)

        }
    }


}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GokulamInchargeTheme {
        Greeting()
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SendWhatsAppMessage(context: Context) {
	Surface(color=Color(0xFF6776CA),modifier=Modifier.fillMaxSize()) {

	val phoneNumber = remember {
		mutableStateOf("")
	}
	Column(
		modifier = Modifier
			//.fillMaxSize()
			.padding(top= 70.dp),
//		horizontalAlignment = Alignment.CenterHorizontally,
//		verticalArrangement = Arrangement.Center,
	) {
		Text(
			text = "Send Hospital Details to WhatsApp",
			color = Color(0xFFFF9100),
			fontSize = 20.sp,
			fontWeight = FontWeight.Bold
		)
		TextField(
			value = phoneNumber.value,
			onValueChange = { phoneNumber.value = it },
			placeholder = { Text(text = "Enter whatsapp number to share") },
			modifier = Modifier
				.padding(16.dp)
				.fillMaxWidth(),
			textStyle = TextStyle(color = Color.Black, fontSize = 14.sp),
			singleLine = true,
		)
		Spacer(modifier = Modifier.height(10.dp))
		val data="testing.."
		Spacer(modifier = Modifier.height(20.dp))

		Button(
		onClick = {
		context.startActivity(
		Intent(
			Intent.ACTION_VIEW,
			Uri.parse(
			  java.lang.String.format(
				"https://api.whatsapp.com/send?phone=%s&text=%s",
				"+91"+phoneNumber.value, data)
					)
					)
				)
			},
			modifier = Modifier
				.fillMaxWidth()
				.padding(10.dp)
		) {
			Text(text = "Send Message on WhatsApp")
		}
	}
}
}
