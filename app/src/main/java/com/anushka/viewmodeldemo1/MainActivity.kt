package com.anushka.viewmodeldemo1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.anushka.viewmodeldemo1.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
       @SuppressLint("SetTextI18n")
    var counter = 0
    lateinit var textview : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // initialize our view

        textview = findViewById(R.id.tvCounter)
        val  incrementButton = findViewById<Button>(R.id.incrementButton)
        val  decrementButton  = findViewById<Button>(R.id.decrementButton)


        incrementButton.setOnClickListener{
            counter ++
            updateCounterTextView()
        }

        decrementButton.setOnClickListener{
            counter --
            updateCounterTextView()
        }



    }

    fun updateCounterTextView (){
        textview.text = counter.toString()
    }
}




