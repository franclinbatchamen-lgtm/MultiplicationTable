package com.example.multiplytable

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MultiplicationTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multiplication_table)

        // get the table number from the intent
        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        // convert the table number to an integer that is non-nullable
        val tableNumber = tableString!!.toInt()

        // display the heading so we can see the value in action
        val multiplicationTable = findViewById<TextView>(R.id.multiTableView)

        //start with the heading and add two new lines
        var tableDisplay: String = "$tableNumber x table\n\n"

        //declare the control variable
        var counter = 1
        while (counter <= 10) { // check the control variable
            val answer = tableNumber * counter
            tableDisplay += "$tableNumber x $counter = $answer\n"
            counter++         // updates the control variable
        }

        // set the string onto display
        multiplicationTable.text = tableDisplay

        val backButton = findViewById<Button>(R.id.backButton)

        backButton.setOnClickListener {
            finish() // closes this activity and returns to MainActivity
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}