package com.asurekazani.swipablerecyclerview

import com.asurekazani.library.MyViewHolder
import com.asurekazani.library.SwipableAdapter

/**
 * Created by Kadir Ergün on 03/04/18.
 * PortalGrup - SwipableRecyclerView
 */
class CartItemAdapter(cartList: MutableList<Item>) : SwipableAdapter<Item>(cartList) {


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        val item =cartList[position]
        
    }

    override fun getLayoutIdForPosition(position: Int): Int {
        return R.layout.item_cart
    }
}
