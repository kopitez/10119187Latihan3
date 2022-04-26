package com.example.monitory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), OnClickListener {

    private lateinit var buttmasuk: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttmasuk = findViewById(R.id.button_masuk)

        buttmasuk.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button_masuk ->{
                val intentBiasa = Intent(this@LoginActivity, BiodataActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }

}