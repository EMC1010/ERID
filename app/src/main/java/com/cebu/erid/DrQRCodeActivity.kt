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

    private val cameraExecutor = Executors.newSingleThreadExecutor()

    private val startForResult =
        registerForActivityResult(ActvityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
            }
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drqrcode)

        if (ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.CAMERA
        ) != android.content.pm.PackageManager.PERMISSION_GRANTED
        ){
            requestPermissions(arrayOf(android.Manifest.permission.CAMERA),123)
        } else{
            startCamera()
        }
    }
    private fun startCamera(){
        val cameraProviderFuture=ProcessCameraProvider.getInstance(this)

        cameraProviderFuture.addListener({
            val cameraProvider = cameraProviderFuture.get()

            val preview = androidx.camera.core.Preview.Builder().build().also {
                it.setSurfaceProvider(previewView.createSurfaceProvider())
        }
            val imageAnalysis = ImageAnalysis.Builder()
                .setBackpressureStrategy(STRATEGY_KEEP_ONLY_LATEST)
                .build()

            imageAnalysis.setAnalyzer(cameraExecutor, QRCodeAnalyzer { qrCodes ->

                qrCodes.forEach { qrCode ->

                    val qrValue = qrCode.rawValue


                    val resultIntent = Intent()
                    resultIntent.putExtra("SCAN_RESULT", qrValue)
                    setResult(RESULT_OK, resultIntent)
                    finish()
                }
            })

            try {
                val cameraSelector =
                    androidx.camera.core.CameraSelector.Builder().requireLensFacing(androidx.camera.core.CameraSelector.LENS_FACING_BACK).build()
                cameraProvider.bindToLifecycle(this, cameraSelector, preview, imageAnalysis)
            } catch (ex: Exception) {
                ex.printStackTrace()
            }

        }, ContextCompat.getMainExecutor(this))
    }

    private class QRCodeAnalyzer(private val onQRCodesDetected: (qrCodes: List<Barcode>) -> Unit) :
        ImageAnalysis.Analyzer {

        private val scanner: BarcodeScanner = BarcodeScanning.getClient()

        override fun analyze(imageProxy: ImageProxy) {
            val mediaImage = imageProxy.image
            if (mediaImage != null) {
                val image = InputImage.fromMediaImage(mediaImage, imageProxy.imageInfo.rotationDegrees)
                scanner.process(image)
                    .addOnSuccessListener { barcodes ->
                        onQRCodesDetected(barcodes)
                    }
                    .addOnFailureListener { ex ->
                        ex.printStackTrace()
                    }
                    .addOnCompleteListener {
                        imageProxy.close()
                    }
            }
        }
    }
}