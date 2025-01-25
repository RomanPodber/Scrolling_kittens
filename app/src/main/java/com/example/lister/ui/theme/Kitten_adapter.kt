package com.example.lister.ui.theme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lister.databinding.KittenitemBinding

class Kitten_adapter: RecyclerView.Adapter<Kitten_adapter.Kittenshow>(){

    class Kittenshow(item: View): RecyclerView.ViewHolder(item) {
        val binding = KittenitemBinding.bind(item)
        fun bind(kitten: Kitten1)= with(binding){
            imageView.setImageResource(kitten.imageId)
            textview.text = kitten.comment
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Kittenshow {
        val view = LayoutInflater.from(parent.context)
        return TODO("Provide the return value")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Kittenshow, position: Int) {
        TODO("Not yet implemented")
    }
}