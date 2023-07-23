package com.cebu.erid

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class PatientInfoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)

        val dropdown = findViewById<Spinner>(R.id.spinner1)
        val gender = arrayOf("Male", "Female", "Gay", "Lesbian", "Transgender")
        val adapter = ArrayAdapter(this, R.layout.simple_spinner_dropdown_item, gender)
        dropdown.adapter = adapter
    }
}