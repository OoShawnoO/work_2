package com.example.work_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.Touch
import android.util.Log
import android.widget.AbsListView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import javax.xml.parsers.FactoryConfigurationError

class MainActivity : AppCompatActivity() {
    val TAG = "@@MainActivity"


    lateinit var manager:FragmentManager

    companion object{
        val TAG_WECHAT = "wechat"
        val TAG_ME = "me"
        val TAG_DISCOVERY = "discovery"
        val TAG_TOUCHAER = "toucher"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        InitView()


    }


    private fun InitView(){
        manager = supportFragmentManager
        var trans = manager.beginTransaction()
        manager.fragments.forEach{
            if(it !is BottomNav && it !is TopNav){
                trans.hide(it)
            }
        }
        trans.commit()
    }

    fun showWechat(){
        showFrag(TAG_WECHAT)
    }

    fun showMe(){
        showFrag(TAG_ME)
    }

    fun showToucher(){
        showFrag(TAG_TOUCHAER)
    }

    fun showDiscovery(){
        showFrag(TAG_DISCOVERY)
    }

    fun showFrag(tag:String) {
        Log.d(TAG,"tag=$tag")
        val frag = manager.findFragmentByTag(tag) ?: when (tag) {
            TAG_ME -> Me_fragment() as Fragment
            TAG_DISCOVERY -> Discovery_fragment() as Fragment
            TAG_WECHAT -> Wechat_fragment() as Fragment
            TAG_TOUCHAER -> Toucher_fragment() as Fragment
            else -> BodyNav()
        }
        Log.d(TAG,frag.toString())
        val trans = manager.beginTransaction()
        manager.fragments.forEach {
//            Log.d(TAG,"it = $it")
            if (it != frag && it !is BottomNav && it !is TopNav) {
                trans.hide(it)
            }
        }
        if(frag.isAdded){

            trans.show(frag)
        }
        else{
            trans.add(R.id.fragment_wechat,frag,tag)
        }

        trans.commit()
    }



}