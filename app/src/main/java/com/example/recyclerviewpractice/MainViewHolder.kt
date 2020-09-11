package com.example.recyclerviewpractice

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_contacts.view.*

class MainViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    var itemContainer : View = view

    fun itemBinder(data : Contacts) {
        itemContainer.nameTextView.text = data.name
        itemContainer.telTextView.text = data.tel
    }
}