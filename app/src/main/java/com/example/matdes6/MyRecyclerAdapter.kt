package com.example.matdes6

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MyRecyclerAdapter(val list: List<RecyclerData>) : RecyclerView.Adapter<MyRecyclerAdapter.MyRecyclerHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): MyRecyclerAdapter.MyRecyclerHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item,parent,false)
       return MyRecyclerHolder(view)
    }

    override fun getItemCount(): Int {return list.size}

    override fun onBindViewHolder(holder: MyRecyclerAdapter.MyRecyclerHolder, position: Int) {
        holder.bind(position,list)
    }

    class MyRecyclerHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView = itemView.findViewById<TextView>(R.id.text_view)
        val imageView = itemView.findViewById<ImageView>(R.id.image_view)

        fun bind(position: Int, list: List<RecyclerData>){
            textView.text = list[position].list
            when(position % 4){
                0 -> imageView.setImageResource(R.mipmap.fruits1)
                1 -> imageView.setImageResource(R.mipmap.fruits2)
                2 -> imageView.setImageResource(R.mipmap.fruits3)
                3 -> imageView.setImageResource(R.mipmap.fruits4)
            }
        }

    }
}
