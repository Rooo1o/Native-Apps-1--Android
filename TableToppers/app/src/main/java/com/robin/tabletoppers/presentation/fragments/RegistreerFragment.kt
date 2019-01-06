package com.robin.tabletoppers.presentation.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.robin.tabletoppers.R
import kotlinx.android.synthetic.main.fragment_registreer.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [RegistreerFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [RegistreerFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class RegistreerFragment : BaseFragment() {
    private var listener: OnFragmentInteractionListener? = null

    override fun onStart(){
        super.onStart()

        btn_login.setOnClickListener {
            val viewPager: ViewPager = activity!!.findViewById(R.id.viewpager_main)
            viewPager.currentItem = BaseFragment.LOGIN
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registreer, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        TAG = "RegistreerFragment"

        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun registreerClicked()
    }

    companion object {
        val TAG = this::class.java.simpleName
        @JvmStatic fun newInstance() = RegistreerFragment()
    }
}
