package com.example.myproyectopruebamvvm.data.network

import com.example.myproyectopruebamvvm.data.model.CharactersModel
import com.example.myproyectopruebamvvm.data.model.ResultsModel
import retrofit2.Response
import retrofit2.http.GET

interface RickAndMortyApiClient {

    @GET("character")
    suspend fun getAllCharacters(): Response<List<ResultsModel>>

}