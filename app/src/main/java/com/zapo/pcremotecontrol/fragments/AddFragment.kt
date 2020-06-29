package com.zapo.pcremotecontrol.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.zapo.pcremotecontrol.R
import com.zapo.pcremotecontrol.viewmodel.PcsViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class AddFragment : DialogFragment() {

    companion object {
        fun newInstance() = AddFragment()
    }

    private val viewModel : PcsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.e("add fragment")
        return inflater.inflate(R.layout.add_fragment, container, false)
    }

}
