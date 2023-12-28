package com.example.gokulamincharge.ui.theme.room

import DermetDao
import WardDao
import PediDao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.gokulamincharge.ui.theme.ward.Dermet
import com.example.gokulamincharge.ui.theme.ward.Pedi
import com.example.gokulamincharge.ui.theme.ward.Ward

@Database(entities = [Ward::class, Pedi::class, Dermet::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wardDao(): WardDao
    abstract fun pediDao(): PediDao
    abstract fun dermetDao(): DermetDao
}


