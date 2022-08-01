package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class CustomAdapter(private val mList:List<ItemViewModel>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        TODO("Not yet implemented")
        val view=LayoutInflater.from(parent.context).
        inflate(R.layout.card_view_design,parent,false)
        return RecyclerView.ViewHolder(view)
    }

    override fun onBindViewHolder(holder:CustomAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}