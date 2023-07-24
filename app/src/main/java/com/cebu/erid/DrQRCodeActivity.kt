package com.cebu.erid

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DrQRCodeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drqrcode)

        generateandDisplayQRCode()
    }

    private fun generateandDisplayQRCode() {
        GlobalScope.launch(Dispatchers.IO) {
            val content = "Your_content_to_encode"

            val barcodeEncoder = BarcodeEncoder()
            val bitmap: Bitmap = barcodeEncoder.encodeBitmap(content, BarcodeFormat.QR_CODE, 300, 300)

            withContext(Dispatchers.Main) {
                val imageViewQRCode: ImageView = findViewById(R.id.imageViewQRCode)
                imageViewQRCode.setImageBitmap(bitmap)
            }
        }
    }
}