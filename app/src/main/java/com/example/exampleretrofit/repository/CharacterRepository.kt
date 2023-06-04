package com.example.exampleretrofit.repository

import com.example.exampleretrofit.model.CharacterResponse
import com.example.exampleretrofit.service.ApiService
import com.example.exampleretrofit.service.RetrofitService
import retrofit2.Call


class CharacterRepository {

    private val retrofit: ApiService = RetrofitService.getInstance()


    fun getCharacters(): Call<CharacterResponse> {
        return retrofit.getCharacters()
    }



}