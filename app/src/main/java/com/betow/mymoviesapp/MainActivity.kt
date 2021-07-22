package com.betow.mymoviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.betow.mymoviesapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        println(ehUmBomFilme("Vingadores:Endgame"))
        criarNumeros()
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

