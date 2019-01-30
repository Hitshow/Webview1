package com.example.a.webview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eta;
    EditText etb;
    EditText etc;
    WebView wv;
    String a,b,c ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eta = (EditText) findViewById(R.id.eta);
        etb = (EditText) findViewById(R.id.etb);
        etc = (EditText) findViewById(R.id.etc);
        wv = (WebView) findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());
    }

    public void clr(View view) {
        eta.setText("");
        etb.setText("");
        etc.setText("");
    }

    public void lod(View view) {
        a = eta.getText().toString();
        b = etb.getText().toString();
        c = etc.getText().toString();
        wv.loadUrl("https://www.google.com/search?q="+a+"x%5E2%2B"+b+"x%2B"+c+"&oq=x&aqs=chrome.0.69i59j69i60j69i59j69i60j69i57j69i60.1281j0j7&sourceid=chrome&ie=UTF-8");
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url) {
         view.loadUrl(url);
         return true;
        }
    }
}
