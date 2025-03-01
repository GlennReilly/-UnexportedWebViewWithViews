package com.example.unexportedwebviewwithviews

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val webView = findViewById<WebView>(R.id.webView)
        val url = intent.getStringExtra("url")
        webView.loadUrl(url!!)
    }
}