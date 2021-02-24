package com.topapps.elsaqa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webForm = findViewById(R.id.webView);

        webForm.setWebViewClient(new WebViewClient());
        webForm.loadUrl("http://elsaqa.tobeapps.com/");
        webForm.getSettings().setJavaScriptEnabled(true);
        webForm.getSettings().setLoadWithOverviewMode(true);
        webForm.getSettings().setUseWideViewPort(true);
        webForm.getSettings().setPluginState(WebSettings.PluginState.ON);
    }

    @Override
    public void onBackPressed() {
        if (webForm.canGoBack())
            webForm.goBack();
        else
        super.onBackPressed();
    }
}