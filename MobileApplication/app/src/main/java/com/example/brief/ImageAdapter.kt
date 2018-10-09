package com.example.brief

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class ImageAdapter : RecyclerView.Adapter<ImageAdapter.ImageHolder>() {

    private val images by lazy {
        mutableListOf<String>()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
        val view = parent.inflate(R.layout.item_image)

        return ImageHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
        val imageURL = images[position]
        holder.imageView.loadUrl(imageURL, R.drawable.ic_launcher_background)
    }

    fun addImages(list: MutableList<String>) {
        this.images.clear()
        this.images.addAll(list)
        notifyDataSetChanged()
    }

    class ImageHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById(R.id.image) as ImageView
    }

}