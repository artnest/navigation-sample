package com.artnest.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstNestedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.first_nested_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toSecondNestedFragmentButton: Button = view.findViewById(R.id.to_second_nested_fragment)
        toSecondNestedFragmentButton.setOnClickListener {
            val direction = FirstNestedFragmentDirections.toSecondNestedFragment()
            findNavController().navigate(direction)
        }
    }
}
