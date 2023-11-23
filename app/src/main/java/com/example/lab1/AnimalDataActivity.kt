package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AnimalDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_data)

        val desc: String = intent.getStringExtra("string")?:""
        val cat = intent.getParcelableExtra<Cat>("cat")
        val dog = intent.getParcelableExtra<Dog>("dog")
        val fish = intent.getParcelableExtra<Fish>("fish")


        val tv = findViewById<TextView>(R.id.tvSecond)

        tv.text = desc


    }
}