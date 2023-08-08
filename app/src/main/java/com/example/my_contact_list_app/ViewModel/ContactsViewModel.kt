package com.example.my_contact_list_app.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.my_contact_list_app.Model.ContactData
import com.example.my_contact_list_app.Repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel:ViewModel() {

        val contactsRepo = ContactsRepository()
        fun saveContact(contact: ContactData){
            viewModelScope.launch {
                contactsRepo.saveContact(contact)
            }
        }
    }
