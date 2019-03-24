package com.example.vijaythakur.eguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main19Activity extends AppCompatActivity {
    private WebView wb9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        wb9 = (WebView) findViewById(R.id.webpage8);
        WebSettings webSettings = wb9.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb9.loadUrl("http://wordpandit.com/cds-qualification/");
        wb9.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb9.canGoBack()) {
            wb9.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
