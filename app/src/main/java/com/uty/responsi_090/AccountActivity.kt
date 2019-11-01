package com.uty.responsi_090

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val bundle = intent.extras
        val nama = bundle?.get("nama")
        val nim = bundle?.get("nim")
        val email = bundle?.get("email")

        nama_acc.text = ("NAMA :" + (nama))
        nim_acc.text = ("NIM :"+ (nim))
        email_acc.text = ("EMAIL :"+ (email))

    }
}
