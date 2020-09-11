package com.example.recyclerviewpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val itemList : List<Contacts>) : RecyclerView.Adapter<MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_contacts, parent, false)
        return MainViewHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val data = itemList[position]
        holder.apply {
            itemBinder(data)
        }

    }

}
