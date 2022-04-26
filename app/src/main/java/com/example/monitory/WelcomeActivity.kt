package com.example.monitory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.view.View
import android.widget.Button

class WelcomeActivity : AppCompatActivity(), OnClickListener {

    private lateinit var buttmulai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        buttmulai = findViewById(R.id.button_mulai)

        buttmulai.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button_mulai ->{
                val intentBiasa = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }

}