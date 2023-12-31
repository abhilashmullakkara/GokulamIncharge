package com.example.gokulamincharge.ui.theme.ward

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class Ward (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var generalMedicine:String="",
    var sixJn :String="0",
    var m1:String="0",
    val m2:String="0",
    val m3:String="0",
    val m4:String="0",
    val m5:String="0",
    val sixKn :String="0",
    val unm1:String="0",
    val unm2:String="0",
    val unm3:String="0",
    val unm4:String="0",
    val unm5:String="0",
    val sixEN:String="0",
    val sevenJN:String="0",
    val sevenKn:String="0",
    val micu:String="0",

    )
@Entity
data class Pedi (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var pediatric:String="",
    var sixCn :String="0",
    var p1:String="0",
    val p2:String="0",
    val p3:String="0",
    val sixAn :String="0",
    val picu:String="0",
    val popicu:String="0",
    val nicu:String="0",
    val obn:String="0"

    )
@Entity
data class Dermet(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var dermet:String="0",
    var oneBn:String="0"
)
