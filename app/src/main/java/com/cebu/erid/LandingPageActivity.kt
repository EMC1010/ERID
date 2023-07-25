package com.cebu.erid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log



class LandingPageActivity : AppCompatActivity() {

    //1.Apply the viewBinding

    private lateinit var binding: LandingPageActivity //Dapat may magpapakita dito na LandingpageViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LandingPageActivity.inflate(layoutInflater)
        setContentView(R.layout.activity_landingpage) // binding.root

        binding.btnLogin.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.btnSignUp.setOnClickListener{
            Log.d("btnSignUp","click")
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}