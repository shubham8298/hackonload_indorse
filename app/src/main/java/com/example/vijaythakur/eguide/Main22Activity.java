package com.example.vijaythakur.eguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main22Activity extends AppCompatActivity {
    private WebView wb12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        wb12 = (WebView) findViewById(R.id.webpage11);
        WebSettings webSettings = wb12.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb12.loadUrl("http://collegedunia.com/exams/cds/exam-pattern");
        wb12.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb12.canGoBack()) {
            wb12.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
