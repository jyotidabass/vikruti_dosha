package com.dozy.ayurvedaconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NewDeveloperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_developer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "ayushrules7@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            // to your stuff here
            TextView name, email, info, tagline, website;
            name = (TextView) findViewById(R.id.dev_name);
            tagline = (TextView)findViewById(R.id.dev_tagline);
            info = (TextView) findViewById(R.id.dev_intro);
            website = (TextView) findViewById(R.id.dev_intro5);

            ImageView imageView = (ImageView)findViewById(R.id.dev_photo);


            name.setText("Gaurav Sachdeva");
            tagline.setText("Android Developer, Web Developer");
            website.setText("www.arav.ga");
            imageView.setImageAlpha(R.mipmap.ic_launcher);
            Toast.makeText(this, "You got that trick!", Toast.LENGTH_SHORT).show();
            return true;

        }
//        return super.onKeyLongPress(keyCode, event);
        return true;
    }
}
