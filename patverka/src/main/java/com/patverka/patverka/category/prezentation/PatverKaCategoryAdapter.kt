package com.patverka.patverka.category.prezentation

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.patverka.patverka.category.domain.CategoryEnum
import com.patverka.patverka.databinding.ItemCategoryBinding
import com.patverka.patverka.utils.PatverKaConstants

class PatverKaCategoryAdapter : RecyclerView.Adapter<PatverKaCategoryAdapter.PatverKaCategoryViewHolder>() {

    private lateinit var context: Context
    private lateinit var inflater: LayoutInflater

    private val items = mutableListOf<CategoryEnum?>()

    @SuppressLint("NotifyDataSetChanged")
    fun updateItems(items: List<CategoryEnum?>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
        inflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatverKaCategoryViewHolder {
        return PatverKaCategoryViewHolder(ItemCategoryBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: PatverKaCategoryViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class PatverKaCategoryViewHolder(private val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("DiscouragedApi")
        fun bind(item: CategoryEnum?) {
            binding.nameTextView.text = item?.titleResKey?.let { context.getString(it) } ?: PatverKaConstants.EMPTY_STRING
            binding.iconImageView.setImageDrawable(ContextCompat.getDrawable(context, context.resources.getIdentifier(item?.imageResKey, "drawable", context.packageName)))
        }
    }
}