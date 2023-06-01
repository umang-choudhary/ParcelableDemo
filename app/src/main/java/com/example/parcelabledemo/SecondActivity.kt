package com.example.parcelabledemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.parcelabledemo.data.Employee
import com.example.parcelabledemo.data.Student
import com.example.parcelabledemo.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val student = intent.getParcelableExtra<Student>("student")
        val employee = intent.getParcelableExtra<Employee>("employee")

        if (student != null && employee != null) {
            Toast.makeText(this@SecondActivity, "Data got successfully", Toast.LENGTH_LONG).show()

            binding.textViewData.text = "Data : \n" +
                    "Student Info: ${student.rollNo}, ${student.name}, ${student.address} \n" +
                    "Employee Info: ${employee.id}, ${employee.fullName}, ${employee.ctc}"
        }

    }
}