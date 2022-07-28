package com.example.reveriedrawing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.ThemeReverieDrawing)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}