package com.cebu.erid

import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DrInfoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drinfo)

        val closeButton: ImageView = findViewById(R.id.btnClose)

        closeButton.setOnClickListener{
            finish()
        }

        val saveButton = findViewById<Button>(R.id.btnSave)

        saveButton.setOnClickListener {
            showToast("Info Saved")
        }
    }

    private fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}