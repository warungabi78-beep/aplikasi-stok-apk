package com.saipol.gudang;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        setContentView(webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://script.google.com/macros/s/AKfycby8ay2Y7cVJF1C4MAVM7tt_7IOTOxu6NMEfSArb6fr3AdiDeCD4nLCupqKvoyDQu7SS/exec");
    }
}
