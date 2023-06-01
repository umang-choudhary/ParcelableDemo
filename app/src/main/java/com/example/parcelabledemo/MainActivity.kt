package com.example.parcelabledemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parcelabledemo.data.Employee
import com.example.parcelabledemo.data.Student
import com.example.parcelabledemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSendData.setOnClickListener {

            val bhavish = Student(45, "Bhavish", "Rajpur")
            val umang = Employee(5178, "Umang", 15.5)

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("student", bhavish)
            intent.putExtra("employee", umang)
            startActivity(intent)

        }
    }
}