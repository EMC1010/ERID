package com.cebu.erid

import android.content.Intent
import android.os.Binder
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cebu.erid.databinding.ActivityMedrecordBinding

class MedRecordActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMedrecordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMedrecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val closeButton: ImageView = findViewById(R.id.btnClose)

        closeButton.setOnClickListener {
            finish()
        }

        val saveButton = findViewById<Button>(R.id.btnSave)

        saveButton.setOnClickListener {
            showToast("Info Saved")
        }

        val previousButton = findViewById<Button>(R.id.btnBack)

        previousButton.setOnClickListener {
            onBackPressed()
        }

        binding.btnNext.setOnClickListener {
            Log.d("btnNext", "click")
            startActivity(Intent(this,PatientCodeActivity::class.java))
        }
    }

    private fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}