package com.room.flores.room_sample_android

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey (autoGenerate = true)
    var id:Int=0,
    @ColumnInfo
    var name:String,
    @ColumnInfo
    var dni:String?
)