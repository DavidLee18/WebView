package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webview.webViewClient = WebViewClient()
        val setting = webview.settings
        setting.builtInZoomControls = true
        setting.supportZoom()
        webview.loadUrl("https://google.com")
    }

    fun refresh(view: View) { webview.reload() }
    fun cancel(view: View) { webview.stopLoading() }
}
