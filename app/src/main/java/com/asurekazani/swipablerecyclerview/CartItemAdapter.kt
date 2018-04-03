package com.asurekazani.swipablerecyclerview

import com.asurekazani.library.SwipableAdapter

/**
 * Created by Kadir Ergün on 03/04/18.
 * PortalGrup - SwipableRecyclerView
 */
class CartItemAdapter(cartList: MutableList<Item>) : SwipableAdapter<Item>(cartList) {
    override fun getLayoutIdForPosition(position: Int): Int {
        return R.layout.item_bind
    }
}
