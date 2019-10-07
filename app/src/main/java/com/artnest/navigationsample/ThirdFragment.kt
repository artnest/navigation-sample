package com.artnest.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.third_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val showDialogButton: Button = view.findViewById(R.id.show_dialog_button)
        showDialogButton.setOnClickListener {
            val direction = ThirdFragmentDirections.showHelloDialog()
            findNavController().navigate(direction)
        }

        val backButton: Button = view.findViewById(R.id.back)
        backButton.setOnClickListener {
            findNavController().popBackStack()
            // findNavController().popBackStack(R.id.firstFragment, false)
            // findNavController().popBackStack(R.id.secondFragment, true)
        }
    }
}
