package com.sw.task2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sw.task2.databinding.LayoutItemBinding

class ProductAdapt(var items:List<ItemDat>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = LayoutItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHold(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val prodViewHolder = holder as ItemViewHold
        val iteProd = items[position]
        prodViewHolder.binding.run {
            texOne.text=iteProd.title
            texTwo.text=iteProd.desc
        }

    }

    class ItemViewHold(val binding: LayoutItemBinding):RecyclerView.ViewHolder(binding.root)

}