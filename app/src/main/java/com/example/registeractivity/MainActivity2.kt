package com.example.registeractivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registeractivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        /*binding.tv1.setOnClickListener {
            val data = binding.tv1.text.toString()
            val intent = Intent()
            intent.putExtra("result", data)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }*/
    }
}