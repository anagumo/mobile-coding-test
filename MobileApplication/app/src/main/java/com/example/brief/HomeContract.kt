package com.example.brief

interface HomeContract {

    interface View {
        fun showProgressBar(visibility: Boolean)
        fun renderItems(photos: MutableList<String>)
    }

    interface InteractionListener {
        fun getItems()
    }
}