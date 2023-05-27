package com.example.myproyectopruebamvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myproyectopruebamvvm.data.model.CharactersModel
import com.example.myproyectopruebamvvm.data.model.ResultsModel
import com.example.myproyectopruebamvvm.domain.GetCharactersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersListViewModel @Inject constructor(
    private  val getCharactersUseCase: GetCharactersUseCase
): ViewModel() {

    val charactersModel = MutableLiveData<ResultsModel>()

    fun onCreate() {

        viewModelScope.launch {

            val result = getCharactersUseCase()

            if (!result.isNullOrEmpty()){
                charactersModel.postValue(result[0])
            }

        }

    }

}