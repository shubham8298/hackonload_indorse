package com.example.vijaythakur.eguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main24Activity extends AppCompatActivity {
    private WebView wb14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);
        wb14 = (WebView) findViewById(R.id.webpage13);
        WebSettings webSettings = wb14.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb14.loadUrl("http://www.entrance360.com/jobs/cds-sample-papers/");
        wb14.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb14.canGoBack()) {
            wb14.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
