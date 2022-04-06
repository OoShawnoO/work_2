package com.example.work_2

import android.os.Bundle
import android.service.autofill.OnClickAction
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BottomNav.newInstance] factory method to
 * create an instance of this fragment.
 */
class BottomNav : Fragment() ,View.OnClickListener{
    val TAG = "@@BottomNav"


    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        return inflater.inflate(R.layout.fragment_bottom_nav, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageView>(R.id.image_1).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.image_2).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.image_3).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.image_4).setOnClickListener(this)
    }

    override fun onClick(v:View) {
        val act = requireActivity() as MainActivity
        when(v.id){
            R.id.image_1 ->{ act.showWechat()}
            R.id.image_2 ->{ act.showToucher()}
            R.id.image_3 ->{ act.showDiscovery()}
            R.id.image_4 ->{ act.showMe()}
        }

    }


}