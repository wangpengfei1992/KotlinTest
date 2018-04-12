package com.wpf.kotlintest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.wpf.kotlintest.interfaceAndClass.Teacher

class KotlinTAct : AppCompatActivity() {
    private var textView: TextView? = null

    val t:Int = 1
    var m:Int = 2
    private var handler=object : Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            val msgString=msg!!.obj
            Toast.makeText(getApplicationContext(),msgString.toString(),Toast.LENGTH_SHORT).show()

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        Log.e("wpf","不可变因素=="+t+"=可变因素=="+(m++))
        textView  = findViewById(R.id.a_t1) as TextView
        textView!!.setOnClickListener{
            textView!!.setBackgroundColor(R.color.notification_icon_bg_color)
            textView!!.text = "wwwwwwwwwwww"


/*
            方式1
            val intent:Intent
            intent = Intent("com.wpf.kotlintest.BAct")
            startActivity(intent)*/

            //方式二
            startActivity(Intent(this, BAct::class.java))

            var instance = Teacher(4)
            instance.get(26)
            instance.get("赵云")
            instance.drink()
            instance.eat()
        }
    }
}
