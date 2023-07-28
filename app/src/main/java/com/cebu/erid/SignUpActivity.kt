package com.cebu.erid

//import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import android.content.Intent
import com.cebu.erid.databinding.ActivitySignupBinding
import java.util.Scanner

class SignUpActivity : AppCompatActivity() {

//    data class User(
//        val username: String,
//        val password: String,
//        val firstname: String,
//        val lastname: String
//    )

//    @SuppressLint("MissingInflatedId")

//    private lateinit var etFirstName: EditText
//    private lateinit var etLastName: EditText
//    private lateinit var etUsername: EditText
//    private lateinit var etPassword:EditText
//    private lateinit var btnSignUp: Button
    private lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignUp.setOnClickListener {
//            val username = etUsername.text.toString()
//            val firstname = etFirstName.text.toString()
//            val lastname = etLastName.text.toString()
//            val password = etPassword.text.toString()
//
//
//            val enterFirstName = "Enter your First Name"
//            val enterLastName = "Enter your Surname"
//            val enterUsername = "Enter your Username"
//            val enterPassword = "Enter the Password"
//
//            if (firstname == enterFirstName && lastname == enterLastName && username == enterUsername && password == enterPassword){
//                showToast("Sign Up Successful")
//            }
//            else {
//                showToast("FILL UP")
//            }

            startActivity(Intent(this, LoginActivity::class.java))
        }

        val backButton: ImageView = findViewById(R.id.btnBack)
        backButton.setOnClickListener{
            finish()
        }
    }

    private fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
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