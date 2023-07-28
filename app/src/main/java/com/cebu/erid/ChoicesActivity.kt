package com.cebu.erid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.cebu.erid.databinding.ActivityChoicesBinding

class ChoicesActivity: AppCompatActivity() {

    private lateinit var binding: ActivityChoicesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoicesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDR.setOnClickListener{
            Log.d("btnDR", "click")
            startActivity(Intent(this, DrInfoActivity::class.java))
        }

        binding.btnPatient.setOnClickListener {
            Log.d("btnPatient", "click")
            startActivity(Intent(this, PatientInfoActivity::class.java))
        }
    }
}
//base on the Landing Page
//    fun onImageViewClick2(view: View){
//        val intent = Intent(this, PatientInfoActivity::class.java)
//        startActivity(intent)
//    }
//
//    fun onImageViewClick(view: View){
//        val intent = Intent(this,DrInfoActivity::class.java)
//        startActivity(intent)
//    }
//}