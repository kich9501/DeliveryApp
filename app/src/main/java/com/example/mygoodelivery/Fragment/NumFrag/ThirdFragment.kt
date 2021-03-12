package com.example.mygoodelivery.Fragment.NumFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mygoodelivery.Fragment.ContentsListMedel
import com.example.mygoodelivery.R
import kotlinx.android.synthetic.main.fragment_third.view.*


/**
 * A simple [Fragment] subclass.
 */
class ThirdFragment : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_third, container, false)

        val list_array = arrayListOf<ContentsListMedel>(
            ContentsListMedel("b", "미카도 스시", 1, "d"),
            ContentsListMedel("b", "상무초밥", 1, "d"),
            ContentsListMedel("b", "에비텐동", 1, "d")
        )

        val list_adapter = SixthFragAdapter(requireContext(), list_array)
        view.listview_third_fragment.adapter = list_adapter

        return view

    }

}