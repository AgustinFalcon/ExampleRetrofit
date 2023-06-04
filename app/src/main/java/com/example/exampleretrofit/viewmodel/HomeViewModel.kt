package com.example.exampleretrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.exampleretrofit.model.CharacterResponse
import com.example.exampleretrofit.repository.CharacterRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.example.exampleretrofit.model.Character


class HomeViewModel : ViewModel() {

    private val repository = CharacterRepository()


    private val _characters = MutableLiveData<List<Character>>()
    val character: LiveData<List<Character>> get() = _characters



    fun getCharacters() {
        repository.getCharacters().enqueue(object : Callback<CharacterResponse> {

            override fun onResponse(call: Call<CharacterResponse>, response: Response<CharacterResponse>) {
                if (response.isSuccessful && response.body() != null) {
                    _characters.value = response.body()!!.results
                }
            }

            override fun onFailure(call: Call<CharacterResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

}