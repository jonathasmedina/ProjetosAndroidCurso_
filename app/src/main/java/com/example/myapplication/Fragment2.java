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


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    TextView tv2;
    WebView webView2;



    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.layout_frag2, container, false);

        webView2 = view.findViewById(R.id.webviewFrag2);

        WebSettings ws = webView2.getSettings();

        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        webView2.setWebViewClient(new WebViewClient());

        webView2.loadUrl("https://g1.globo.com/");

        return view;
    }

}
