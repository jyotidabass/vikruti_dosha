package com.dozy.ayurvedaconverter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin;
        //Declaring SharedPreferences
        final SharedPreferences sharedPreferences = getSharedPreferences("LoginData", MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        //Checking SP if set then redirect to HOMEPAGE
        if (sharedPreferences.contains("NAME") && sharedPreferences.contains("EMAIL")){
          //  if (sharedPreferences.getString("NAME","")==""&&sharedPreferences.getString("EMAIL","")==""){
//                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
//                sharedPreferences.edit().remove("LoginData").commit();
//                sharedPreferences.edit().clear().commit();
//            }
//            else {
                Intent intent = new Intent(LoginActivity.this, HomePage.class);
                Toast.makeText(this, "Welcome back " + sharedPreferences.getString("NAME", ""), Toast.LENGTH_SHORT).show();
                startActivity(intent);
          //  }
        }


        //  TextView txtRegister;
        final EditText editText = (EditText) findViewById(R.id.ed_login_id);
        final EditText editText2 = (EditText) findViewById(R.id.ed_login_email);

        btnLogin = (Button)findViewById(R.id.btn_login);
        //   txtRegister = (TextView) findViewById(R.id.txt_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editText.getText().toString();
                String email = editText2.getText().toString();

                if (name == "" || email==""){
                    Toast.makeText(LoginActivity.this, "Error: Values cannot be empty", Toast.LENGTH_SHORT).show();
                }
                else if (name.isEmpty()||email.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Error: Values are empty", Toast.LENGTH_SHORT).show();

                }
                else {

                    Intent intent = new Intent(LoginActivity.this, HomePage.class);
                    editor.putString("NAME", name);
                    editor.putString("EMAIL", email);
                    editor.commit();
                    Toast.makeText(LoginActivity.this, "Hello " + name + "!", Toast.LENGTH_SHORT).show();
                    // Toast.makeText(LoginActivity.this, "Welcome to AMC!", Toast.LENGTH_SHORT).show();

                    startActivity(intent);
                }
            }
        });


    }
}
