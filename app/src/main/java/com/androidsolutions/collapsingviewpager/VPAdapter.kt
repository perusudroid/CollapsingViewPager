package com.androidsolutions.collapsingviewpager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androidsolutions.collapsingviewpager.databinding.ItemVpBinding

class VPAdapter : RecyclerView.Adapter<VPAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemVpBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount() = 5

    class VH(private val binding : ItemVpBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.ivPic.setImageResource(when(position){
                1 -> R.drawable.banner2
                2 -> R.drawable.banner3
                else -> R.drawable.banner1
            })
        }
    }
}