package com.example.vijaythakur.eguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main9Activity extends AppCompatActivity {
    private WebView wb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        wb3 = (WebView) findViewById(R.id.webpage2);
        WebSettings webSettings = wb3.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb3.loadUrl("https://www.shiksha.com/accounting-commerce/accounting/icai-exam");
        wb3.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(wb3.canGoBack()) {
            wb3.goBack();
        } else{
            super.onBackPressed();
        }
    }
}
