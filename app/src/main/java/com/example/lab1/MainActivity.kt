package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncat.setOnClickListener{//go to activity animal cat

            val cat = Cat("Мурка", 3)

            val intent = Intent(this, AnimalDataActivity::class.java)
            intent.putExtra("string", binding.dsccat.text.toString())
            intent.putExtra("cat", cat)
            startActivity(intent)
        }

        binding.btndog.setOnClickListener{
            val dog = Dog("Полкан", 5)

            val intent = Intent(this, AnimalDataActivity::class.java)
            intent.putExtra("string", binding.dscdog.text.toString())
            intent.putExtra("dog", dog)
            startActivity(intent)
        }

        binding.btnfish.setOnClickListener {
            val fish = Fish("Гуппі", 1)

            val intent = Intent(this, AnimalDataActivity::class.java)
            intent.putExtra("string", binding.dscfish.text.toString())
            intent.putExtra("fish", fish)
            startActivity(intent)
        }
    }
}