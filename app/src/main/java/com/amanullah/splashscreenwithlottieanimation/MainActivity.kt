package com.amanullah.splashscreenwithlottieanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.amanullah.splashscreenwithlottieanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.appName.animate().translationY(-1000f).setDuration(2500).setStartDelay(1500)
        binding.lottie.animate().translationX(2000f).setDuration(2000).setStartDelay(2900)

        Handler().postDelayed({
            startActivity(Intent(applicationContext, ProfileActivity::class.java))
        }, 7000)
    }
}