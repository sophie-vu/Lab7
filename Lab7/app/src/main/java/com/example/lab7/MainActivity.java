package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private static EditText username;
    private static EditText lastname;
    private static EditText EmailID;
    private static EditText password;
    private static EditText message;
    private static Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupVariables();
    }

    public static String getUsername(){
        return username.getText().toString();
    }

    public static String getLastname(){
        return lastname.getText().toString();
    }

    public static String getEmailID(){
        return EmailID.getText().toString();
    }

    public static String getPassword(){
        return password.getText().toString();
    }

    public void authenticateLogin(View view) {
        if (username.getText().toString().equals("user"))
            if (lastname.getText().toString().equals("test"))
                if (EmailID.getText().toString().equals("email@gmail.com"))
                    if (password.getText().toString().equals("admin"))
                        message.setText("Login Successful");
                    else
                        message.setText("Invalid Password");
                else
                    message.setText("Invalid Email");
            else
                message.setText("Invalid Last Name");
        else
            message.setText("Invalid First Name");
    }
    private void setupVariables() {
        username = (EditText) findViewById(R.id.username);
        lastname = (EditText)findViewById(R.id.Lastname) ;
        EmailID = (EditText)findViewById(R.id.email) ;
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.loginBtn);
        message = (EditText) findViewById(R.id.message);

    }

}