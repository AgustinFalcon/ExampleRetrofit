package com.example.exampleretrofit.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exampleretrofit.databinding.FragmentHomeBinding
import com.example.exampleretrofit.ui.adapter.CharacterAdapter
import com.example.exampleretrofit.viewmodel.HomeViewModel


class HomeFragment : Fragment() {

    private val homeViewModel by viewModels<HomeViewModel>()
    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)


        binding.rvPersonaje.layoutManager = LinearLayoutManager(requireContext())
        homeViewModel.getCharacters()
        homeViewModel.character.observe(viewLifecycleOwner) { characterList ->
            binding.rvPersonaje.adapter = CharacterAdapter(characterList)
        }


        return binding.root
    }


}