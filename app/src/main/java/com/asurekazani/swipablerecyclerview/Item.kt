package com.asurekazani.swipablerecyclerview

import com.asurekazani.library.Item

/**
 * Created by Kadir Ergün on 03/04/18.
 * PortalGrup - SwipableRecyclerView
 */
data class Item(val name:String,val age:Int) : Item() {
    override val id: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val value: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}