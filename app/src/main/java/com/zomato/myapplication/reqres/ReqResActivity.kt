package com.zomato.myapplication.reqres

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.zomato.myapplication.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ReqResActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_req_res)

        ApiClient.reqResClient.getUsers().enqueue(object : Callback<UsersResponse> {
            override fun onFailure(call: Call<UsersResponse>, t: Throwable) {
            }

            override fun onResponse(call: Call<UsersResponse>, response: Response<UsersResponse>) {

                Log.d("RR", response.body()?.total.toString())

            }

        })
    }
}
