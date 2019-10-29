package com.example.responsi_037

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import com.example.responsi_037.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DataDiri = findViewById<EditText>(R.id.editText)
        val Nama = findViewById<EditText>(R.id.editText)
        val Nim = findViewById<EditText>(R.id.editText2)
        val Prodi =findViewById<EditText>(R.id.editText3)

        button.setOnClickListener{
            if((editText.text.isEmpty())||editText2.text.isEmpty()||editText3.text.isEmpty()){
                toast("Kolom tidak boleh kosong",Toast.LENGTH_LONG)
            }else{
                val nama = Nama.text.toString()
                val nim = Nim.text.toString()
                val prodi : Prodi.text.toString())
                val intent = Intent(this@MainActivity, responsi_037::class.java)
                intent.putExtra("nama", nama)
                intent.putExtra("nim",nim)
                intent.putExtra("prodi",prodi)

                startActivity(intent)
    }
            fun toast(message: String,length: Int=Toast.LENGTH_LONG){
                Toast.makeText(this, message, length).show()
}
        }
    }
}