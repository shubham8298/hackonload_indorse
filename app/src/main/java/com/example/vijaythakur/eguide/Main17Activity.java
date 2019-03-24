package com.example.vijaythakur.eguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main17Activity extends AppCompatActivity {
    private WebView wb8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        wb8 = (WebView) findViewById(R.id.webpage7);
        WebSettings webSettings = wb8.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb8.loadUrl("http://competition.careers360.com/articles/cds-eligibility-criteria");
        wb8.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb8.canGoBack()) {
            wb8.goBack();
        } else {
            super.onBackPressed();
        }
    }
}