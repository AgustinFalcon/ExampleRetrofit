package com.example.exampleretrofit.model

import com.example.exampleretrofit.model.Character
import com.google.gson.annotations.SerializedName


data class CharacterResponse(
    val results: List<Character>
)