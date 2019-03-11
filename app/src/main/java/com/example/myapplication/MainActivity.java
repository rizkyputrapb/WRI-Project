package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnDialFBI(View view) {
        String phnNmbr = "087837498438";
        Intent itnFBI = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+phnNmbr));
        startActivity(itnFBI);
    }

    public void btnLinkURL(View view) {
        String URL = "https://www.bagas31.info/";
        Intent itnURL = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
        startActivity(itnURL);
    }
}
