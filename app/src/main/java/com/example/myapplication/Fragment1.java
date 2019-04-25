package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    TextView tv;
    WebView webView1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frag1, container,  false);

        webView1 = view.findViewById(R.id.webviewFrag1);

        WebSettings ws = webView1.getSettings();

        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        webView1.setWebViewClient(new WebViewClient());

        webView1.loadUrl("http://www.google.com");

        return view;
    }
}
