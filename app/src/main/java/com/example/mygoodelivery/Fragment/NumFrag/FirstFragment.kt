package com.example.mygoodelivery.Fragment.NumFrag


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mygoodelivery.Fragment.ContentsListMedel
import com.example.mygoodelivery.Fragment.MarketInfo.MarketInfoActivity
import com.example.mygoodelivery.R
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_first, container, false)

        val list_array = arrayListOf<ContentsListMedel>(
            ContentsListMedel("a", "정식당", 1, "d"),
            ContentsListMedel("a", "한식당", 1, "d"),
            ContentsListMedel("a", "고궁", 1, "dsf")

        )

        val list_adapter = FourthFragAdapter(requireContext(), list_array)
        view.listview_first_fragment.adapter = list_adapter

        view.listview_first_fragment.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(requireContext(), MarketInfoActivity::class.java)
            startActivity(intent)
        }

        return view

    }


}
