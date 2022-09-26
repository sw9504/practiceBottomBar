@file:Suppress("DEPRECATION")

package com.utn.practicebottombar.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.utn.practicebottombar.R
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private var SPLASH_TIME_MS : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, bottomBarActivity::class.java)
            startActivity(intent)
        }, SPLASH_TIME_MS)
    }
}