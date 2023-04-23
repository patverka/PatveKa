package com.patverka.common.prezentation.utils

import android.view.View

fun View.setOnSafeClickListener(clickInterval: Long = 1500L, onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener(clickInterval) {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}