package com.example.vijaythakur.eguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main20Activity extends AppCompatActivity {
private WebView wb10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        wb10 = (WebView) findViewById(R.id.webpage9);
        WebSettings webSettings = wb10.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb10.loadUrl("http://collegedunia.com/exams/cds/eligibility/");
        wb10.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(wb10.canGoBack()) {
            wb10.goBack();
        }
        super.onBackPressed();
    }
}
