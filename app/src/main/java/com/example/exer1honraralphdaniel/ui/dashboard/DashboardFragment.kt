package com.example.exer1honraralphdaniel.ui.dashboard

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.exer1honraralphdaniel.databinding.FragmentDashboardBinding
import com.example.exer1honraralphdaniel.ui.dashboard.adapter.FollowersListItemAdapter
import com.example.exer1honraralphdaniel.ui.dashboard.adapter.PhotosListItemAdapter
import com.example.exer1honraralphdaniel.ui.dashboard.model.FollowersListItemModel
import com.example.exer1honraralphdaniel.ui.dashboard.model.PhotosListItemModel

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel = ViewModelProvider(this)[DashboardViewModel::class.java]

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        initRecyclerView()

        return root
    }

    private fun initRecyclerView() {
        _binding!!.apply {
            rvFollowers.adapter = FollowersListItemAdapter(
                listOf(
                    FollowersListItemModel("Dina"),
                    FollowersListItemModel("John"),
                    FollowersListItemModel("Jessica"),
                    FollowersListItemModel("Andrew"),
                    FollowersListItemModel("Mike"),
                    FollowersListItemModel("Angel"),
                    FollowersListItemModel("Alex"),
                    FollowersListItemModel("Elmo"),
                    FollowersListItemModel("Ali"),
                    FollowersListItemModel("Oreo"),
                )
            )

            rvPhotos.adapter = PhotosListItemAdapter(
                listOf(
                    PhotosListItemModel(Uri.parse("android.resource://com.example.exer1honraralphdaniel/drawable/pic1")),
                    PhotosListItemModel(Uri.parse("android.resource://com.example.exer1honraralphdaniel/drawable/pic3")),
                    PhotosListItemModel(Uri.parse("android.resource://com.example.exer1honraralphdaniel/drawable/pic2")),
                    PhotosListItemModel(Uri.parse("android.resource://com.example.exer1honraralphdaniel/drawable/pic4")),
                    PhotosListItemModel(Uri.parse("android.resource://com.example.exer1honraralphdaniel/drawable/pic5")),
                    PhotosListItemModel(Uri.parse("android.resource://com.example.exer1honraralphdaniel/drawable/pic6")),
                )
            )
            rvPhotos.layoutManager = GridLayoutManager(requireContext(), 2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}