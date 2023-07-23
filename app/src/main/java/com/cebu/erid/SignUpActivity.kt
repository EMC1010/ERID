package com.cebu.erid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Scanner

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        data class User(val username: String, val password: String, val firstname: String, val lastname: String)

        fun main() {
            val scanner = Scanner(System.'in')

            println("Welcome to E.R. ID")

            val username = getUsername(scanner)
            val password = getPassword(scanner)
            val firstname = getFirstName(scanner)
            val lastname = getLastname(scanner)

            val newUser = User(username, password, firstname, lastname)

            println("Sign Up Successful!")
            println("Your Information")
            println("Username: ${newUser.username}")
            println("Password: ${newUser.password}")
            println("First Name: ${newUser.firstname}")
            println("Surname: ${newUser.lastname}")
        }

        fun getUsername(scanner: Scanner): String {
            print("Username: ")
            return scanner.nextLine()
        }

        fun getPassword(scanner: Scanner): String{
            print("Password: ")
            return scanner.nextLine()
        }

        fun getFirstname(scanner: Scanner): String{
            print("First Name: ")
            return scanner.nextLine()
        }

        fun getLastname(scanner: Scanner): String{
            print("Surname: ")
            return scanner.nextLine()
        }
    }
}