package com.betow.mymoviesapp

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.betow.mymoviesapp.databinding.MovieItemBinding

class MoviesViewHolder(val binding: MoviesItemBinding) : RecyclerView.ViewHolder(binding.root)

class MoviesAdapter:
    RecyclerView.Adapter<MoviesViewHolder>() {
        val movieList: MutableList<String> = mutableListOf()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = MovieItemBinding.inflate(inflater, parent, false) //a concluir
            return MoviesViewHolder(binding)
        }

        override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
//          val item = movieList[position]
            val item = movieList.get(position)
            holder.binding.detailsId.text = item
        }

        override fun getItemCount() : Int {
            return listMovies.size
    }
    fun setItems(list: List<Movie>) {
        movieList.clear()
        movieList.addAll(list)

        //Atualiza a lista na hora
        notifyDataSetChanged()
    }

    }