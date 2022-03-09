package com.dozy.ayurvedaconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Units_Table_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units__table_);

        WebView web;
        web =(WebView)findViewById(R.id.webview);

//         = new WebView();
        web.loadUrl("file:///android_asset/unit_tabbles.html");
 //       make sure you cast the web view before using loadUrl() function :
  //        web.setWebViewClient(new MyWebViewClient());
        web.getSettings().setJavaScriptEnabled(true);


    }
}
