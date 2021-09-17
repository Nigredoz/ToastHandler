package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton: Button = findViewById(R.id.button_ok)

        myButton.setOnClickListener{
            val text = "Кнопка ОК"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext,text, duration)
            toast.show()
        }



    }
}