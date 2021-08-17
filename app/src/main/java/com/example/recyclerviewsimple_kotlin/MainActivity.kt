package com.example.recyclerviewsimple_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsimple_kotlin.adapter.MyAdapter
import com.example.recyclerviewsimple_kotlin.databinding.ActivityMainBinding
import com.example.recyclerviewsimple_kotlin.model.DataModel
import com.example.recyclerviewsimple_kotlin.viewmodel.MyViewModel
import java.util.*

class MainActivity : AppCompatActivity() {


    lateinit var myAdapter: MyAdapter
    lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding=ActivityMainBinding.inflate(layoutInflater)
        val rootLayout=binding.root
        super.onCreate(savedInstanceState)
        setContentView(rootLayout)

         myViewModel=ViewModelProvider(this).get(MyViewModel::class.java)
          myViewModel.getImageMutableLiveData().observe(this, Observer {
              myAdapter.updateImageList(it)
          })

        val layoutManager= GridLayoutManager(this, 2)
        layoutManager.orientation=RecyclerView.VERTICAL
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = layoutManager
        myAdapter= MyAdapter()
        binding.recyclerView.adapter=myAdapter

    }
    }

