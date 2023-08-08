package com.example.my_contact_list_app.Repository

import com.example.my_contact_list_app.DataBase.ContactsDb
import com.example.my_contact_list_app.Model.ContactData
import com.example.my_contact_list_app.MyContactsApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
        val database = ContactsDb.getDatabase(MyContactsApp.appContext)
        suspend fun saveContact(contact: ContactData){
//        switching to ui thread
            withContext(Dispatchers.IO){
                database.getContactDao().insertContact(contact)
            }
        }

    }
