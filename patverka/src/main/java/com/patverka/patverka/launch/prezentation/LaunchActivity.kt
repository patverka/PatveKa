package com.patverka.patverka.launch.prezentation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.patverka.patverka.R
import com.patverka.patverka.databinding.ActivityLaunchBinding
import com.patverka.patverka.home.prezentation.PatverKaHomeActivity

@SuppressLint("CustomSplashScreen")
class LaunchActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLaunchBinding
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_launch)
        setupViews()
    }

    private fun setupViews() {
        Glide.with(this).load(R.drawable.ic_construction).into(binding.imageView)
        handler.postDelayed({
            startActivity(Intent(this, PatverKaHomeActivity::class.java))
            finish()
        }, LAUNCH_SCREEN_DELAY)
    }

    companion object {
        private const val LAUNCH_SCREEN_DELAY = 5000L
    }
}