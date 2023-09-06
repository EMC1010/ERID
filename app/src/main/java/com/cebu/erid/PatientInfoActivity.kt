@file:Suppress("UNREACHABLE_CODE")

package com.cebu.erid


//import android.R
import android.annotation.SuppressLint
import android.content.Intent
import android.icu.text.Transliterator.Position
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cebu.erid.databinding.ActivityPatientBinding
import java.lang.reflect.Array


class PatientInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPatientBinding
    //    AdapterView.OnItemSelectedListener {
//
//    var gender = arrayOf<String?>("Male", "Female", "Gay", "Lesbian", "Transgender")
//

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPatientBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinner: Spinner = findViewById(R.id.gender)

        val adapter = ArrayAdapter.createFromResource(
            this, R.array.gender, android.R.layout.simple_spinner_item
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)

//        spinner.onItemSelectedListener(object : AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                TODO("Not yet implemented")
//
//                val selectedItem = parent.getItemAtPosition(1) as String
//
//                Toast.makeText(applicationContext, "Selected:$selectedItem", Toast.LENGTH_LONG).show()
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//            }
//        )

        binding.btnNext.setOnClickListener{
            Log.d("btnNext","click")
            startActivity(Intent(this,MedRecordActivity::class.java))
        }

        val saveButton = findViewById<Button>(R.id.btnSave)

        saveButton.setOnClickListener{
            showToast("Info Saved")
        }

    }

    private fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
//
//        val gender = resources.getStringArray(R.array.gender)
//
//        val spinner = findViewById<Spinner>(R.id.genderspinner)
//        if (spinner != null) {
//            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, gender)
//            spinner.adapter = adapter
//
//        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
//                Toast.makeText(this@PatientInfoActivity, getString(R.string.selected_item) +" "+ "" + gender[position], Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//        }
//        }
//
//        val spin = findViewById<Spinner>(R.id.genderspinner)
//        spin.onItemSelectedListener = this
//
//        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(
//            this, android.R.layout.simple_spinner_dropdown_item, gender
//        )
//
//        ad.setDropDownViewResource(
//            android.R.layout.simple_spinner_dropdown_item
//        )
//
//        spin.adapter = ad
//    }
//
//    override fun onItemSelected(parent: AdapterView<*>?, view:View, position: Int, id:Long){
//        Toast.makeText(applicationContext,gender[position], Toast.LENGTH_LONG).show()
//    }
//    override fun onNothingSelected(parent: AdapterView<*>?) {}
//    }
    }