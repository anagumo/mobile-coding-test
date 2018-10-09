package com.example.brief

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class PhotoAdapter : RecyclerView.Adapter<PhotoAdapter.PhotoHolder>() {

    private val photos by lazy {
        mutableListOf<String>()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        val view = parent.inflate(R.layout.item_photo)

        return PhotoHolder(view)
    }

    override fun getItemCount(): Int {
        return photos.size
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        val photo = photos[position]
        holder.imageView.loadUrl(photo, R.drawable.ic_launcher_background)
    }

    fun addPhotos(photos: MutableList<String>) {
        this.photos.clear()
        this.photos.addAll(photos)
        notifyDataSetChanged()
    }

    class PhotoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById(R.id.photo) as ImageView
    }

}