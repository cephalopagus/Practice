package com.example.design

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.design.databinding.WelcomeActivityBinding

class WelcomeActivity : AppCompatActivity() {

    lateinit var binding: WelcomeActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = WelcomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(
            window,
            false
        )
        binding.materialButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

    }
}