package com.example.exer1honraralphdaniel.ui.dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exer1honraralphdaniel.databinding.FollowersListItemBinding
import com.example.exer1honraralphdaniel.ui.dashboard.model.FollowersListItemModel

class FollowersListItemAdapter (
    private val collections: List<FollowersListItemModel>
): RecyclerView.Adapter<FollowersListItemAdapter.FollowersListItemViewHolder>() {
    inner class FollowersListItemViewHolder(private val _binding: FollowersListItemBinding): RecyclerView.ViewHolder(_binding.root) {
        fun bind(followersListItemModel: FollowersListItemModel) {
            _binding.tvName.text = followersListItemModel.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowersListItemViewHolder {
        val binding: FollowersListItemBinding = FollowersListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FollowersListItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: FollowersListItemViewHolder, position: Int) {
        holder.bind(collections[position])
    }
}