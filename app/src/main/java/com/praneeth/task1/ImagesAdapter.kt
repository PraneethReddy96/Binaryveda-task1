package com.praneeth.task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ImagesAdapter(var imageList: MutableList<Int>) : RecyclerView.Adapter<ImagesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_uploads_item_layout,parent,false)
        return ImagesViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {

        holder.apply {

            Glide.with(uploadsImage).load(imageList[position]).into(uploadsImage)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

}

class ImagesViewHolder(view: View): RecyclerView.ViewHolder(view) {

val uploadsImage = view.findViewById<ImageView>(R.id.ivUploadsItemImage)

}
