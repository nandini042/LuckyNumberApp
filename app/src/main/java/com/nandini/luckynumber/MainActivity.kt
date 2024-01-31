package com.nandini.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edittext = findViewById<EditText>(R.id.editTextText)
        val button = findViewById<Button>(R.id.button)
        val textview = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            var username = edittext.text
           var i = Intent(this,luckynumber::class.java)
            i.putExtra("Name", username)
            startActivity(i)
        }
    }
}