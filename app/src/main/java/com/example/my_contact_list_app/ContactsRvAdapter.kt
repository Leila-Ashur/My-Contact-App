package com.example.my_contact_list_app


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
//import com.example.contactsapp.databinding.ContactListItemBinding
import com.example.my_contact_list_app.databinding.ContactListItemBinding

class ContactsRvAdapter(var contactData: List<contactAdapter>):RecyclerView.Adapter<ContactsRvAdapter.ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val binding =ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)

    }


    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val currentContact = contactData[position]
        val binding=holder.binding
        binding.ivContact.tag =currentContact.image
        binding.tvEmail.text=currentContact.emailAddress
        binding.tvName.text=currentContact.name
        binding.tvNumber.text =currentContact.phoneNumber

    }
    override fun getItemCount(): Int {
        return  contactData.size
    }

    class ContactsViewHolder(var binding: ContactListItemBinding): ViewHolder(binding.root)

}