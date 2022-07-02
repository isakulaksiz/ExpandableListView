package com.example.expandablelistview.ui.main.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expandablelistview.R
import com.example.expandablelistview.data.model.DataModel
import com.example.expandablelistview.ui.main.adapter.ItemAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var mList: MutableList<DataModel>? = null
    private var adapter: ItemAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.main_recyclervie)
        recyclerView.setHasFixedSize(true)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        mList = ArrayList<DataModel>()

        //list1
        val nestedList1: MutableList<String> = ArrayList()
        nestedList1.add("Add User")
        nestedList1.add("Update User")
        nestedList1.add("Delete User")
        val nestedList2: MutableList<String> = ArrayList()
        nestedList2.add("Add Product")
        nestedList2.add("Update Product")
        nestedList2.add("Delete Product")
        nestedList2.add("Pencil")
        val nestedList3: MutableList<String> = ArrayList()
        nestedList3.add("Add Clerk")
        nestedList3.add("Update Clerk")
        nestedList3.add("Delete Clerk")
        nestedList3.add("Show Clerk")
        val nestedList4: MutableList<String> = ArrayList()
        nestedList4.add("Add Payment Type")
        nestedList4.add("Show Payment")
        nestedList4.add("Update Payment")
        mList!!.add(DataModel(nestedList1, "User"))
        mList!!.add(DataModel(nestedList2, "Product"))
        mList!!.add(DataModel(nestedList3, "Clerk"))
        mList!!.add(DataModel(nestedList4, "Payment"))
        adapter = ItemAdapter(mList as ArrayList<DataModel>)
        recyclerView.setAdapter(adapter)
    }
}