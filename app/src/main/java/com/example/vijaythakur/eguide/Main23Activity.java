package com.example.vijaythakur.eguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main23Activity extends AppCompatActivity {
    private WebView wb13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        wb13 = (WebView) findViewById(R.id.webpage12);
        WebSettings webSettings = wb13.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb13.loadUrl("www.freejobalert.com/cds-syllabus/24724");
        wb13.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb13.canGoBack()) {
            wb13.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
