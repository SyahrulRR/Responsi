package com.uty.responsi_090

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.item_home.*

class RegisterActivity : AppCompatActivity() {

    private lateinit var nama_pt: EditText
    private lateinit var username_pt : EditText
    private lateinit var pasword_pt : EditText
    private lateinit var email_pt : EditText
    private lateinit var daftar_akun : Button
    private lateinit var bttn_kembali : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        nama_pt = findViewById(R.id.nama_pt)
        username_pt = findViewById(R.id.username_pt)
        pasword_pt = findViewById(R.id.pasword_pt)
        email_pt = findViewById(R.id.email_pt)
        daftar_akun = findViewById(R.id.daftar_akun)
        bttn_kembali = findViewById(R.id.bttn_kembali)

        daftar_akun.setOnClickListener(){
            val intent = Intent (this, MainActivity::class.java)
            intent.putExtra("Nama Lengkap",nama_pt.text.toString())
            intent.putExtra("Username",username_pt.text.toString())
            intent.putExtra("pasword",pasword_pt.text.toString())
            Toast.makeText(this,"Berhasil, akun telah dibuat",Toast.LENGTH_LONG).show()
        }
    }
}
