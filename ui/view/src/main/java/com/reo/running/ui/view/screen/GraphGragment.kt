package com.reo.running.ui.view.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.reo.running.ui.view.databinding.FragmentGraphBinding

class GraphGragment : Fragment() {
    private lateinit var binding: FragmentGraphBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGraphBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}