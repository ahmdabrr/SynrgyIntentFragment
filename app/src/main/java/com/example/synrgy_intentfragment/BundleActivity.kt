package com.example.synrgy_intentfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bundle.*

class BundleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle)

        val bundle = intent.extras
        val inputNama = bundle!!.getString("nama")
        val inputUsia = bundle!!.getInt("umur").toString()

        tvNamaBundle.setText("Nama : $inputNama")
        tvUmurBundle.setText("Umur : $inputUsia th")

        btnBackBundle.setOnClickListener{
            finish()
        }
    }
}