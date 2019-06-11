package com.zomato.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()

            val a = editText.text.toString().toInt()
            val b = editText2.text.toString().toInt()

            val c = (a + b).toString()

            textView.text = c
        }

        button4.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }
    }
}
