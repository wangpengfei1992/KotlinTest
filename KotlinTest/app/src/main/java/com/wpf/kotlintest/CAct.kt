package com.wpf.kotlintest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin2)
        val text:TextView = findViewById(R.id.a_t3) as TextView
        text.setOnClickListener{
            startActivity(Intent(this, KotlinTAct::class.java))
        }
    }
}
