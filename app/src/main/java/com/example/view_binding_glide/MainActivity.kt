package com.example.view_binding_glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.view_binding_glide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val url = "https://cdn.pixabay.com/photo/2014/02/27/16/10/flowers-276014_1280.jpg"
        binding.changeButton.setOnClickListener {
            Glide
                .with(this)
                .load(url)
                .centerCrop()
//                .placeholder(R.drawable.loading_spinner)
                .into(binding.setImage);
            binding.textStatus.text = "Image Changed"
        }
    }
}