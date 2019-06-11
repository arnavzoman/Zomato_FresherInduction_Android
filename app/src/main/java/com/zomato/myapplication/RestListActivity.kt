package com.zomato.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rest_list.*
import kotlin.random.Random

class RestListActivity : AppCompatActivity() {

    data class Restaurant(
        val name: String,
        val rating: Float,
        val location: String
    )

    val restNames = arrayOf(
        "Pizza Hut", "Dominos", "KFC", "Subway", "McDonalds",
        "Starbucks", "Burger King", "Qwinnys"
    )

    val locations = arrayOf(
        "Gurgaon", "Noida", "Faridabad", "Rohini", "Janakpuri",
        "Ghaziabad", "Punjabi Bagh", "Chanakyapuri"
    )

    fun genRandomRestaurants(): ArrayList<Restaurant> {
        val restList = ArrayList<Restaurant>()

        for (i in 1..100) {
            restList.add(
                Restaurant(
                    restNames[Random.nextInt(8)],
                    Random.nextFloat() * 5,
                    locations[Random.nextInt(8)]
                )
            )
        }

        return restList
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rest_list)

        val restList = genRandomRestaurants()
        val restAdapter = RestaurantListAdapter(restList)
        rvRestList.layoutManager = LinearLayoutManager(this)
        rvRestList.adapter = restAdapter

    }
}
