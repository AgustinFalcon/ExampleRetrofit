package com.example.exampleretrofit.service

import com.example.exampleretrofit.model.CharacterResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST


interface ApiService {

    @GET("character")
    fun getCharacters(): Call<CharacterResponse>

}