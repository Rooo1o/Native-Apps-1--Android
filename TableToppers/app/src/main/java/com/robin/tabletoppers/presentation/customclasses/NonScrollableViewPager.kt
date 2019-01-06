package com.robin.tabletoppers.presentation.customclasses

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

class NonScrollableViewPager (context: Context, attrs: AttributeSet): ViewPager(context, attrs) {
    private var swipeEnabled: Boolean = false

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return when (swipeEnabled){
            true -> super.onTouchEvent(event)
            false -> false
        }
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return when (swipeEnabled) {
            true -> super.onInterceptTouchEvent(event)
            false -> false
        }
    }

    fun setSwipePagingEnabled(swipeEnabled: Boolean) {
        this.swipeEnabled = swipeEnabled
    }



}