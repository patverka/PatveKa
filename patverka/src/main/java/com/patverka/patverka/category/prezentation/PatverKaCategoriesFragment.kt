package com.patverka.patverka.category.prezentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.patverka.common.prezentation.BasePatverKaFragment
import com.patverka.patverka.category.domain.CategoryEnum
import com.patverka.patverka.databinding.FragmentCategoriesBinding

class PatverKaCategoriesFragment : BasePatverKaFragment() {

    private lateinit var binding: FragmentCategoriesBinding

    private val adapter = PatverKaCategoryAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCategoriesBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding.categoriesRecyclerView.adapter = adapter
        adapter.updateItems(CategoryEnum.values().toMutableList())
    }
}