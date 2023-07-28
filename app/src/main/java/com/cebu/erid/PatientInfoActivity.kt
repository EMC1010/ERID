package com.cebu.erid


//import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class PatientInfoActivity : AppCompatActivity() {
//    AdapterView.OnItemSelectedListener {
//
//    var gender = arrayOf<String?>("Male", "Female", "Gay", "Lesbian", "Transgender")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient)

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
}
