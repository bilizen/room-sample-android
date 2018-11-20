package com.room.flores.room_sample_android

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface UserDao {
    @Query("SELECT id,name,dni FROM UserEntity")
    fun getAll():List<UserEntity>


    @Insert
    fun insert(userEntity: UserEntity)


}