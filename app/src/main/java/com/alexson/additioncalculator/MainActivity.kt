package com.alexson.additioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operation()
    }
    private fun operation(){
        val fNumber = findViewById<EditText>(R.id.first_number)
        val sNumber = findViewById<EditText>(R.id.second_number)
        val result = findViewById<TextView>(R.id.result)
        val sum = findViewById<Button>(R.id.sum)

        sum.setOnClickListener{
            result.text =  (fNumber.text.toString().toDouble()+sNumber.text.toString().toDouble()).toString()
            Toast.makeText(this,  "Result "+result.text, Toast.LENGTH_LONG).show()
        }
    }
}


