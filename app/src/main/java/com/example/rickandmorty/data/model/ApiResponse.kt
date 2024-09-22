package com.example.rickandmorty.data.model

data class ApiResponse<T>(
    val results: List<T>)