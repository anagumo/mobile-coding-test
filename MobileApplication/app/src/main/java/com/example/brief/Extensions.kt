package com.example.brief

import android.support.v4.widget.SwipeRefreshLayout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ViewGroup.inflate(layout: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layout, this, attachToRoot)
}

fun ImageView.loadUrl(url: String, errorResId: Int) {
    Picasso
            .get()
            .load(url)
            .error(errorResId)
            .into(this)
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun SwipeRefreshLayout.refreshing() {
    isRefreshing = true
}

fun SwipeRefreshLayout.refreshed() {
    isRefreshing = false
}