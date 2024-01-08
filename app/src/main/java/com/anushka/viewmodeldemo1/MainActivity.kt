package com.anushka.viewmodeldemo1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
       @SuppressLint("SetTextI18n")
       lateinit var binding: ActivityMainBinding
       lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.count.observe(
            this, {
                binding.textView2.text = "count:$it"
            }
        )

        binding.button2.setOnClickListener(){
            viewModel.update_counter()
        }

    }
}




