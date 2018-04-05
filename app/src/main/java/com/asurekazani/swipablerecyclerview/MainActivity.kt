package com.asurekazani.swipablerecyclerview


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import com.asurekazani.library.MyViewHolder
import com.asurekazani.library.RecyclerItemTouchHelper

class MainActivity : AppCompatActivity(),RecyclerItemTouchHelper.RecyclerItemTouchHelperListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val list = mutableListOf(Item("Ad",25),Item("Ad2",30), Item("Ad3",21))
        val cartItemAdapter = CartItemAdapter(list)
        recyclerView.adapter = cartItemAdapter

        val itemTouchHelperCallback : ItemTouchHelper.SimpleCallback = RecyclerItemTouchHelper(0,ItemTouchHelper.LEFT,this@MainActivity)
        ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView)
    }



    override fun onSwiped(viewHolder: RecyclerView.ViewHolder?, direction: Int, position: Int) {
       if(viewHolder is MyViewHolder){

       }
    }
}
