package com.example.exer1honraralphdaniel.ui.dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exer1honraralphdaniel.databinding.PhotosListItemBinding
import com.example.exer1honraralphdaniel.ui.dashboard.model.PhotosListItemModel

class PhotosListItemAdapter(
    private val collections: List<PhotosListItemModel>
): RecyclerView.Adapter<PhotosListItemAdapter.PhotosListItemViewHolder>() {
    inner class PhotosListItemViewHolder(private val _binding: PhotosListItemBinding): RecyclerView.ViewHolder(_binding.root) {
        fun bind(photosListItemModel: PhotosListItemModel) {
            _binding.ivMain.setImageURI(photosListItemModel.ivPhotosUri)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosListItemViewHolder {
        val binding: PhotosListItemBinding = PhotosListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhotosListItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: PhotosListItemViewHolder, position: Int) {
        holder.bind(collections[position])
    }
}