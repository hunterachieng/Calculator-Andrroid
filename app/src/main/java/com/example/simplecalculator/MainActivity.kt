package com.example.simplecalculator

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

        var number1 = findViewById<EditText>(R.id.etNumber1)
        var number2 = findViewById<EditText>(R.id.etNumber2)
        var add = findViewById<Button>(R.id.btnAdd)
        var sub = findViewById<Button>(R.id.btnSubtract)
        var multiply = findViewById<Button>(R.id.btnMultiply)
        var modulus = findViewById<Button>(R.id.btnModulus)
        var result = findViewById<TextView>(R.id.tvResult)


        add.setOnClickListener{
            var num1 = number1.text.toString().toInt()
            var num2 = number2.text.toString().toInt()

            var sum = num1 + num2
            result.text = "$sum"
        }

        sub.setOnClickListener {
            var num1 = number1.text.toString().toInt()
            var num2 = number2.text.toString().toInt()

            var subtract = num1 - num2
            result.text = "$subtract"
        }

        multiply.setOnClickListener {
            var num1 = number1.text.toString().toInt()
            var num2 = number2.text.toString().toInt()

            var mult = num1 * num2
            result.text = "$mult"
        }
        modulus.setOnClickListener {
            var num1 = number1.text.toString().toInt()
            var num2 = number2.text.toString().toInt()

            var mod = num1 % num2
            result.text = "$mod"
        }

    }
}