package com.example.test1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Spinner items
        val currencies = arrayOf("USD", "EUR", "GBP", "JPY", "CAD") // Add your currencies here

        // Creating adapter for spinners
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, currencies)

        // Drop down layout style - list view with radio button
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Attaching data adapter to spinners
        findViewById<Spinner>(R.id.fromSpinner).adapter = adapter
        findViewById<Spinner>(R.id.toSpinner).adapter = adapter

        // Convert button click listener
        findViewById<Button>(R.id.convertButton).setOnClickListener {
            // Your conversion logic here
        }
    }
}
// change 1