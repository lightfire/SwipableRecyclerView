package com.asurekazani.library

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.databinding.ViewDataBinding
import android.view.ViewGroup

/**
 * Created by Kadir Ergün on 03/04/18.
 * PortalGrup - SwipableRecyclerView
 */
abstract class SwipableAdapter<T>(private val cartList: MutableList<T>) : RecyclerView.Adapter<MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
                layoutInflater, viewType, parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder,
                                  position: Int) {
        val obj = getObjForPosition(position)

        holder.bind(obj!!, position)
    }

    override fun getItemViewType(position: Int): Int {
        return getLayoutIdForPosition(position)
    }

    private fun getObjForPosition(position: Int): T {
        return cartList[position]
    }


    protected abstract fun getLayoutIdForPosition(position: Int): Int


    override fun getItemCount(): Int {
        return cartList.size
    }

    fun removeItem(position: Int) {
        cartList.removeAt(position)
        // notify the item removed by position
        // to perform recycler view delete animations
        // NOTE: don't call notifyDataSetChanged()
        notifyItemRemoved(position)
    }

    fun restoreItem(item: T, position: Int) {
        cartList.add(position, item)
        // notify item added by position
        notifyItemInserted(position)
    }

    open fun getItems(): List<T>? {
        return this.cartList
    }
}
