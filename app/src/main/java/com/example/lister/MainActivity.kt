package com.example.lister

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lister.databinding.ActivityMainBinding
import com.example.lister.ui.theme.Kitten1
import com.example.lister.ui.theme.Kitten_adapter


class MainActivity : ComponentActivity() {
    lateinit var binding: ActivityMainBinding
    private val idlist = listOf(R.drawable.kitten, R.drawable.kitten2,R.drawable.kitten3,
        R.drawable.kitten4,R.drawable.kitten5,R.drawable.kitten6,R.drawable.kitten7)
    private var counter = 0
    private val adapter = Kitten_adapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@MainActivity)
            rcView.adapter = adapter
            for(i in 0..7){
                val kitten = Kitten1(idlist[counter], "Kitten")
                adapter.appending(kitten)
                counter++
            }
        }
    }
}