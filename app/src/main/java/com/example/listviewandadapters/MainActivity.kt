package com.example.listviewandadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()

        taskList.add("Build projects")
        taskList.add("Post on LinkedIn")
        taskList.add("Post on Youtube")
        taskList.add("Publish App on Google Play Store")

        val arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,taskList)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"Clicked on : ${(view as TextView).text.toString()}",Toast.LENGTH_SHORT).show()
        }











    }
}