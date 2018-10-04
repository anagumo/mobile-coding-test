package com.example.brief

class HomePresenter(val view: HomeContract.View) : HomeContract.InteractionListener {

    override fun getItems() {
        view.renderItems(listOfPhotos())
        view.showProgressBar(false)
    }

    private fun listOfPhotos(): MutableList<String> {
        view.showProgressBar(true)
        return listOf("http://t1.gstatic.com/images?q=tbn:ANd9GcS0cjDhf5MPvwP-yjPWeAJMSsrAEb QoFeRQU78-B-F0fftw5OdBrwr4o1Uy",
                "http://t2.gstatic.com/images?q=tbn:ANd9GcQob9105oHMBENJBgrmXmTCRSs14m8FVZfOf25WTN7lO3qT-GJs6N_YXG7G",
                "http://t1.gstatic.com/images?q=tbn:ANd9GcRbm05Y2f6R4q9apNggsKZ5gLpbnkaeENis609zG_9RPq6t0gQ8jeoMW6-w",
                "http://t3.gstatic.com/images?q=tbn:ANd9GcTwe8tovwf3oZDDI3C6NVSEQ51jUP2FXjoajqBmJeTCoQ6avOMlfqbLny1d",
                "http://t0.gstatic.com/images?q=tbn:ANd9GcR5Rizfj-r_C3DbB8QLBvNo57OAZYqdUsgAYquYOuM44_vzyRctKUhZReTW",
                "http://t1.gstatic.com/images?q=tbn:ANd9GcTFIR5hoxegrBnJk9tr4KHay56t-v4IQdvszDi8xepp_nvuRGl9dhLhvW79",
                "http://t0.gstatic.com/images?q=tbn:ANd9GcSHUXhN8i5bb1J-nn_nhzx7HLlyopLPGxb4ljnbEvQu-sl7zS_mTGtsaoUc",
                "http://t1.gstatic.com/images?q=tbn:ANd9GcT1f-BwhNxzvy2aHcGLxY-eGwYN_liLnCMFi7VkAHKL53lokLa_2i_uUZgZ")
                .toMutableList()
    }

}