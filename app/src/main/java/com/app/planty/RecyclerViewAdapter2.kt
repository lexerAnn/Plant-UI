package com.app.plantstoreapp

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.planty.Plant
import com.app.planty.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.itemcard.view.*

class RecyclerViewHolder2(val v:View):RecyclerView.ViewHolder(v)
class  RecyclerViewAdapter2 (val context:Context):ListAdapter<Plant,RecyclerViewHolder2>(DIFF_UTIL){
    companion object{
        val DIFF_UTIL:DiffUtil.ItemCallback<Plant> =
            object:DiffUtil.ItemCallback<Plant>(){
                override fun areItemsTheSame(oldItem: Plant, newItem: Plant): Boolean =
                    newItem.name==oldItem.name


                override fun areContentsTheSame(oldItem: Plant, newItem: Plant): Boolean =
                    newItem.name==oldItem.name
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder2 {
        return RecyclerViewHolder2( LayoutInflater.from(parent.context).inflate(R.layout.itemcard,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder2, position: Int) {
        var name=getItem(position)
        holder.v.plant_name.text=name.name
        holder.v.plant_price.text=name.price
        Glide.with(holder.itemView.context).load(name.image).into(holder.v.plant_image)
        val bundle= bundleOf("details" to name)
        holder.itemView.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment,bundle)
        }

    }


}