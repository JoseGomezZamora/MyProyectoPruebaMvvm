package com.example.myproyectopruebamvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.myproyectopruebamvvm.databinding.ActivityCharactersListBinding
import com.example.myproyectopruebamvvm.ui.viewmodel.CharactersListViewModel
import dagger.hilt.android.AndroidEntryPoint

/*dagger hilt*/
@AndroidEntryPoint
class CharactersListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCharactersListBinding

    private val charactersListViewModel: CharactersListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharactersListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        charactersListViewModel.onCreate()

        println("ANTES DEL VIEWMODEL")
        charactersListViewModel.charactersModel.observe(this, {
            println("DENTRO DEL VIEWMODEL")
            println(it.results[0])
        })

        println("FUERA DEL VIEWMODEL")

    }
}