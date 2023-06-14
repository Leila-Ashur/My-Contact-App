package com.example.my_contact_list_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.contacts-app.data-binding.ActivityMainBinding
import com.example.my_contact_list_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts() {
        var name1 = ContactAdapter("Leila", "078837383", "leila@gmail.com", "")
        var name2 = ContactAdapter(" Marisa  ", "0746833030", "marisaleleshep@gmail.com", "")
        var name3 = ContactAdapter(" Cathy ", "07354674788", "cathy@gmail.com", "")
        var name4 = ContactAdapter("  Cynthia", "0747834748", "mumbuacynthia@g.com", "")
        var name7 = ContactAdapter("Nancy ", "074657589", "nancysaru@gmail.com", "")
        var names = listOf(name1, name2, name3, name4, name7)
        val contactAdapter = ContactsRvAdapter(names)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter

    }
}



