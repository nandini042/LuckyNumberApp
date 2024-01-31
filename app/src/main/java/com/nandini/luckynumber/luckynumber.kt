package com.nandini.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class luckynumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luckynumber)
        val button = findViewById<Button>(R.id.button2)
        val lucky = findViewById<TextView>(R.id.textView3)
        var user_name = receivesname()
        var random_num = generaterandom()
        lucky.setText(""+random_num)
        button.setOnClickListener(){
            shareData(user_name,random_num)
        }
    }

    fun receivesname(): String {

        var Bundle: Bundle? = intent.extras
        var username = Bundle?.get("Name").toString()
        return username
    }
    fun generaterandom() : Int {
        val random = Random.nextInt(1000)
        return random
    }
    fun shareData (username : String, num : Int){
        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT,"$username is Lucky Today(:")
        i.putExtra(Intent.EXTRA_TEXT,"His Lucky Number is $num")
        startActivity(i)

    }
}