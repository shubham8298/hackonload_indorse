package com.example.vijaythakur.eguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main21Activity extends AppCompatActivity {
    private WebView wb11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        wb11 = (WebView) findViewById(R.id.webpage10);
        WebSettings webSettings = wb11.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb11.loadUrl("http://www.studysector.com/upsc-cds-physical-medical-eligibility/");
        wb11.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb11.canGoBack()) {
            wb11.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
