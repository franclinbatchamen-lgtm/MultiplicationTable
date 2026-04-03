package com.example.multiplytable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val MultiplyButton = findViewById<Button>(R.id.MultiplyButton)
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        MultiplyButton.setOnClickListener {

            // create the explicit intent
            val intent = Intent(this, MultiplicationTable::class.java)

            // add the table number to the intent
            intent.putExtra("tableNumber", editTextNumber.text.toString())

            // start the activity
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}