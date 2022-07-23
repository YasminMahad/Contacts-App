package com.yasmin.contactapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import com.yasmin.contactapplication.databinding.ActivityMainBinding
import com.yasmin.contactapplication.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name = intent.extras?.getString("NAME")
        var address = intent.extras?.getString("ADDRESS")
        var message = intent.extras?.getString("MESSAGE")
        var call = intent.extras?.getString("CALL")
        var image = binding.ivContact2
        var email = intent.extras?.getString("EMAIL")
        var phoneNumber = intent.extras?.getString("PHONENUMBER")
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,address,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,message,Toast.LENGTH_SHORT)
        Toast.makeText(this,call,Toast.LENGTH_SHORT)

        binding.tvNam.text = name
        binding.tvAddress2.text = address
        binding.tvEmail2.text = email
        binding.tvNumber2.text = phoneNumber
        Picasso.get().load(intent.getStringExtra("IMAGE")).resize(200, 200).centerCrop().into(image)


    }
}