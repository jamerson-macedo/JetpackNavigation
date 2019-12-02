package com.jmdevelopers.jetpacknavigation.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jmdevelopers.jetpacknavigation.R
import kotlinx.android.synthetic.main.fragment_start.*


class StartFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonext.setOnClickListener {
            // ação para fazer a transição em 2 telas ele cria um id ja com os 2
            findNavController().navigate(R.id.action_startFragment_to_profileFragment)
        }
    }



}
