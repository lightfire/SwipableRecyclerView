package com.asurekazani.library

import android.support.annotation.CallSuper
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by Kadir Ergün on 03/04/18.
 * PortalGrup - SwipableRecyclerView
 */
abstract class SwipableAdapter<T>(val cartList: MutableList<T>) : RecyclerView.Adapter<MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(getRootLayoutIdForPosition(),parent,false)
        return MyViewHolder(view)
    }

    @CallSuper
    override fun onBindViewHolder(holder: MyViewHolder,
                                  position: Int) {
        val obj = getObjForPosition(position)
        val layoutInflater = LayoutInflater.from(holder.itemView.context)
        val subView = layoutInflater.inflate(getLayoutIdForPosition(position),holder.viewForeground,false)
        holder.viewForeground.addView(subView)
    }

    override fun getItemViewType(position: Int): Int {
        return getRootLayoutIdForPosition()
    }

    private fun getObjForPosition(position: Int): T {
        return cartList[position]
    }

    @LayoutRes
    protected abstract fun getLayoutIdForPosition(position: Int): Int

    private fun getRootLayoutIdForPosition(): Int {
        return R.layout.item_bind
    }


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
