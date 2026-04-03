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
            MultiplyButton.setOnClickListener {
                it.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100).withEndAction {
                    it.animate().scaleX(1f).scaleY(1f).duration = 100
                }

                val intent = Intent(this, MultiplicationTable::class.java)
                intent.putExtra("tableNumber", editTextNumber.text.toString())
                startActivity(intent)
            }

            // create the explicit intent
            val intent = Intent(this, MultiplicationTable::class.java)

            // add the table number to the intent
            intent.putExtra("tableNumber", editTextNumber.text.toString())

            // start the activity
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}