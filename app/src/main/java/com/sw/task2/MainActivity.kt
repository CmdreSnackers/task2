package com.sw.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.sw.task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemAdapter= ProductAdapt(listOf(
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
            ItemDat("title","desc"),
        ))

        binding.rvProd.adapter = itemAdapter
        val layoutManager = GridLayoutManager(this,2)
        binding.rvProd.layoutManager = layoutManager

    }
}