package com.example.vijaythakur.eguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main7Activity extends AppCompatActivity {
private WebView wb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        wb1 = (WebView) findViewById(R.id.webpage);
        WebSettings webSettings = wb1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb1.loadUrl("https://engineering.careers360.com");
        wb1.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(wb1.canGoBack()) {
            wb1.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
