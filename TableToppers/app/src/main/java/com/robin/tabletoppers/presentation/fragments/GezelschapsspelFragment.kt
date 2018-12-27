package com.robin.tabletoppers.presentation.fragments

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.constraint.R.id.parent
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.orhanobut.logger.Logger
import com.robin.data.GezelschapsspelRepository
import com.robin.domain.Gezelschapsspel
import com.robin.tabletoppers.R
import com.robin.tabletoppers.framework.ValseGezelschapsspelenRepository
import com.robin.usecases.GetGezelschapsspelen
import kotlinx.android.synthetic.main.fragment_gezelschapsspelen.*
import kotlinx.android.synthetic.main.row_layout.view.*
import java.security.AccessController.getContext

class GezelschapsspelFragment() : BaseFragment() {

    private var listener: OnFragmentInteractionListener? = null

    private var gezelschapsspelen: List<Gezelschapsspel>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_gezelschapsspelen, container, false)
    }

    override fun onStart(){
        super.onStart()

        //dit moet geïnjecteerd worden?
        gezelschapsspelen = GetGezelschapsspelen(GezelschapsspelRepository(ValseGezelschapsspelenRepository())).invoke()
        //

        recyclerview.adapter = SimpleItemRecyclerViewAdapter(gezelschapsspelen!!)
        recyclerview.layoutManager = LinearLayoutManager(context)
    }


    override fun onAttach(context: Context){
        super.onAttach(context)
        TAG = "GezelschapsspelFragment"

        if(context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnFragmentInteractionListener {
        fun toonGezelschapsspelen()
    }

    class SimpleItemRecyclerViewAdapter(private val gezelschapsspelen: List<Gezelschapsspel>): RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder>() {

        private val onClickListener: View.OnClickListener = View.OnClickListener {
            Logger.i("Pressed an element")
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int){
            val gezelschapsspel = gezelschapsspelen[position]
            holder.naam.text = gezelschapsspel.naam
            holder.jaarVanUitgave.text = gezelschapsspel.jaarVanUitkomst.toString()

            //foto instellen
            val context = holder.itemView.context
            val resId: Int = context.resources.getIdentifier(gezelschapsspel.hoofdfoto, "drawable", context.packageName)
            holder.thumbnail.setImageResource(resId)

            with(holder.thumbnail) {
                tag = gezelschapsspel
                setOnClickListener(onClickListener)
            }
        }

        override fun getItemCount() = gezelschapsspelen.size

        inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
            val naam: TextView = view.name
            var jaarVanUitgave: TextView = view.textview_rowlayout_jaarVanUitgave
            var thumbnail: ImageView = view.imageview_rowlayout_thumbnail
        }

    }


    companion object {
        @JvmStatic fun newInstance() = GezelschapsspelFragment()
    }


}