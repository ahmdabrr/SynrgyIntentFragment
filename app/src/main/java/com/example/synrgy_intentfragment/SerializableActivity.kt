package com.example.synrgy_intentfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_parceable.*
import kotlinx.android.synthetic.main.activity_serializable.*

class SerializableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable)

        val personData = intent.getSerializableExtra("DataSerial") as PersonSerial
        val inputNama = personData.nama
        val inputUsia = personData.umur

        tvNamaSerial.setText("Nama : $inputNama")
        tvUmurSerial.setText("Nama : $inputUsia")

        btnBackSerial.setOnClickListener {
            finish()
        }
    }
}