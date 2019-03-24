package com.example.vijaythakur.eguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main10Activity extends AppCompatActivity {
    private WebView wb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        wb4 = (WebView) findViewById(R.id.webpage3);
        WebSettings webSettings = wb4.getSettings();
        wb4.loadUrl("https://www.shiksha.com/exams/nda");
        wb4.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (wb4.canGoBack()) {
            wb4.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
