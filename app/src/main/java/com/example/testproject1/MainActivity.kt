package com.example.testproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLayout2Dir=findViewById<Button>(R.id.btn_layout2_dir)
        btnLayout2Dir.setOnClickListener() {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }


}