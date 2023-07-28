package com.cebu.erid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cebu.erid.databinding.ActivtyLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var binding: ActivtyLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivtyLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        etUsername = findViewById(R.id.etUsername)
//        etPassword = findViewById(R.id.etPassword)
//        btnLogin = findViewById(R.id.btnLogin)

        binding.btnLogin.setOnClickListener {
//            val username = etUsername.text.toString()
//            val password = etPassword.text.toString()
//
//            //Replace "your_username" and "your_password" with the correct login credentials
//            val correctUsername = "your username"
//            val correctPassword = "your password"
//
//            if (username == correctUsername && password == correctPassword) {
//                //Login Successful
//                showToast("Login Successful!")
//            }
////                if (password == correctUsername && correctPassword == correctPassword){
////            }
//            else {
//                //Login Failed
//                showToast("Invalid credentials. Please try again.")
//                }
            startActivity(Intent(this, ChoicesActivity::class.java))
        }
    }
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
}