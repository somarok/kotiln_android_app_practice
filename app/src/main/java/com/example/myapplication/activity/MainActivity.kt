package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.data.Exam
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sentence : String = "finally, you've done it"
        tv_name.text = sentence

        btnGoHello.setOnClickListener{
           var intent: Intent = Intent(this, HelloActivity::class.java)
            intent.putExtra("data",Exam("yunzi",100,"thd"))
            startActivity(intent)
        }

    }
}