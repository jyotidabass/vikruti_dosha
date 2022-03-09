package com.dozy.ayurvedaconverter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomePage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        String namen = "AMC", emailn="we@dozy.in";

        //Calling SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("LoginData", MODE_PRIVATE);

        if (!sharedPreferences.contains("NAME")|| !sharedPreferences.contains("EMAIL")){

//            if (sharedPreferences.getString("NAME", "")==""
//                    || sharedPreferences.getString("EMAIL", "")=="")
//            {

                Intent intent = new Intent(HomePage.this, LoginActivity.class);
                Toast.makeText(this, "Error: Not Logged In!", Toast.LENGTH_SHORT).show();
                startActivity(intent);

           // }
        }
        else{
            namen = sharedPreferences.getString("NAME", "");
            emailn = sharedPreferences.getString("EMAIL", "");


     //       Toast.makeText(this, ""+namen+emailn, Toast.LENGTH_SHORT).show();
        }




        //Main Functions
        Button btn_open_calc, btn_dev_info, btn_feedback, btn_logout, btn_ayurveda, btn_tables;

        btn_open_calc = (Button)findViewById(R.id.btn_home_open_calculator);
        btn_dev_info = (Button)findViewById(R.id.btn_home_developer);
   //     btn_feedback = (Button)findViewById(R.id.btn_home_feedback);
      //  btn_logout = (Button)findViewById(R.id.btn_home_logout);
        btn_ayurveda = (Button) findViewById(R.id.btn_home_ayurveda_wiki);
        btn_tables = (Button) findViewById(R.id.btn_home_unit_table);

        btn_open_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, CalculatorActivity.class);
                startActivity(intent);

            }
        });

        btn_dev_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, DeveloperInfoActivity.class);
                startActivity(intent);
            }
        });

        btn_ayurveda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, AyurvedaInfoActivity.class);
                startActivity(intent);
            }
        });

        btn_tables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,Units_Table_Activity.class );
                startActivity(intent);
            }
        });

//        btn_feedback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent intent = new Intent(HomePage.this, FeedbackActivity.class);
////                startActivity(intent);
//                Toast.makeText(HomePage.this, "Feedback Module will be included soon.", Toast.LENGTH_SHORT).show();
//            }
//        });

//        btn_logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                sharedPreferences.edit().remove("LoginData").commit();
//                sharedPreferences.edit().clear().commit();
//                Intent intent = new Intent(HomePage.this, LoginActivity.class);
//                Toast.makeText(HomePage.this, "Logout Success!", Toast.LENGTH_SHORT).show();
//                startActivity(intent);
//            }
//        });


        //Main Functions

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Toast.makeText(HomePage.this, "Feedback Module will be included soon.", Toast.LENGTH_SHORT).show();

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View hView =  navigationView.getHeaderView(0);


        TextView tname, temail;
        tname = (TextView)hView.findViewById(R.id.nav_header_name);
        temail = (TextView)hView.findViewById(R.id.nav_header_email);

                tname.setText(namen);
                temail.setText(emailn);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Toast.makeText(this, "Cannot Go Back.", Toast.LENGTH_SHORT).show();
          //  super.onBackPressed();
            //TODO
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_1) {
                    Intent intent = new Intent(HomePage.this, CalculatorActivity.class);
                    startActivity(intent);
        } else if (id == R.id.nav_2) {
           Intent intent = new Intent(HomePage.this, AyurvedaInfoActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_3) {
            Intent intent = new Intent(HomePage.this, Units_Table_Activity.class);
            startActivity(intent);
        } else if (id == R.id.nav_4) {
            Intent intent = new Intent(HomePage.this, DeveloperInfoActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {
//            Intent intent = new Intent(this, NewDeveloperActivity.class);
//            startActivity(intent);
            Toast.makeText(this, "Will include this module soon.", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_logout) {
            SharedPreferences sharedPreferences = getSharedPreferences("LoginData", MODE_PRIVATE);

            sharedPreferences.edit().remove("LoginData").commit();
                    sharedPreferences.edit().clear().commit();
                    Intent intent = new Intent(HomePage.this, LoginActivity.class);
                    Toast.makeText(HomePage.this, "Logout Success!", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
