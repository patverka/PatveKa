package com.patverka.patverka.welcome.prezentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.patverka.common.prezentation.BasePatverKaFragment
import com.patverka.common.prezentation.utils.setOnSafeClickListener
import com.patverka.patverka.databinding.FragmentWelcomeBinding

class PatverKaWelcomeFragment : BasePatverKaFragment() {
    private lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        binding.customerButton.setOnSafeClickListener {
            findNavController().navigate(PatverKaWelcomeFragmentDirections.actionGlobalPatverKaCategoriesFragment())
        }
    }
}