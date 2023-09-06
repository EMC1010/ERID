package com.cebu.erid

import android.content.Intent
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cebu.erid.databinding.ActivityDrinfoBinding
import com.cebu.erid.databinding.ActivityDrqrcodeBinding

class DrInfoActivity: AppCompatActivity() {
    private lateinit var binding: ActivityDrinfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrinfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val closeButton: ImageView = findViewById(R.id.btnClose)

        closeButton.setOnClickListener{
            finish()
        }

        val saveButton = findViewById<Button>(R.id.btnSave)

        saveButton.setOnClickListener {
            showToast("Info Saved")
        }

        binding.btnNext.setOnClickListener {
            Log.d("btnNext", "click")
            startActivity(Intent(this,DrQRCodeActivity::class.java))
        }
    }

    private fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}