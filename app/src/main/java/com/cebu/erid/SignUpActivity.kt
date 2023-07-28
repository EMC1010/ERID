package com.cebu.erid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import java.util.Scanner

class SignUpActivity : AppCompatActivity() {

//    data class User(
//        val username: String,
//        val password: String,
//        val firstname: String,
//        val lastname: String
//    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val etFirstName = findViewById<EditText>(R.id.etFirstName)
        val etLastName = findViewById<EditText>(R.id.etLastName)


        btnSignUp.setOnClickListener {
            val username = etUsername.text.toString()
            val firstname = etFirstName.text.toString()
            val lastname = etLastName.text.toString()
            val password = etPassword.text.toString()
        }

        val backButton: ImageView = findViewById(R.id.btnBack)
        backButton.setOnClickListener{
            finish()
        }
    }
}
    //1. Add the viewBinding
    //2. Get the text from editText, Username.getText
    //3. Boolean checkBox, checkBox.isChecked == true or false
    //4. Add onclicklistener in buttons
    //5. Add function for the button, sending it to the database

//    fun getText() {
//
//    }
//
//
////        fun main() {
////            val scanner = Scanner(System."in")
////
////            println("Welcome to E.R. ID")
////
////            val username = getUsername(scanner)
////            val password = getPassword(scanner)
////            val firstname = getFirstName(scanner)
////            val lastname = getLastName(scanner)
////
////            val newUser = User(username, password, firstname, lastname)
////
////            println("Sign Up Successful!")
////            println("Your Information")
////            println("Username: ${newUser.username}")
////            println("Password: ${newUser.password}")
////            println("First Name: ${newUser.firstname}")
////            println("Surname: ${newUser.lastname}")
////        }
//
//        fun getUsername(scanner: Scanner): String {
//            print("Username: ")
//            return scanner.nextLine()
//        }
//
//        fun getPassword(scanner: Scanner): String{
//            print("Password: ")
//            return scanner.nextLine()
//        }
//
//        fun getFirstName(scanner: Scanner): String{
//            print("First Name: ")
//            return scanner.nextLine()
//        }
//
//        fun getLastName(scanner: Scanner): String{
//            print("Surname: ")
//            return scanner.nextLine()
//        }
//}