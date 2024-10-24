package com.indri.klinikapp_mi2a

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //splash screen
        //handle untuk delay selama bbrp detik
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this, StarterPage::class.java)
                startActivity(intent)
                finish() //agar ketika sudah pindah ke page berikutnya, ini page gak back
            }, 3000
        )

        //Task
        //Splash Screen
        //Page page start screen --> Klik button get stared
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.imageView2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}