package com.example.recyclerviewsimple_kotlin.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsimple_kotlin.R
import com.example.recyclerviewsimple_kotlin.model.DataModel

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyHolder>() {

    private lateinit var list: MutableList<DataModel>

    inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image: ImageView =itemView.findViewById(R.id.image)
        val text:TextView=itemView.findViewById(R.id.text_below_image)

    }

    fun updateImageList(list: MutableList<DataModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_design, parent, false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.text.text = list[position].text
    }

    override fun getItemCount(): Int {
        return list.size
    }
}