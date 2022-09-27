package com.utn.practicebottombar.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.utn.practicebottombar.R

class CFragment : Fragment() {
    lateinit var v : View
    lateinit var button : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_c, container, false)

        button = v.findViewById(R.id.button)

        return v
    }

    override fun onStart() {
        super.onStart()

        button.setOnClickListener {
            val action = CFragmentDirections.actionCFragmentToSettingsActivity()
            v.findNavController().navigate(action)
        }

    }

}