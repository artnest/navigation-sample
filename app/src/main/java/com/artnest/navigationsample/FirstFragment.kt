package com.artnest.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toSecondFragmentButton: Button = view.findViewById(R.id.to_second_fragment)
        toSecondFragmentButton.setOnClickListener {
            val direction = FirstFragmentDirections.toSecondFragment(amount = "100")
            // findNavController().navigate(R.id.secondFragment)
            findNavController().navigate(direction)
        }

        val toSecondActivityButton: Button = view.findViewById(R.id.to_second_activity)
        toSecondActivityButton.setOnClickListener {
            val direction = FirstFragmentDirections.toSecondActivity()
            // findNavController().navigate(R.id.secondActivity)
            findNavController().navigate(direction)
        }
    }
}
