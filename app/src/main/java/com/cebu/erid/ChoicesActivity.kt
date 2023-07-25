package com.cebu.erid

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ChoicesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choices)


    }

    fun onImageViewClick2(view: View){
        val intent = Intent(this, PatientInfoActivity::class.java)
        startActivity(intent)

//        intent.setOnClickListener{
//
//        }
    }

    fun onImageViewClick(view: View){
        val intent = Intent(this,DrInfoActivity::class.java)
        startActivity(intent)
    }
}