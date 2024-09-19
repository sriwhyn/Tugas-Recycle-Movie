package com.sriwahyuni.latihan6.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sriwahyuni.latihan6.R
import com.sriwahyuni.latihan6.model.ModelBuah

class BuahAdapter (val itemList: ArrayList<ModelBuah>)
    : RecyclerView.Adapter<BuahAdapter.MyViewHolder>(){

    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
//        deklarasi widget dari item layout
        var itemImage : ImageView
        var itemText : TextView

//        new*
        init{
            itemImage = itemView.findViewById(R.id.gambar)
            itemText = itemView.findViewById(R.id.nama_buah)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        kita deklarasi layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_costum_buah, parent, false)
        return MyViewHolder(nView)
    }


    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].judul)
    }


}



