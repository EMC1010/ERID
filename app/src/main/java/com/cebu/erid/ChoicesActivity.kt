package com.cebu.erid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ChoicesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choices)

        fun onImageViewClick(view: View){
            val intent = Intent(this, PatientInfoActivity::class.java)
            startActivity(intent)
        }

        fun onImageViewClick(view: View){
            val intent = Intent(this,DrInfoActivity::class.java)
            startActivity(intent)
        }
    }
}