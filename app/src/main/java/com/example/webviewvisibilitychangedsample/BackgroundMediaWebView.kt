package com.example.webviewvisibilitychangedsample

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.webkit.WebView

class BackgroundMediaWebView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : WebView(context, attrs, defStyleAttr) {

    override fun onWindowVisibilityChanged(visibility: Int) {
        super.onWindowVisibilityChanged(View.VISIBLE)

        Log.i("BackgroundMediaWebView", "onWindowVisibilityChanged " +
                "visibility=${toReadableVisibility(visibility)}")
    }

    private fun toReadableVisibility(visibility: Int): String {
        return when(visibility) {
            View.VISIBLE -> "Visible"
            View.INVISIBLE -> "Invisible"
            View.GONE -> "Gone"
            else -> "Unknown"
        }
    }
}