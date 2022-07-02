package com.example.expandablelistview.data.model

import android.annotation.SuppressLint

class DataModel {
    private var nestedList: List<String>? = null
    private var itemText: String? = null
    private var isExpandable = false

    @SuppressLint("NotConstructor")
    fun DataModel(itemList: List<String>?, itemText: String?) {
        nestedList = itemList
        this.itemText = itemText
        isExpandable = false
    }

    fun setExpandable(expandable: Boolean) {
        isExpandable = expandable
    }

    fun getNestedList(): List<String>? {
        return nestedList
    }

    fun getItemText(): String? {
        return itemText
    }

    fun isExpandable(): Boolean {
        return isExpandable
    }
}