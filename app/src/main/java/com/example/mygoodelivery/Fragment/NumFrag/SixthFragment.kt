package com.example.mygoodelivery.Fragment.NumFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mygoodelivery.Fragment.ContentsListMedel
import com.example.mygoodelivery.R
import kotlinx.android.synthetic.main.fragment_sixth.view.*


class SixthFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_sixth, container, false)

        val list_array = arrayListOf<ContentsListMedel>(
            ContentsListMedel("b", "명성 불타는 쟁반 짜장", 1, "d"),
            ContentsListMedel("b", "박중근 쟁반짜장", 1, "d")
        )

        val list_adapter = SixthFragAdapter(requireContext(), list_array)
        view.listview_sixth_fragment.adapter = list_adapter

        return view

    }
}