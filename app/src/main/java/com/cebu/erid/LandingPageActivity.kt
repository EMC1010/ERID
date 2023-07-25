package com.cebu.erid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.cebu.erid.databinding.ActivityLandingpageBinding
import android.widget.Button
import android.widget.TextView



class LandingPageActivity : AppCompatActivity() {

    //1.Apply the viewBinding

    private lateinit var binding: ActivityLandingpageBinding //Dapat may magpapakita dito na LandingpageViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingpageBinding.inflate(layoutInflater)
        setContentView(binding.root) // binding.root

        binding.btnLogin.setOnClickListener {
            Log.d("btnLogin","click")
            startActivity(Intent(this, LoginActivity::class.java))
        }

        binding.btnSignUp.setOnClickListener{
            Log.d("btnSignUp","click")
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}