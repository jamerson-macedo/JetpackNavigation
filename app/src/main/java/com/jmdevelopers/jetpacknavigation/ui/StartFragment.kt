package com.jmdevelopers.jetpacknavigation.ui


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jmdevelopers.jetpacknavigation.R
import kotlinx.android.synthetic.main.fragment_start.*


class StartFragment : Fragment() {
    private lateinit var listener: OnbuttonCliked

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
            listener.buttoncliked()
        }
    }

    // se a minha interface implementar a interface
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnbuttonCliked) {
            listener = context


        }
    }
    companion object {
        fun newinstance(): StartFragment {
            return StartFragment()
        }
    }

    interface OnbuttonCliked {
        fun buttoncliked()
    }

}
