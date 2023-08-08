package com.example.my_contact_list_app.DataBase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.my_contact_list_app.Model.ContactData

@Dao
interface ContactDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertContact(contact: ContactData)

    }

