package com.incipientstudios.webwrapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove the title bar.
        // Fullscreen not used as showing time/battery is nice.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        this.mWebView = (WebView) findViewById(R.id.webviewid);
        this.mWebView.setWebViewClient(new WebViewClient() {});
        this.mWebView.loadUrl("www.contoso.com");
        this.mWebView.getSettings().setJavaScriptEnabled(true);
    }
}
