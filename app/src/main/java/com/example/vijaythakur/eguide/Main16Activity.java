package com.example.vijaythakur.eguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main16Activity extends AppCompatActivity {
    private WebView wb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        wb7 = (WebView) findViewById(R.id.webpage6);
        WebSettings webSettings = wb7.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb7.loadUrl("http://www.entrance360.com/jobs/ias-sample-papers/");
        wb7.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb7.canGoBack()) {
            wb7.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
