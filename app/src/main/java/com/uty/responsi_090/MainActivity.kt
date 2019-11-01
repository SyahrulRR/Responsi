package com.uty.responsi_090

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var username_tv:EditText
    private lateinit var password_tv:EditText
    private lateinit var bttn_masuk:Button
    private lateinit var daftar_tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username_tv = findViewById(R.id.username_tv)
        password_tv = findViewById(R.id.password_tv)
        bttn_masuk = findViewById(R.id.bttn_masuk)
        daftar_tv = findViewById(R.id.daftar_tv)

        bttn_masuk.setOnClickListener(){
            if (username_tv.text.toString() == "syahrul" && password_tv.text.toString() == "191298"){
                val intent = Intent (this, HomeActivity::class.java)
            }
        }

        daftar_tv.setOnClickListener(){
            val intent = Intent (this, RegisterActivity::class.java)
        }


    }
}
