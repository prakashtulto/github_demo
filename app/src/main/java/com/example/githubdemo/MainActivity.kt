package com.example.githubdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast()
    }


    fun Toast(){

        Toast.makeText(this,"i am so excited",Toast.LENGTH_SHORT).show()


    }

}