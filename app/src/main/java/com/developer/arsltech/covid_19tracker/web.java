package com.developer.arsltech.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView browser = (WebView) findViewById(R.id.webView);
        browser.loadUrl("https://www.masaischool.com/");

    }
}