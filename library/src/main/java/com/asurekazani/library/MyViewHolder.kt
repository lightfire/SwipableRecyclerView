package com.asurekazani.library

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.RelativeLayout

/**
 * Created by Kadir Ergün on 03/04/18.
 * PortalGrup - SwipableRecyclerView
 */
class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    var viewForeground : RelativeLayout = itemView.findViewById(R.id.view_foreground)
    var viewBackground : RelativeLayout = itemView.findViewById(R.id.view_background)

}