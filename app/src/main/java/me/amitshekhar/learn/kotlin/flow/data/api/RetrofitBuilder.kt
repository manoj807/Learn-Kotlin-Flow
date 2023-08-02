package me.amitshekhar.learn.kotlin.flow.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitBuilder {

    private const val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"

    private  fun getRetrofit():Retrofit
    {
        return  Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
   /* private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
*/

    val apiService:ApiService= getRetrofit().create(ApiService::class.java)
    //val apiService: ApiService = getRetrofit().create(ApiService::class.java)

}