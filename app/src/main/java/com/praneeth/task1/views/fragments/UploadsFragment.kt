package com.praneeth.task1.views.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.praneeth.task1.R
import com.praneeth.task1.adapters.ImagesAdapter
import com.praneeth.task1.databinding.FragmentUploadsBinding

class UploadsFragment : Fragment(R.layout.fragment_uploads) {

    private lateinit var binding : FragmentUploadsBinding
    private lateinit var imagesAdapter : ImagesAdapter
    private  var imageList : MutableList<Int>  = mutableListOf()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentUploadsBinding.bind(view)
        buildRecyclerData()
        setRecyclerAdapter()

    }

    private fun setRecyclerAdapter() {
        val llManager = GridLayoutManager(requireContext(),2)
        binding.uploadsRecyclerView.layoutManager= llManager
        imagesAdapter = ImagesAdapter(imageList)
        binding.uploadsRecyclerView.adapter = imagesAdapter
    }

    private fun buildRecyclerData() {

        imageList.add(R.drawable.capture0)
        imageList.add(R.drawable.capture2)
        imageList.add(R.drawable.capture3)
        imageList.add(R.drawable.capture4)
        imageList.add(R.drawable.capture5)
        imageList.add(R.drawable.capture6)
    }




}