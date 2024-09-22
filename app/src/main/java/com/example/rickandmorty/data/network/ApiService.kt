package com.example.rickandmorty.data.network

import com.example.rickandmorty.data.model.ApiResponse
import com.example.rickandmorty.data.model.Character
import com.example.rickandmorty.data.model.CharacterDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("character")
    suspend fun getCharacters(): ApiResponse<Character>

    @GET("character/{id}")
    suspend fun getCharacterDetail(@Path("id") id: Int): CharacterDetail
}