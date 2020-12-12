package com.appmantul.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appmantul.app.R
import com.appmantul.app.databinding.ActivityMainBinding
import com.appmantul.app.ui.auth.AppmantulAuth
import com.appmantul.app.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            AppmantulAuth.logout(this){
                startActivity(Intent(this,AuthActivity::class.java))
                finish()
            }
        }
    }
}