package com.cebu.erid


import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import com.cebu.erid.databinding.ActivityDrqrcodeBinding
import io.github.g00fy2.quickie.ScanQRCode
import java.util.concurrent.Executors


class DrQRCodeActivity: AppCompatActivity() {
    lateinit var binding: ActivityDrqrcodeBinding
    //1. Use the library that I sent in the messenger

    val scanQRCodeLauncher = registerForActivityResult(ScanQRCode()) {result ->
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drqrcode)

        binding.btnQRScan.setOnClickListener { scanQRCodeLauncher.launch(null)}
    }
}
