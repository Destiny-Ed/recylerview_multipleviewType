package com.destinyed.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.destinyed.recyclerview.RecyclerViewHolder.viewAdapter
import com.destinyed.recyclerview.RecyclerViewHolder.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var Adapter : viewAdapter

    private var arrList = ArrayList<viewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)


        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Java", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("javascript", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Dart", "Awesome language"))
        arrList.add(viewModel("javascript", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("javascript", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Javascript", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))
        arrList.add(viewModel("Kotlin", "Awesome language"))


        Adapter = viewAdapter(this, arrList)

        recyclerView.adapter = Adapter
        Adapter.notifyDataSetChanged()


    }
}