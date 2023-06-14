package com.example.my_contact_list_app

import android.content.Intent
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
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
        binding.btnAdd.setOnClickListener {
            val intent = Intent(this,AddContacts::class.java)
            startActivity(intent)
        }
    }


    fun displayContacts() {

        var name1 = ContactAdapter(
            "https://media.istockphoto.com/id/1387843089/photo/business-woman-holding-smartphone-and-looking-away-outdoors.webp?b=1&s=170667a&w=0&k=20&c=WsXCh4BUrQtYLTzi3ubrAlsomLX2DYjpnjFWQpx81yY=",
            "Leila Ashur",
            "leilaashur@gmail.com",
            "078778867"
        )
        var name2 = ContactAdapter(
            "https://images.unsplash.com/photo-1517598024396-46c53fb391a1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlJTIwaW1hZ2VzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60 ",
            "Yvone Adhiambo",
            "Yvone@gmail.com",
            "071307030"
        )
        var name3 = ContactAdapter(
            "https://media.istockphoto.com/id/1437889300/photo/african-american-woman-smiling-confident-driving-car-at-street.webp?b=1&s=170667a&w=0&k=20&c=5EpX01jUngHSb3SPz1LW9MV1g8wkUS2GPW8xhAsj9Ok=",
            "Mwangombe Ann",
            "mwangombe@gmail.com",
            "0718130788"
        )
        var name4 = ContactAdapter(
            "https://media.istockphoto.com/id/1478140327/photo/portrait-of-a-man-in-the-countryside-harvesting-fruit-spondias-siriguela-seriguela-ciriguela.webp?b=1&s=170667a&w=0&k=20&c=HJyDlotsHnQmRJT1ji8QRE2CKLtJ0wvXb1BQtWHS8eU=",
            "Winfrida",
            "emillystephanie@gmail.com",
            "0712209988"
        )
        var name7 = ContactAdapter(
            "https://media.istockphoto.com/id/1392804891/photo/confident-black-woman-outdoors-holding-a-rainbow-flag.webp?b=1&s=170667a&w=0&k=20&c=pEYnDWx4MxUnaK2_jKkT0evKc1vacVxhFGBMMRKr15s=",
            "MagretWamboi",
            "magret@gmail.com",
            "07980012333"
        )
        var name9 = ContactAdapter(
            "https://images.unsplash.com/photo-1604684330644-25c4d8142c01?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmxhY2slMjBwZW9wbGUlMjBpbWFnZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
            "Linet",
            "Linet@gmail.com",
            "0712209988"
        )
        var name10 = ContactAdapter(
            "https://images.unsplash.com/photo-1601821326018-d949a54b6402?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YmxhY2slMjBwZW9wbGUlMjBpbWFnZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
            "Miriam",
            "miriam@gmail.com",
            "07980012333"
        )
        var names = listOf(name1, name2, name3, name4, name7, name9, name10)
        val contactAdapter = ContactsRvAdapter(names)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter

    }
}

