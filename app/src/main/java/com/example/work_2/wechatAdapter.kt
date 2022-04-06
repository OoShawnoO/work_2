package com.example.work_2

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class wechatAdapter(val wechatItems: ArrayList<wechat_item>):RecyclerView.Adapter<wechatAdapter.wechatViewHolder>() {
    inner class wechatViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.imageView2)
        val Title = itemView.findViewById<TextView>(R.id.textView2)
        val content = itemView.findViewById<TextView>(R.id.textView3)
        val time = itemView.findViewById<TextView>(R.id.textView4)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): wechatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.wechat_item,parent,false)
        val holder = wechatViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: wechatViewHolder, position: Int) {
        val wechatitem = wechatItems[position]
        holder.content.text = wechatitem.content
        holder.Title.text = wechatitem.Title
        holder.time.text = wechatitem.time
        holder.image.setImageResource(wechatitem.image)
    }

    override fun getItemCount(): Int {
        return wechatItems.size
    }
}