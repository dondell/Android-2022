package com.dmj.android101.widgets.customListview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dmj.android101.R

class UserListAdapter(private val getContext: Context, val customListItem: ArrayList<User>):
    BaseAdapter() {
    override fun getCount(): Int {
        return customListItem.size
    }

    override fun getItem(p0: Int): Any {
        return customListItem[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listLayout = convertView

        listLayout = LayoutInflater.from(getContext).inflate(R.layout.user_item, parent, false)

        var holder: ViewHolder = ViewHolder()
            holder.textViewFirstname = listLayout.findViewById(R.id.textViewFirstname)
            holder.textViewLastname = listLayout.findViewById(R.id.textViewLastname)

            val userItem = customListItem[position]
            holder.textViewFirstname?.text = userItem.firstname
            holder.textViewLastname?.text = userItem.lastname

        return listLayout
    }

    class ViewHolder {
        internal var textViewFirstname: TextView? = null
        internal var textViewLastname: TextView? = null
    }

}
