package com.betow.mymoviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.betow.mymoviesapp.databinding.ActivityMovieDetailsBinding


class DetailsMovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTitle.text = "Your Name"
    }

    private fun initLayout(){
        binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun ehUmBomFilme(filme: String?):String {
        return when {
            filme.isNullOrEmpty() -> "Erro, precisa de um nome para avaliar"
            filme.length < 5 -> "Um nome tão curto não pode ser bom"
            else -> "É, talvez seja bom"
        }
    }

    fun criarNumeros() {
        val list  = List(10){it+1}
        var mutableList = mutableListOf<String>()
        list.forEach {
            mutableList.add(if (it%2 == 0 ) it.toString() else "-")
        }
        println(mutableList)
    }
}

