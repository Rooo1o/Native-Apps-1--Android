package com.robin.tabletoppers.presentation.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import com.robin.tabletoppers.R
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger

import com.robin.tabletoppers.presentation.fragments.BaseFragment
import com.robin.tabletoppers.presentation.fragments.GezelschapsspelFragment
import com.robin.tabletoppers.presentation.fragments.LoginFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    GezelschapsspelFragment.OnFragmentInteractionListener,
    LoginFragment.OnFragmentInteractionListener
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.addLogAdapter(AndroidLogAdapter())
    }

    override fun onStart() {
        super.onStart()

        viewpager_main.currentItem = BaseFragment.GEZELSCHAPSSPELEN

        viewpager_main.adapter = object : FragmentPagerAdapter(supportFragmentManager){
            override fun getItem(p0: Int): Fragment {
                when(p0) {
                    BaseFragment.GEZELSCHAPSSPELEN -> return GezelschapsspelFragment.newInstance()
                    BaseFragment.LOGIN -> return LoginFragment.newInstance()
                }
                return GezelschapsspelFragment()
            }

            override fun getCount(): Int {
                return 2
            }
        }

      //  val gezelschapsspelen = bg { GetGezelschapsspelen() }
       /* viewpager_main.adapter = object: FragmentPagerAdapter(supportFragmentManager) {
            override fun getItem(p0: Int): Fragment {
                BaseFragment.GEZELSCHAPSSPELEN -> return GezelschapsspelFragment.
            }
        }*/
    }

    override fun toonGezelschapsspelen(){
        TODO("not implemented")
    }

    override fun loginClicked(){
        TODO("not implemented")
    }





}
