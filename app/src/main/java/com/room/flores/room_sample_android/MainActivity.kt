package com.room.flores.room_sample_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db =AppDataBase.getInstance(applicationContext)
        val user=UserEntity(0,"Bill Flores","72089545")

        button.setOnClickListener(View.OnClickListener {
            db!!.UserDao().insert(user)
            Log.i("information",db.UserDao().getAll().toString())
        })
    }
}
