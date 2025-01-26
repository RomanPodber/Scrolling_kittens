package com.example.lister.ui.theme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lister.R
import com.example.lister.databinding.KittenitemBinding

class Kitten_adapter: RecyclerView.Adapter<Kitten_adapter.Kittenshow>(){
    val imagelist = ArrayList<Kitten1>()
    class Kittenshow(item: View): RecyclerView.ViewHolder(item) {
        val binding = KittenitemBinding.bind(item)
        fun bind(kitten: Kitten1)= with(binding){
            imageView.setImageResource(kitten.imageId)
            textview.text = kitten.comment
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Kittenshow {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kittenitem, parent, false)
        return Kittenshow(view)
    }

    override fun getItemCount(): Int {
        return imagelist.size
    }

    override fun onBindViewHolder(holder: Kittenshow, position: Int) {
        holder.bind(imagelist[position])
    }

    fun appending(image: Kitten1){
        imagelist.add(image)
        notifyDataSetChanged()
    }
}