package com.dmj.android101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.dmj.android101.widgets.customListview.User
import com.dmj.android101.widgets.customListview.UserListAdapter

class CustomListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_list)

        val list = findViewById<ListView>(R.id.listUsers)
        val custom_list_data = ArrayList<User>()
        val custom_list_adp = UserListAdapter(this, custom_list_data)
        custom_list_data.add(User("Jules", "", 14))
        custom_list_data.add(User("Uzziel", "Cabil", 15))
        custom_list_data.add(User("Ashbel", "Zur", 16))

        list.adapter = custom_list_adp

        list.setOnItemClickListener { parent, view, pos, id ->
            val selectedUser: User = custom_list_data[pos]
            Toast.makeText(
                this@CustomListActivity,
                "User :" + selectedUser.firstname + " " + selectedUser.lastname,
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}