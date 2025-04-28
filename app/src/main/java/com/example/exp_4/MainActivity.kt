package com.example.exp_4

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declare variables
    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText
    private lateinit var editTextAddress: EditText
    private lateinit var editTextMarks: EditText
    private lateinit var editTextTotal: EditText
    private lateinit var editTextGrade: EditText
    private lateinit var editTextStatus: EditText
    private lateinit var buttonSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize variables
        editTextName = findViewById(R.id.editTextName)
        editTextAge = findViewById(R.id.editTextAge)
        editTextAddress = findViewById(R.id.editTextAddress)
        editTextMarks = findViewById(R.id.editTextMarks)
        editTextTotal = findViewById(R.id.editTextTotal)
        editTextGrade = findViewById(R.id.editTextGrade)
        editTextStatus = findViewById(R.id.editTextStatus)
        buttonSubmit = findViewById(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()
            val address = editTextAddress.text.toString()
            val marks = editTextMarks.text.toString()
            val total = editTextTotal.text.toString()
            val grade = editTextGrade.text.toString()
            val status = editTextStatus.text.toString()

            val message = """
                Name: $name
                Age: $age
                Address: $address
                Marks: $marks
                Total: $total
                Grade: $grade
                Status: $status
            """.trimIndent()

            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}
