package com.a13hay.radiobuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var radioGroup:RadioGroup
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup = findViewById(R.id.gender)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var radioid = radioGroup.checkedRadioButtonId
            var radioButton:RadioButton = findViewById(radioid)
            if(radioid==-1){
                Toast.makeText(this,"Please Select at least one option",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,radioButton.text,Toast.LENGTH_SHORT).show()
            }
        }
    }
}