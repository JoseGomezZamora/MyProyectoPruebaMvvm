package com.example.myproyectopruebamvvm.domain

import com.example.myproyectopruebamvvm.data.CharactersRepository
import com.example.myproyectopruebamvvm.data.model.CharactersModel
import com.example.myproyectopruebamvvm.data.model.ResultsModel
import javax.inject.Inject

/** CREADO POR ARMANDO 26/05/2023
 * AQUI VA LA LOGICA DE NEGOCIO
 * O LO QUE VA HACER CON LA INFORMACION*/
class GetCharactersUseCase @Inject constructor(private val repository: CharactersRepository) {

    suspend operator fun invoke(): List<ResultsModel>{

        val character = repository.getAllCharactersFromApi()

        return character

    }

}