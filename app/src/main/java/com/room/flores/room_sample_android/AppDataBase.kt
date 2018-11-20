package com.room.flores.room_sample_android

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(
    entities = [UserEntity::class],
    version = 1
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun UserDao():UserDao

    companion object {
        private var INSTANCE: AppDataBase? = null
        fun getInstance(context: Context): AppDataBase? {
            if (INSTANCE == null) {
//                synchronized(AppDataBase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        AppDataBase::class.java, "databaseprueba").allowMainThreadQueries().build()
//                }
            }
            return INSTANCE
        }
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}