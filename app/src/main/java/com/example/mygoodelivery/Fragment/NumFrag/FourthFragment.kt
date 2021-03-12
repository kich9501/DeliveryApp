package com.example.mygoodelivery.Fragment.NumFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mygoodelivery.Fragment.ContentsListMedel
import com.example.mygoodelivery.R
import kotlinx.android.synthetic.main.fragment_fourth.view.*


class FourthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_fourth, container, false)

        val list_array = arrayListOf<ContentsListMedel>(
            ContentsListMedel("a", "굽네치킨", 1, "d"),
            ContentsListMedel("a", "BBQ치킨", 1, "d"),
            ContentsListMedel("a", "교촌치킨", 1, "dsf")

        )

        val list_adapter = FourthFragAdapter(requireContext(), list_array)
        view.listview_fourth_fragment.adapter = list_adapter

        return view

    }

}