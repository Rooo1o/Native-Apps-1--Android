package com.robin.tabletoppers.presentation.fragments

import android.support.v4.app.Fragment
open class BaseFragment : Fragment() {

    open var TAG: String = ""

    companion object {
        const val GEZELSCHAPSSPELEN = 0
        const val LOGIN = 1
        const val REGISTREER = 2
        const val NIEUW_GEZELSCHAPSSPEL = 3
    }

}