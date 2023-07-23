package com.cebu.erid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding
import androidx.activity.result.contract.ActivityResultContracts



class LandingPageActivity : AppCompatActivity() {

    private lateinit var binding: LandingPageActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LandingPageActivity.inflate(layoutInflater)
        setContentView(R.layout.activity_landingpage)

        binding.btnLogin.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.btnSignUp.setOnClickListener{
            Log.d("btnSignUp","click")
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}