package com.example.aviatickets.model.network

import com.example.aviatickets.model.entity.Offer
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("offer_list/") // Replace "offers" with the actual endpoint
    fun getOffers(): Call<List<Offer>>
}