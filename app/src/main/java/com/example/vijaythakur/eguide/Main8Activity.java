package com.example.vijaythakur.eguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main8Activity extends AppCompatActivity {
    private WebView wb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        wb2 = (WebView) findViewById(R.id.webpage1);
        WebSettings webSettings = wb2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb2.loadUrl("https://medicine.careers360.com");
        wb2.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb2.canGoBack()) {
            wb2.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
