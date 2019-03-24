package com.example.vijaythakur.eguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main11Activity extends AppCompatActivity {
private WebView wb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        wb5 = (WebView) findViewById(R.id.webpage4);
        WebSettings webSettings = wb5.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb5.loadUrl("https://collegedunia.com/exams/ias-exam/syllabus");
        wb5.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(wb5.canGoBack()) {
            wb5.goBack();
        } else{
            super.onBackPressed();
        }
    }
}

