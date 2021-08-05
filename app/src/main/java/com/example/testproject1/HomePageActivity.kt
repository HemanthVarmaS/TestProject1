package com.example.testproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomePageActivity : AppCompatActivity() {
    lateinit var txtUsernameInfo: TextView
    lateinit var txtPasswordInfo: TextView
    lateinit var btnViewEmployeeList:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        txtUsernameInfo = findViewById(R.id.txt_username_info)
        txtPasswordInfo = findViewById(R.id.txt_password_info)
        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")
        txtUsernameInfo.setText(username)
        txtPasswordInfo.setText(password)

        btnViewEmployeeList = findViewById(R.id.btn_view_employee_list)
        btnViewEmployeeList.setOnClickListener() {
            val intent = Intent(this,EmployeeListActivity::class.java)
            startActivity(intent)
        }

    }
}