package com.example.android.dezlumid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton();
    }

    public void loginButton() {
        final String UserId;
        Button login_button;
        final int pin;
        EditText text = (EditText) findViewById(R.id.login);
        UserId = text.getText().toString();
        EditText pass = (EditText) findViewById(R.id.password);
        String value = pass.getText().toString();
        pin = Integer.parseInt(value);
        login_button = (Button) findViewById(R.id.button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (UserId.equals("ayush") && (pin == 1202)) {
                    Toast.makeText(Login.this, "Please Wait", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent("com.example.android.dezlumid.User_Ayush");
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "Username and password is NOT correct \nContact Admin",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
