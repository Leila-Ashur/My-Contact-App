package com.example.my_contact_list_app.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts
import android.widget.Toast
import com.example.my_contact_list_app.R
import com.example.my_contact_list_app.databinding.ActivityAddContactBinding

class AddContacts : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            validateAddContact()
        }
    }
    fun validateAddContact() {
        val name = binding.etFast.text.toString()
        val name2 = binding.etLast.text.toString()
        val phoneNumber = binding.etNumber.text.toString()
        val email = binding.etEmail.text.toString()

        var error = false
        if (name.isEmpty()) {
            binding.tillFast.error = getString(R.string.first_name_required)

            error = true
        }
        if (name.isEmpty()) {
            binding.tillLast.error = getString(R.string.last_name_required)

            error = true
        }
        if (name2.isEmpty()) {
            binding.tillEmail.error = getString(R.string.password_required)

            error = true
        }
        if (email.isEmpty()) {
            binding.tillNumber.error = getString(R.string.phone_number_required)

            error = true
        }
        if (!error) {
            val intent = Intent(this, AddContacts::class.java)
            startActivity(intent)

//            val newContacts= Contacts(0,name,phoneNumber,"email")
        }
        Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show();
        finish();
    }

}






