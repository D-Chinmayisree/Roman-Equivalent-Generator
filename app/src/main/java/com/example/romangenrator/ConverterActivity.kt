package com.example.romangenrator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import RomanNumber
import android.widget.Toast
import java.lang.Exception


class ConverterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var txtNumber: EditText
        lateinit var btnConvert: Button
        lateinit var txtResult: TextView

        txtNumber = findViewById(R.id.txtNumber) as EditText
        btnConvert = findViewById(R.id.btnConvert) as Button
        txtResult = findViewById(R.id.txtResult) as TextView

        btnConvert.setOnClickListener({

            try {

                var number = txtNumber.text.toString().toInt()
                var obj_Roman = RomanNumber()
                var roman_num = obj_Roman.toRoman(number)
                txtResult.text = roman_num
                Toast.makeText(this,"Roman Equivalent is ${roman_num}",Toast.LENGTH_LONG).show()

            }
            catch (e: Exception)
            {
                Toast.makeText(this,"Provide Valid Number",Toast.LENGTH_LONG).show()
                txtNumber.setText(" ")
                txtResult.setText(" ")
            }
        })
    }
}
