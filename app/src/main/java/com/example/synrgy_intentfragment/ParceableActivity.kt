package com.example.synrgy_intentfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_parceable.*

class ParceableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parceable)

        val personData =intent.getParcelableExtra<PersonParcel>("DataParcel") as PersonParcel
        val inputNama = personData.nama
        val inputUsia = personData.umur

        tvNamaParcel.setText("Nama : $inputNama")
        tvUmurParcel.setText("Nama : $inputUsia")

        btnBackParcel.setOnClickListener{
            finish()
        }
    }
}