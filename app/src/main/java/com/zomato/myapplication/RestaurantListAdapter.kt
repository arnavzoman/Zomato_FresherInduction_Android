package com.zomato.myapplication

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_restaurant.view.*

/**
 * created by championswimmer on 2019-06-11
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */

class RestaurantListAdapter(val restList: ArrayList<RestListActivity.Restaurant>): RecyclerView.Adapter<RestaurantViewHolder>() {

    override fun getItemCount(): Int {
        return restList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        Log.d("RV", "onCreateViewHolder has run")
        val layoutInflater = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val restItemView = layoutInflater.inflate(
            R.layout.list_item_restaurant, parent, false
        )

        return RestaurantViewHolder(restItemView)
    }


    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        Log.d("RV", "onBindViewHolder has run at $position")

        val rest = restList[position]

        holder.itemView.tvName.text = rest.name
        holder.itemView.tvLocation.text = rest.location
        holder.itemView.tvRating.text = rest.rating.toString()
    }

}

class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}