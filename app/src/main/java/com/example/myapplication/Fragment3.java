package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {


    TextView tv3;
    WebView webView3;

    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.layout_frag3, container, false);

        webView3 = view.findViewById(R.id.webviewFrag3);

        WebSettings ws = webView3.getSettings();

        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        webView3.setWebViewClient(new WebViewClient());

        webView3.loadUrl("https://www.uol.com.br/");

        return view;
    }

}
