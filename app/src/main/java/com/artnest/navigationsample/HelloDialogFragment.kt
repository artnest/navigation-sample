package com.artnest.navigationsample

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController

class HelloDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("Hello")
            .setMessage("I'm a DialogFragment from navigation graph")
            .setPositiveButton("Ok") { dialog, _ ->
                // dialog.dismiss() // equivalent to popBackStack()
                findNavController().popBackStack(R.id.secondFragment, false)
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                // dialog.cancel() // equivalent to popBackStack()
                findNavController().popBackStack()
            }
            .create()
    }
}