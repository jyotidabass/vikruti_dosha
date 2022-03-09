package com.dozy.ayurvedaconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DeveloperInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Email: we@dozy.in", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {

        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {

            TextView name, email, info, tagline, website;
            Button web = (Button)findViewById(R.id.btn_website);
            name = (TextView) findViewById(R.id.dev_name);
            tagline = (TextView)findViewById(R.id.dev_tagline);
 //           info = (TextView) findViewById(R.id.dev_intro);
//            website = (TextView) findViewById(R.id.dev_website);

         //   ImageView imageView = (ImageView)findViewById(R.id.dev_photo);
            name.setText("Gaurav Sachdeva");
            tagline.setText("Android Developer, Web Developer");
            web.setText("www.arav.ga");
        //    imageView.setImageAlpha(R.mipmap.ic_launcher);
            Toast.makeText(this, "You got that trick!", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (keyCode == KeyEvent.KEYCODE_BACK) {

            Toast.makeText(this, "Thank You!", Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        //  return onKeyDown(keyCode, event);
        return false;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
