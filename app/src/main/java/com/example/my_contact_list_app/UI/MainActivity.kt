package com.example.my_contact_list_app.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.my_contact_list_app.Model.ContactData
import com.example.my_contact_list_app.R
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
            val intent = Intent(this, AddContacts::class.java)
            startActivity(intent)
        }
    }


    fun displayContacts() {

        var name1 = ContactData(
            3,
            "https://plus.unsplash.com/premium_photo-1683141202259-ee13ddd953fc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Leila",
            " leilahashur@gmail.com",
            "Leila Ashur",


        )
        var name2 = ContactData(
            7,
            "https://images.unsplash.com/photo-1517598024396-46c53fb391a1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlJTIwaW1hZ2VzfG",
            "Yvone",
            "Yvone@gmail.com","123456787"
        )
        var name3 = ContactData(
            9,
            "https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Ann Mwang'ombe",
            "mwangombe@gmail.com","1234567890"
        )
        var name4 = ContactData(
            8,
            "https://media.istockphoto.com/id/1444197522/photo/black-woman-green-makeup-and-face-on-skin-for-beauty-fashion-and-cosmetics-against-backdrop.webp?b=1&s=170667a&w=0&k=20&c=D59iE0OAckWbjLKKy9VRCgTgzcMfzQXeWvlLym3BVNU=",
            "Winnie Frida",
            "emillystephanie@gmail.com",
            "1234567"
        )
        var name7 =ContactData(
            4,
            "https://plus.unsplash.com/premium_photo-1683147627621-190cc667fd92?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
            "Magret Wamboi",
            "magret@gmail.com",
            ""

        )
        var name10 = ContactData(
            2,
            "https://images.unsplash.com/photo-1601821326018-d949a54b6402?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YmxhY2slMjBwZW9wbGUlMjBpbWFnZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q",
            "Miriam Longo",
            "miriam@gmail.com","123456789"
        )

        var name11=ContactData(
            11,
            "https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjJ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Purity wanjiku",
            "purity@gmail.com",
            "1234567"
        )
        var name12=ContactData(
            1,
            "https://images.unsplash.com/photo-1589156229687-496a31ad1d1f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjl8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Bridgit Mutesi",
            "bridgit@gmail.com",
            "111111112223456"
        )
        var name13=ContactData(
            13,
            "https://images.unsplash.com/photo-1502685104226-ee32379fefbe?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Joyce ",
            "joyce@gmail.com",

        "123456789"
        )
        var name14=ContactData(
            8,
            "https://images.unsplash.com/photo-1510736769521-207ed84f191e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzR8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Winine",
            "winnie@gmail.com",
            "1234567"
        )
        var names = listOf(name1, name2, name3, name4, name7, name10,name11,name12,name13,name14)
        val contactAdapter = ContactsRvAdapter(names)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter

    }
}

