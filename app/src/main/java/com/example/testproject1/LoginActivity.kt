package com.example.testproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    private lateinit var btnSignIn : Button
    private lateinit var tilUsername : TextInputLayout
    private lateinit var tilPassword : TextInputLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnSignIn = findViewById<Button>(R.id.btn_sign_in)
        tilUsername = findViewById<TextInputLayout>(R.id.til_username)
        tilPassword = findViewById<TextInputLayout>(R.id.til_password)
        btnSignIn.setOnClickListener(){
            val tilUsernameEditText = tilUsername.editText?.text
            val tilPasswordEditText = tilPassword.editText?.text
            if(tilUsernameEditText.isNullOrEmpty() && tilPasswordEditText.isNullOrEmpty()) {
                Toast.makeText(applicationContext,"Please enter the credentials",Toast.LENGTH_LONG).show()
            }
            else if(tilUsernameEditText.isNullOrEmpty()) {
                Toast.makeText(applicationContext,"Please enter username",Toast.LENGTH_LONG).show()
            }
            else if(tilPasswordEditText.isNullOrEmpty()) {
                Toast.makeText(applicationContext,"Please enter password",Toast.LENGTH_LONG).show()
            }
            if (tilUsernameEditText != null && tilPasswordEditText != null) {

                if(tilUsernameEditText.toString() == "test123@gmail.com" && tilPasswordEditText.toString() == "Test123") {
                    val intent = Intent(this,HomePageActivity::class.java)
                    intent.putExtra("username",tilUsernameEditText.toString())
                    intent.putExtra("password",tilPasswordEditText.toString())
                    startActivity(intent)
                }
                else if (tilUsernameEditText.toString() == "test123@gmail.com") {
                    Toast.makeText(applicationContext,"Incorrect password",Toast.LENGTH_LONG).show()
                }
                else {
                    Toast.makeText(applicationContext,"Incorrect details, please check again",Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    /*private fun signInAction(i:Any) {

    }*/
}