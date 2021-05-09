package com.x5s.simple_login_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signIn()
    }

    private fun signIn(){
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val loginButton = findViewById<MaterialButton>(R.id.login_button)

        loginButton.setOnClickListener(){
            if(email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()) {
                Toast.makeText(this,"Email or Password is not provided", Toast.LENGTH_LONG).show()
            }else {
                if (email.toString() == "zuri@gmail.com" && password.toString() == "12345") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Wrong email or password", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}