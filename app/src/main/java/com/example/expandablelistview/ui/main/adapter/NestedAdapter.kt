package com.example.expandablelistview.ui.main.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.expandablelistview.R

class NestedAdapter(private val mList: List<String>) :
    RecyclerView.Adapter<NestedAdapter.NestedViewHolder>() {
    private val isCheckStatus: Boolean? = null
    var childCheckboxState = HashMap<Int, Int?>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NestedViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.nested_item, parent, false)
        return NestedViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: NestedViewHolder,
        @SuppressLint("RecyclerView") position: Int
    ) {

        holder.mTv.text = mList[position]
        holder.isStatus.setOnClickListener {
            if (holder.isStatus.isChecked) {
                childCheckboxState[position] = 1
            } else {
                childCheckboxState[position] = 0
            }
            notifyDataSetChanged()
        }
        if (childCheckboxState.size > 0) {
            if (childCheckboxState[position] != null) {
                if (childCheckboxState[position] == 0) {
                    holder.isStatus.isChecked = false
                    Log.e("STATUS", "FALSE")
                } else {
                    holder.isStatus.isChecked = true
                    Log.e("STATUS", "TRUE")
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class NestedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mTv: TextView
        val isStatus: CheckBox

        init {
            mTv = itemView.findViewById(R.id.nestedItemTv)
            isStatus = itemView.findViewById(R.id.filterCheckBox)
        }
    }
}
