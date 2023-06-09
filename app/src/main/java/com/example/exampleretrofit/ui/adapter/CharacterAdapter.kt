package com.example.exampleretrofit.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exampleretrofit.databinding.ItemCharacterAdapterBinding
import com.example.exampleretrofit.model.Character


class CharacterAdapter(private val characterList: List<Character>) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {


    inner class CharacterViewHolder(val binding: ItemCharacterAdapterBinding):
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): CharacterAdapter.CharacterViewHolder {

        val binding = ItemCharacterAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(binding = binding)
    }

    override fun onBindViewHolder(holder: CharacterAdapter.CharacterViewHolder, position: Int) {
        val character = characterList[position]

        holder.binding.tvNombre.text = character.name.toString()
        holder.binding.tvGenero.text = character.gender.toString()
        //Glide.with(itemView.context).load(image).into(binding.ivPersonaje)
    }

    override fun getItemCount(): Int {
        return characterList.size
    }


}