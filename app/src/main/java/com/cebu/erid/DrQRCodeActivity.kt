package com.cebu.erid

import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST
import androidx.camera.core.ImageProxy
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import com.google.mlkit.vision.barcode.Barcode
import com.google.mlkit.vision.barcode.BarcodeScanner
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.common.InputImage
import kotlinx.android.synthetic.main.activity_qr_scanner.*
import java.util.concurrent.Executors

//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.camera.lifecycle.ProcessCameraProvider
//import androidx.core.content.ContextCompat
//import java.util.concurrent.Executors


class DrQRCodeActivity: AppCompatActivity() {

    val scanQRCodeLauncher = registerForActivityResult(ScanQRCode()) {result ->

    }
    //1. Use the library that I sent in the messenger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.button.setOnClickListener {scanQRCodeLauncher.launch(null)}
//        setContentView(R.layout.activity_drqrcode)
    }
}
