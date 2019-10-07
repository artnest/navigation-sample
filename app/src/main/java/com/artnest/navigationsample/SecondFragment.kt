package com.artnest.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.second_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title: TextView = view.findViewById(R.id.title)
        title.text = "${title.text}: ${args.amount}"

        val toThirdFragmentButton: Button = view.findViewById(R.id.to_third_fragment)
        toThirdFragmentButton.setOnClickListener {
            val direction = SecondFragmentDirections.toThirdFragment()
            findNavController().navigate(direction)
        }

        val toNestedGraphButton: Button = view.findViewById(R.id.to_nested_graph)
        toNestedGraphButton.setOnClickListener {
            val direction = SecondFragmentDirections.toNestedGraph()
            findNavController().navigate(direction)
        }
    }
}
