package com.example.work_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Wechat_fragment : Fragment() {

    val wechatItem = arrayListOf<wechat_item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_wechat_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        val recycler = view.findViewById<RecyclerView>(R.id.recyclers)
        recycler.layoutManager = LinearLayoutManager(activity)
        recycler.adapter = wechatAdapter(wechatItem)
    }

    private fun initData(){
        for(i in 0..4){
            wechatItem.add(wechat_item().apply {
                Title="小姐姐1号"
                content="给您转账10000000元"
                image = R.mipmap.t1
                time = "2022/4/6 23:00"
            })

            wechatItem.add(wechat_item().apply {
                Title="小姐姐2号"
                content="给您转账10000000元"
                image = R.mipmap.t2
                time = "2022/4/6 23:09"
            })

            wechatItem.add(wechat_item().apply {
                Title="小姐姐3号"
                content="给您转账10000000元"
                image = R.mipmap.t3
                time = "2022/4/6 23:11"
            })

            wechatItem.add(wechat_item().apply {
                Title="小姐姐4号"
                content="给您转账10000000元"
                image = R.mipmap.t4
                time = "2022/4/6 23:12"
            })
        }

    }


    companion object{

    }
}