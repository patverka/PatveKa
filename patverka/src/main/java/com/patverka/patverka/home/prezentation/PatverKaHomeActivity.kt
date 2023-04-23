package com.patverka.patverka.home.prezentation

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.patverka.common.prezentation.BasePatverKaActivity
import com.patverka.patverka.R
import com.patverka.patverka.databinding.ActivityHomeBinding

class PatverKaHomeActivity : BasePatverKaActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
    }
}