package com.amelia.klinik.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amelia.klinik.R
import com.amelia.klinik.model.ModelMenuIcon

class AdapterMenuIcon(
    val itemMenuList : List<ModelMenuIcon>
) : RecyclerView.Adapter<AdapterMenuIcon.MyViewHolder>(){
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        var imgIcon : ImageView = itemView.findViewById(R.id.imgIcon)
        var txtMenu : TextView = itemView.findViewById(R.id.txtMenu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menuicon,parent,false)
        return  MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMenuList[position]
        holder.txtMenu.text = currentItem.namaMenu
        holder.imgIcon.setImageResource(currentItem.imgMenu)
    }
}