package com.example.projetolocalizaentretelas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projetolocalizaentretelas.databinding.MoviesItemBinding

class MoviesViewHolder(val binding: MoviesItemBinding) : RecyclerView.ViewHolder(binding.root)


class MoviesAdapter:RecyclerView.Adapter<MoviesViewHolder>() {
    val listMovies: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val inflater =LayoutInflater.from(parent.context)
        val binding = MoviesItemBinding.inflate(inflater, parent, false)
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        // val item = listMovies[position]
        val item = listMovies.get(position)
        holder.binding.tituloTV.text = item
    }

    override fun getItemCount(): Int {
        return listMovies.size
    }

    fun addItemList(list: List<String>){
        listMovies.addAll(list)
        notifyDataSetChanged()
    }

}