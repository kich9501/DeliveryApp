package com.example.mygoodelivery.Fragment.NumFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mygoodelivery.Fragment.ContentsListMedel
import com.example.mygoodelivery.R
import kotlinx.android.synthetic.main.fragment_fifth.view.*


class FifthFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_fifth, container, false)

        val list_array = arrayListOf<ContentsListMedel>(
            ContentsListMedel("a", "굽네피자", 1, "d"),
            ContentsListMedel("a", "도미노피자", 1, "d"),
            ContentsListMedel("a", "청년피자", 1, "dsf")

        )

        val list_adapter = FifthFragAdapter(requireContext(), list_array)
        view.listview_fifth_fragment.adapter = list_adapter

        return view

    }


}