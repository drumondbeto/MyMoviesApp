package com.betow.mymoviesapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.betow.mymoviesapp.databinding.ActivityMovieListBinding

class ListMovies: AppCompatActivity() {
    private lateinit var binding: ActivityMovieListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.moviesRV.setOnClickListener {

        }
    }
}