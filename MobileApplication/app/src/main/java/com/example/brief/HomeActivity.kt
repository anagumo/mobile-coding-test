package com.example.brief

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity(), HomeContract.View {

    lateinit var recyclerView: RecyclerView

    private val presenter: HomeContract.InteractionListener by lazy {
        HomePresenter(this)
    }

    private val imageAdapter by lazy {
        val adapter = ImageAdapter()
        adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recyclerView = findViewById(R.id.items_recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = imageAdapter

        swipeContainer.setOnRefreshListener {
            presenter.getImages()
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.getImages()
    }

    override fun showProgressBar(visibility: Boolean) {
        if (visibility) progressBar.visible() else progressBar.invisible()
    }

    override fun renderImages(list: MutableList<String>) {
        imageAdapter.addImages(list)
        swipeContainer.refreshed()
    }

}
