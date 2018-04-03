package com.asurekazani.library

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.widget.RelativeLayout

/**
 * Created by Kadir Ergün on 03/04/18.
 * PortalGrup - SwipableRecyclerView
 */
class MyViewHolder internal constructor(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    lateinit var viewForeground : RelativeLayout

    fun bind(obj: Any, position: Int) {
        binding.setVariable(BR.item, obj)
        binding.executePendingBindings()
        binding.setVariable(BR.position, position)
    }
}