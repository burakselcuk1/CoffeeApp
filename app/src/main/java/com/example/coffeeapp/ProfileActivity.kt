package com.example.coffeeapp

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        floatingActionButton1.imageTintList = ColorStateList.valueOf(Color.rgb(255,255,255))
        floatingActionButton2.imageTintList = ColorStateList.valueOf(Color.rgb(255,255,255))

    }
}