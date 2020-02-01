package com.example.webviewvisibilitychangedsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val webView by lazy {
        findViewById<BackgroundMediaWebView>(R.id.webview)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initWebView()

        webView.loadUrl("https://www.youtube.com/watch?v=llGgO74uXMI&t=1609s")
    }

    private fun initWebView() {
        webView.settings.javaScriptEnabled = true

        webView.webChromeClient = object: WebChromeClient() {

        }

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                return super.shouldOverrideUrlLoading(view, url)
            }

            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }
    }

}
