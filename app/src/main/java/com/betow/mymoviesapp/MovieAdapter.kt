package com.betow.mymoviesapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.betow.mymoviesapp.databinding.MovieItemBinding

class MovieViewHolder(val binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root)

class MovieAdapter(val movieClickListener:()->Unit) :
    RecyclerView.Adapter<MovieViewHolder>() {
    val movieList: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = MovieItemBinding.inflate(inflater, viewGroup, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: MovieViewHolder, position: Int) {
        val item = movieList[position]
        viewHolder.binding.titulo = item
        viewHolder.binding.itemBackground.setOnClickListener{
            movieClickListener()
        }
    }
    override fun getItemCount() = movieList.size

    fun addItems(list: List<String>) {
        movieList.addAll(list)
        notifyDataSetChanged()
    }
}
