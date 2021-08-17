package com.praneeth.task1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.praneeth.task1.databinding.FragmentUploadsBinding

class UploadsFragment : Fragment(R.layout.fragment_uploads) {

    private lateinit var binding : FragmentUploadsBinding
    private  var imagesList : MutableList<Int> = mutableListOf()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentUploadsBinding.bind(view)

        imagesList.add(1,R.drawable.fb)

    }




}