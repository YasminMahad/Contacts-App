package com.yasmin.contactapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yasmin.contactapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContact()

    }
    fun displayContact(){
        var contact=Contact("Sara","sara@gmail.com","07456453645","89573","https://media.istockphoto.com/photos/african-american-girl-raising-her-hands-while-sitting-on-her-desk-in-picture-id1323715308?b=1&k=20&m=1323715308&s=170667a&w=0&h=MeG-_I7iI4HsElwGrxCgMm7P4QkJsWGmwvcrOyYnGlc=")
        var contact2 = Contact("Samiya","samiya@gmail.com","074250569","46738","https://media.istockphoto.com/photos/portrait-of-african-american-female-teacher-smiling-in-the-class-at-picture-id1328488607?b=1&k=20&m=1328488607&s=170667a&w=0&h=JseLPk7LOfXIKhL7Df9WJunZL9MjP3LMOt3Pp-O7hKs=")
        var contact3 = Contact("Hilda","hilda@gmail.com","074250569","46738","https://media.istockphoto.com/photos/portrait-of-african-american-female-teacher-smiling-in-the-class-at-picture-id1328488607?b=1&k=20&m=1328488607&s=170667a&w=0&h=JseLPk7LOfXIKhL7Df9WJunZL9MjP3LMOt3Pp-O7hKs=")
        var contact4 = Contact("Yas","yas@gmail.com","074250569","46738","https://media.istockphoto.com/photos/portrait-of-africanamerican-female-doctor-with-stethoscope-on-a-picture-id1313904445?b=1&k=20&m=1313904445&s=170667a&w=0&h=7IgWZkFHINxSw7eASpCfthgYgmxfZRpOK9VM39Vf7DQ=")
        var contact5 = Contact("Jane","jane@gmail.com","074250569","46738","https://media.istockphoto.com/photos/shot-of-an-attractive-young-woman-sitting-alone-on-a-mat-and-on-the-picture-id1317735408?b=1&k=20&m=1317735408&s=170667a&w=0&h=DWyywoNCFSpA2Td-qo5AQ4UWaW0HoujFOwsj78CyrUs=")
        var contact6 = Contact("Judi","judi@gmail.com","074250569","46738","https://images.unsplash.com/photo-1519011985187-444d62641929?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80")

        var contacts=listOf(contact,contact2,contact3,contact4,contact5,contact6)
        var contactList=ContactRvAdapter(contacts)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactList
    }


}
