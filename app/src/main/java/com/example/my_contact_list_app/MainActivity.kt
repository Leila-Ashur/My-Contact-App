package com.example.my_contact_list_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.contactsapp.databinding.ActivityMainBinding
import com.example.my_contact_list_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume(){
        super.onResume()
        displayContacts()

    }
    fun displayContacts(){
var name1=contactAdapter("Leila","078837383","leila@gmail.com","")
        var name2 =contactAdapter(" Marisa  ","0746833030","marisaleleshep@gmail.com","")
        var name3=contactAdapter(" Cathy ","07354674788","cathy@gmail.com","")
        var name4=contactAdapter("  Cynthia","0747834748","mumbuacynthia@g.com","")
        var name7 =contactAdapter("Nancy ","074657589","nancysaru@gmail.com","")
        var names = listOf(name1,name2,name3,name4,name7)
        val contactAdapter=ContactsRvAdapter(names)
        binding.rvCont1.layoutManager =LinearLayoutManager(this)
        binding.rvCont1.adapter= contactAdapter

    }
}
