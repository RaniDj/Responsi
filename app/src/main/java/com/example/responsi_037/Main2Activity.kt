package com.example.responsi_037

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.responsi_037.R

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val nim = intent.getStringExtra("nama")
        val nama = intent.getStringExtra("nim")
        val prodi = intent.getStringExtra ("prodi")
        val ket : String

    }
}
