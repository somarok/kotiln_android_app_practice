package com.example.myapplication.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.data.Exam
import kotlinx.android.synthetic.main.activity_hello.*

class HelloActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        btnHello.setOnClickListener(){
            Toast.makeText(this,"toast ok!",Toast.LENGTH_LONG).show()
        }
        var intent: Intent = getIntent()
        if(intent.hasExtra("data")){
            var text = intent.getParcelableExtra<Exam>("data")
            if (text != null) {
                Toast.makeText(this,text.name,Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(this,"none",Toast.LENGTH_LONG).show()
        }

    }
}