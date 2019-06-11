package com.zomato.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val foodItems = arrayOf(
            "burger", "pizza", "pasta",
            "pav bhaji", "chole bhature", "aloo puri",
            "dosa", "idli", "vada", "sambar",
            "sushi", "dimsum", "khao suey"
        )

        listView.adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            foodItems
        )

    }
}
