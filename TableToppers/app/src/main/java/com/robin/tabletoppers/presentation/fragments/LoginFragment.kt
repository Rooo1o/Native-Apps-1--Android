package com.robin.tabletoppers.presentation.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.robin.domain.Gebruiker
import com.robin.tabletoppers.R
import com.robin.usecases.Login
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment: BaseFragment(){
    private var listener: OnFragmentInteractionListener? = null

    override fun onStart(){
        super.onStart()

        btn_login.setOnClickListener {
            val login: String = txt_login.text.toString()
            val wachtwoord: String = txt_wachtwoord.text.toString()
            val gebruiker: Gebruiker? = Login().invoke(login, wachtwoord)
            if(gebruiker != null){
                val toast = Toast.makeText(context?.applicationContext, "gelukt", Toast.LENGTH_SHORT)
            }
             else {
                val toast = Toast.makeText(context?.applicationContext, "gefaald", Toast.LENGTH_SHORT)
            }
        }

        btn_registreer.setOnClickListener{
            val viewPager: ViewPager = activity!!.findViewById(R.id.viewpager_main)
            viewPager.currentItem = BaseFragment.REGISTREER
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        TAG = "LoginFragment"

        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }



    interface OnFragmentInteractionListener {
        fun loginClicked()
    }


    companion object {
        val TAG = this::class.java.simpleName
        @JvmStatic fun newInstance() = LoginFragment()
    }

}