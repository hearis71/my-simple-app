package com.example.simpleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtCounter = findViewById<TextView>(R.id.txtCounter)
        val btnAdd = findViewById<MaterialButton>(R.id.btnAdd)

        btnAdd.setOnClickListener {
            counter++
            txtCounter.text = counter.toString()
        }
    }
}
