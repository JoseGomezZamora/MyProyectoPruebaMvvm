package com.example.myproyectopruebamvvm.data

import com.example.myproyectopruebamvvm.data.model.CharactersModel
import com.example.myproyectopruebamvvm.data.model.ResultsModel
import com.example.myproyectopruebamvvm.data.network.CharactersService
import javax.inject.Inject

class CharactersRepository @Inject constructor(
    private val api: CharactersService
    //private val charactersDao:
    ) {

    suspend fun getAllCharactersFromApi(): List<ResultsModel>{

        val response: List<ResultsModel> = api.getCharacters()
        println("QQQQQ"+response)
        return response

    }

}