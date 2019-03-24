package com.example.vijaythakur.eguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main15Activity extends AppCompatActivity {
    private WebView wb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        wb6 = (WebView) findViewById(R.id.webpage5);
        WebSettings webSettings = wb6.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb6.loadUrl("https://www.careerindia.com/upsc/ias-exam-e1.html");
        wb6.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb6.canGoBack()) {
            wb6.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
