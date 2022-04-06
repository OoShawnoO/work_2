package com.example.work_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class toucherAdapter(val toucherItems: ArrayList<toucher_item>):RecyclerView.Adapter<toucherAdapter.toucherViewHolder>() {
    inner class toucherViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.imageView_t1)
        val Title = itemView.findViewById<TextView>(R.id.textView_t1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): toucherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.toucher_item,parent,false)
        val holder = toucherViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: toucherViewHolder, position: Int) {
        val wechatitem = toucherItems[position]
        holder.Title.text = wechatitem.Title
        holder.image.setImageResource(wechatitem.image)
    }

    override fun getItemCount(): Int {
        return toucherItems.size
    }
}