package com.example.appfordosug.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appfordosug.R
import com.example.appfordosug.model.ArtObj
import kotlinx.android.synthetic.main.row_layout.view.*

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    private var myList = emptyList<ArtObj>()

    inner class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false))
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.itemView.txt_name.text = myList[position].name.toString()
        holder.itemView.txt_address.text = myList[position].adressCurrent.toString()
        holder.itemView.txt_vidOfObk.text = myList[position].vidObj.toString()
    }

    fun setData(newList: List<ArtObj>){
        myList = newList
        notifyDataSetChanged()
    }

}