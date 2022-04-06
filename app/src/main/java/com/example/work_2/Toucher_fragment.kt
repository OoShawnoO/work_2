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
 * Use the [Toucher_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Toucher_fragment : Fragment() {
    // TODO: Rename and change types of parameters
    val toucherItem = arrayListOf<toucher_item>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_toucher_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        val recycler = view.findViewById<RecyclerView>(R.id.recyclers)
        recycler.layoutManager = LinearLayoutManager(activity)
        recycler.adapter = toucherAdapter(toucherItem)
    }

    private fun initData(){
        for(i in 0..4){
            toucherItem.add(toucher_item().apply {
                Title="小姐姐1号"
                image = R.mipmap.t1
            })

            toucherItem.add(toucher_item().apply {
                Title="小姐姐2号"
                image = R.mipmap.t2
            })
            toucherItem.add(toucher_item().apply {
                Title="小姐姐3号"
                image = R.mipmap.t3
            })
            toucherItem.add(toucher_item().apply {
                Title="小姐姐4号"
                image = R.mipmap.t4
            })
        }
    }
    companion object{

    }
}