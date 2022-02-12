package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindig : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindig= ActivityMainBinding.inflate(layoutInflater)   //layoutInflator  yek properti marbot br superclass ast
        val view = bindig.root
        setContentView(view)   //in tor ham mishavafd nevesht  setContentView(binding.root)

    }

}