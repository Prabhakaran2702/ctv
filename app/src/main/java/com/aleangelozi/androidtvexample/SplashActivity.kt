package com.aleangelozi.androidtvexample

import android.R
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.aleangelozi.androidtvexample.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivitySplashBinding.inflate(layoutInflater)
     setContentView(binding.root)


        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }, 1500)

    }


}