package com.example.work_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Discovery_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Discovery_fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    val discoveryItem = arrayListOf<toucher_item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discovery_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        val recycler = view.findViewById<RecyclerView>(R.id.recyclers)
        recycler.layoutManager = LinearLayoutManager(activity)
        recycler.adapter = toucherAdapter(discoveryItem)

    }
    private fun initData(){

        discoveryItem.add(toucher_item().apply {
            Title="朋友圈"
            image = R.mipmap.pyq
        })

        discoveryItem.add(toucher_item().apply {
            Title="视频号"
            image = R.mipmap.sph
        })
        discoveryItem.add(toucher_item().apply {
            Title="直播"
            image = R.mipmap.zb
        })
        discoveryItem.add(toucher_item().apply {
            Title="扫一扫"
            image = R.mipmap.sys
        })
        discoveryItem.add(toucher_item().apply {
            Title="摇一摇"
            image = R.mipmap.yyy
        })
        discoveryItem.add(toucher_item().apply {
            Title="看一看"
            image = R.mipmap.kyk
        })
        discoveryItem.add(toucher_item().apply {
            Title="搜一搜"
            image = R.mipmap.sou
        })
        discoveryItem.add(toucher_item().apply {
            Title="附近"
            image = R.mipmap.fjdr
        })



    }

}