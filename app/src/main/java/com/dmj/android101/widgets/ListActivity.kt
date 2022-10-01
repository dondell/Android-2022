package com.dmj.android101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_list)

        val list = findViewById<ListView>(R.id.listUsers)
        var users_array = arrayOf("Ashbel", "Jules", "Gerard", "Keirven")
        val adp : ArrayAdapter<String> = ArrayAdapter(this@ListActivity, R.layout.support_simple_spinner_dropdown_item, users_array)
        list.adapter = adp

        list.setOnItemClickListener{ parent, view, pos, id ->
            Toast.makeText(this@ListActivity, "User :" + users_array[pos], Toast.LENGTH_SHORT).show()
        }

    }
}