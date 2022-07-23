package com.yasmin.contactapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yasmin.contactapplication.databinding.ContactListBinding

class ContactRvAdapter (var contactList:List<Contact>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvNumber.text=currentContact.phoneNumber
        holder.binding.tvEmail.text=currentContact.email
        holder.binding.tvAddress.text=currentContact.address
        Picasso.get().load(currentContact.image).resize(300,300).centerCrop().placeholder(R.drawable.ic_baseline_person_24).into(holder.binding.ivContact)
        val context=holder.itemView.context
        holder.binding.ivContact.setOnClickListener{ Toast.makeText(context,"You have clicked on the image",Toast.LENGTH_SHORT).show()

        }
        holder.binding.cvContact.setOnClickListener{
            val intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("PHONENUMBER",currentContact.phoneNumber)
            intent.putExtra("IMAGE",currentContact.image)
            intent.putExtra("EMAIL",currentContact.email)
            context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(val binding:ContactListBinding):
    RecyclerView.ViewHolder(binding.root){

}