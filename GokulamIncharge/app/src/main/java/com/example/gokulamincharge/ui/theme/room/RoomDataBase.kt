package com.example.gokulamincharge.ui.theme.room
import android.app.Application
import androidx.room.Room

class MyAppMy : Application() {
    companion object {
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "Gokulamdatabse.dbf"
        ).build()
    }
}



