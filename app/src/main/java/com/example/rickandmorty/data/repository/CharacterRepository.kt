package com.example.rickandmorty.data.repository

import com.example.rickandmorty.data.model.Character
import com.example.rickandmorty.data.model.CharacterDetail
import com.example.rickandmorty.data.network.ApiService

class CharacterRepository(private val apiService: ApiService) {

    suspend fun getCharacters(): List<Character> {
        return apiService.getCharacters().results
    }

    suspend fun getCharacterDetail(id: Int): CharacterDetail {
        return apiService.getCharacterDetail(id)
    }
}