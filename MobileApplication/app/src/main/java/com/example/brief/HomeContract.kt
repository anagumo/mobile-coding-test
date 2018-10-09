package com.example.brief

interface HomeContract {

    interface View {
        fun showProgressBar(visibility: Boolean)
        fun renderImages(list: MutableList<String>)
    }

    interface InteractionListener {
        fun getImages()
    }
}