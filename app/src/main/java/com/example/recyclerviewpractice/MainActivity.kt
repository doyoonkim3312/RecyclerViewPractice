package com.example.recyclerviewpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Sample Data list
    val  contactList = arrayListOf<Contacts>(
        Contacts("A","01011112222"),
        Contacts("B","01033334444"),
        Contacts("C","01055556666"),
        Contacts("D","01077778888"),
        Contacts("E","01099991010")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MainAdapter(contactList)
        recycledView1.adapter = adapter


    }
}