package com.betow.mymoviesapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.betow.mymoviesapp.databinding.ActivityMovieListBinding

class MovieList: AppCompatActivity() {
    private lateinit var binding: ActivityMovieListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieListBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val adapter = MovieAdapter()
        binding.moviesRV.adapter = adapter
        val list = List(10){"Your Name $it"}
        adapter.addItems(list)
    }
}