package com.robin.tabletoppers.presentation.fragments

class LoginFragment: BaseFragment(){
    private var listener: OnFragmentInteractionListener? = null



    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun loginClicked()
    }

    companion object {
        val TAG = this::class.java.simpleName
        @JvmStatic fun newInstance() = LoginFragment()
    }

}