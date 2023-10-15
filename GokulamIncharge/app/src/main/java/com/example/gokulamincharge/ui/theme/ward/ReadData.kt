package com.example.gokulamincharge.ui.theme.ward

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Date

@SuppressLint("SimpleDateFormat")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun readData():Ward {

    var gWard by remember { mutableStateOf(Ward()) }
    var pediWard by remember { mutableStateOf(Pedi()) }
    //var gWard by remember { mutableStateOf("") }
    Surface(color = Color(0xFFACB4E0)) {
        val scroll = rememberScrollState()
        //var gMedicine
        val dateFormat = SimpleDateFormat("dd/MM/yy")
        val formattedDate = dateFormat.format(Date())
        Column(modifier = Modifier.padding(start = 20.dp)) {
            var dDate = Date()
            Text("General Ward CENSUS on $formattedDate", color = Color.Red, fontSize = 19.sp)
            Column(modifier = Modifier.verticalScroll(scroll)) {



            Row(modifier=Modifier.padding(start=20.dp)) {
                Text("Enter Medicine: ", fontSize = 20.sp)
                TextField(
                    modifier = Modifier
                        .height(60.dp)
                        .width(120.dp)
                        .padding(end = 20.dp),
                    value = gWard.generalMedicine,
                    onValueChange = { newValue ->
                        gWard = gWard.copy(generalMedicine = newValue)
                    },
                    placeholder = { Text(text = "0 ") },
                    textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                    singleLine = true
                )

            }
                Row(modifier=Modifier.padding(start=20.dp)){
                Text("          6Jn-", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                TextField(
                    modifier = Modifier
                        .height(60.dp)
                        .width(120.dp)
                        .padding(end = 10.dp),
                    value = gWard.sixJn,
                    onValueChange = { newValue ->
                        gWard = gWard.copy(sixJn = newValue)
                    },
                    placeholder = { Text(text = "0 ") },
                    textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                    singleLine = true
                )
            }
            Row {
                Text("            M1", fontSize = 20.sp)
                Spacer(modifier=Modifier.width(60.dp))
                TextField(
                    modifier = Modifier
                        .height(60.dp)
                        .width(120.dp),
                    value = gWard.m1,
                    onValueChange = { newValue ->
                        gWard = gWard.copy(m1 = newValue)
                    },
                    placeholder = { Text(text = "0 ") },
                    textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                    singleLine = true
                )
            }
            Row {
                Text("            M2", fontSize = 20.sp)
                Spacer(modifier=Modifier.width(60.dp))
                TextField(
                    modifier = Modifier
                        .height(60.dp)
                        .width(120.dp),
                    value = gWard.m2,
                    onValueChange = { newValue ->
                        gWard = gWard.copy(m2 = newValue)
                    },
                    placeholder = { Text(text = "0 ") },
                    textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                    singleLine = true
                )
            }
            Row {
                Text("             M3", fontSize = 20.sp)
                Spacer(modifier=Modifier.width(60.dp))
                TextField(
                    modifier = Modifier
                        .height(60.dp)
                        .width(120.dp),
                    value = gWard.m3,
                    onValueChange = { newValue ->
                        gWard = gWard.copy(m3 = newValue)
                    },
                    placeholder = { Text(text = "0 ") },
                    textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                    singleLine = true
                )
            }
            Row {
                Text("              M4", fontSize = 20.sp)
                Spacer(modifier=Modifier.width(70.dp))
                TextField(
                    modifier = Modifier
                        .height(60.dp)
                        .width(120.dp),
                    value = gWard.m4,
                    onValueChange = { newValue ->
                        gWard = gWard.copy(m4 = newValue)
                    },
                    placeholder = { Text(text = "0 ") },
                    textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                    singleLine = true
                )
            }
            Row {
                Text("            M5", fontSize = 20.sp)
                Spacer(modifier=Modifier.width(60.dp))
                TextField(
                    modifier = Modifier
                        .height(60.dp)
                        .width(120.dp),
                    value = gWard.m5,
                    onValueChange = { newValue ->
                        gWard = gWard.copy(m5 = newValue)
                    },
                    placeholder = { Text(text = "0 ") },
                    textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                    singleLine = true
                )
            }
                Row {
                    Text("            6Kn", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = gWard.sixKn,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(sixKn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("        un(M1)", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = gWard.unm1,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(unm1 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("        un(M2)", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = gWard.unm2,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(unm2 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("        un(M4)", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = gWard.unm4,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(unm4 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("           6EN", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = gWard.sixEN,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(sixEN = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("           7Jn", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = gWard.sevenJN,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(sevenJN = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("           7Kn", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = gWard.sevenKn,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(sevenKn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("          MICU", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = gWard.micu,
                        onValueChange = { newValue ->
                            gWard = gWard.copy(micu = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Text("Paediatric")
                Divider()
                Row {
                    Text("   Paediatrics", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = pediWard.pediatric,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(pediatric = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("            6Cn", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = pediWard.sixCn,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(sixCn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("           6An", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = pediWard.sixAn,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(sixAn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("            P1", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = pediWard.p1,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(p1 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("            P2", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = pediWard.p2,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(p2 = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("          NICU", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = pediWard.nicu,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(nicu = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("            OBN", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = pediWard.obn,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(obn = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("        POPICU", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = pediWard.popicu,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(popicu = newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }
                Row {
                    Text("           PICU", fontSize = 20.sp)
                    Spacer(modifier=Modifier.width(60.dp))
                    TextField(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp),
                        value = pediWard.picu,
                        onValueChange = { newValue ->
                            pediWard = pediWard.copy(picu= newValue)
                        },
                        placeholder = { Text(text = "0 ") },
                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
                        singleLine = true
                    )
                }



            }


        }

    }
    return gWard
}