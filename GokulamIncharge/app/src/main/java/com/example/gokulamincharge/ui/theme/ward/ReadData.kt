package com.example.gokulamincharge.ui.theme.ward

import WardDao
import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gokulamincharge.ui.theme.GokulamInchargeTheme
import com.example.gokulamincharge.ui.theme.room.MyAppMy
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.Date

@Composable
fun ReadData(navController: NavController){
    Column {
            Row {

                TextButton(onClick = {
                    navController.popBackStack("OpeningWindow",inclusive = false)
                },modifier=Modifier.fillMaxWidth())
                {
                    Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Arrow",tint= Color.White)
                    Text("Back ", color = Color.LightGray, fontSize = 18.sp)
                }
                // Text("For detailed view rotate the screen ", color = Color.LightGray, fontSize = 18.sp)

            }

    val data=readData()

}
}

@SuppressLint("SimpleDateFormat")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun readData():Ward {
    val coroutineScope = rememberCoroutineScope()


    var gWard by remember { mutableStateOf(Ward()) }
    var pediWard by remember { mutableStateOf(Pedi()) }
    //var gWard by remember { mutableStateOf("") }
    Surface(color = Color(0xFFB5E0AC)) {
        val scroll = rememberScrollState()
        //var gMedicine
        val dateFormat = SimpleDateFormat("dd/MM/yy")
        val formattedDate = dateFormat.format(Date())
        Column(modifier = Modifier.padding(start = 20.dp)) {
            var dDate = Date()
            Text("General Ward CENSUS on $formattedDate", color = Color.Red, fontSize = 19.sp)
            Column(modifier = Modifier.verticalScroll(scroll)) {

//modifier = Modifier.align(Alignment.End
                Divider(color = Color.DarkGray)
                Row(modifier = Modifier.padding(start = 15.dp)) {
                    Text("Enter Medicine: ", fontSize = 20.sp)
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp)
                            .background(Color(0xFFB5E0AC)),

                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                        value = gWard.generalMedicine,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(generalMedicine = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 14.sp),
                        singleLine = true,
                        // colors= Color(0xFFB5E0AC),
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),

                        //colors = TextFieldDefaults.textFieldColors(MaterialTheme.colorScheme.background)

                    )

                }

                Divider(color = Color.DarkGray)
                Row(modifier = Modifier.padding(start = 15.dp)) {
                    Text("          6Jn-", fontSize = 16.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.sixJn,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(sixJn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFB5E0AC))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            M1", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.m1,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(m1 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFB5E0AC))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            M2", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.m2,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(m2 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            M3", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.m3,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(m3 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            M4", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.m4,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(m4 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            M5", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.m5,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(m5 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            6Kn", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(66.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.sixKn,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(sixKn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("        un(M1)", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.unm1,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(unm1 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("        un(M2)", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.unm2,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(unm2 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("        un(M4)", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.unm4,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(unm4 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            6EN", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 69.dp),
                        value = gWard.sixEN,
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                        onValueChange = { newValue ->
                            gWard = gWard.copy(sixEN = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //  colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }
                Divider(color = Color.DarkGray)

                Row {
                    Text("            7Jn", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.sevenJN,
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                        onValueChange = { newValue ->
                            gWard = gWard.copy(sevenJN = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("           7Kn", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.sevenKn,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(sevenKn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //  colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("         MICU", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = gWard.micu,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(micu = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }
                Text("Paediatric")
                Divider(color = Color.Red)
                Row {
                    Text("   Paediatrics", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = pediWard.pediatric,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(pediatric = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            6Cn", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = pediWard.sixCn,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(sixCn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("           6An", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(75.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = pediWard.sixAn,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(sixAn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            P1", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(75.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = pediWard.p1,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(p1 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        // colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("            P2", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(75.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = pediWard.p2,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(p2 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }
                Divider(color = Color.DarkGray)

                Row {
                    Text("          NICU", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = pediWard.nicu,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(nicu = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }
                Divider(color = Color.DarkGray)
                Row {
                    Text("            OBN", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = pediWard.obn,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(obn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }
                Divider(color = Color.DarkGray)

                Row {
                    Text("        POPICU", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = pediWard.popicu,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(popicu = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB4E0))
                    )
                }

                Divider(color = Color.DarkGray)
                Row {
                    Text("           PICU", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(70.dp))
                    TextField(
                        modifier = Modifier
                            .height(50.dp)
                            .width(120.dp)
                            .padding(end = 5.dp, start = 60.dp),
                        value = pediWard.picu,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(picu = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFB5E0AC)),
                        //colors = TextFieldDefaults.textFieldColors(Color(0xFFACB3E0))
                    )
                }


            }


        }
val context= LocalContext.current
        //
        TextButton(onClick = {
            coroutineScope.launch {
                withContext(Dispatchers.IO) {
//                val ward = Ward(
//
//                )
                    // EmployeeDB.getInstance(context).getEmployeeDao().insert(employee)

                    // Show the Toast on the main/UI thread

                    MyAppMy.database.wardDao().insertWard(gWard)
                    MyAppMy.database.pediDao().insertPedi(pediWard)
                    GlobalScope.launch(Dispatchers.Main) {
                        // flag = true
                        Toast.makeText(context, "Record inserted successfully", Toast.LENGTH_SHORT)
                            .show()
                    }


                }
            }
        },
            colors = buttonColors(Color.Blue)
            ) {
            Text("SAVE",color=Color.White, fontSize = 20.sp, fontWeight = FontWeight.SemiBold)

        }

    }
      return gWard
}

@Preview(showBackground = true)
@Composable
fun ReadPreview() {
    GokulamInchargeTheme {
        // Greeting()
        //readData()
    }
}

