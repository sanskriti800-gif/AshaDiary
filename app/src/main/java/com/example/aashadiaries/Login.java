package com.example.aashadiaries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText uid;
    EditText password;
    TextView title;
    Button signIn;
    Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uid = findViewById(R.id.UserID);
        password = findViewById(R.id.Password);
        signIn = findViewById(R.id.buttonSignIn);
        logIn = findViewById(R.id.buttonLogin);
        title = findViewById(R.id.Title);

        SharedPreferences sp = getSharedPreferences("LogIn",MODE_PRIVATE);

        if(sp.getString("Username",null)!=null){
            LogIn();
//            title.setText("User Login");
//            uid.setText(sp.getString("Username",null));
//            if(password.requestFocus()) {
//                getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//            }
//            logIn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if(uid.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
//                        Toast.makeText(Login.this, "Enter UID and Password", Toast.LENGTH_SHORT).show();
//                    }else{
//                        String userName = sp.getString("Username",null);
//                        String pass = sp.getString("Password",null);
//                        if(password.getText().toString().matches(pass)){
//                            Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
//                        }else{
//                            Toast.makeText(Login.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                }
//            });
        }else{
//            title.setText("New User Registration");
//            logIn.setVisibility(View.GONE);
//            signIn.setVisibility(View.VISIBLE);
//            SharedPreferences.Editor ed =  sp.edit();
//            signIn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if(uid.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
//                        Toast.makeText(Login.this, "Enter UID and Password", Toast.LENGTH_SHORT).show();
//                    }else{
//                        ed.putString("Username",uid.getText().toString());
//                        ed.putString("Password",password.getText().toString());
//                        ed.apply();
//                        password.setText("");
//                        logIn.setVisibility(View.VISIBLE);
//                        signIn.setVisibility(View.GONE);
//                    }
//                }
//            });
            SignIn();
        }
    }
    public void SignIn(){
        title.setText("New User Registration");
        logIn.setVisibility(View.GONE);
        signIn.setVisibility(View.VISIBLE);
        SharedPreferences sp = getSharedPreferences("LogIn",MODE_PRIVATE);
        SharedPreferences.Editor ed =  sp.edit();
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(uid.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                    Toast.makeText(Login.this, "Enter UID and Password", Toast.LENGTH_SHORT).show();
                }else{
                    ed.putString("Username",uid.getText().toString());
                    ed.putString("Password",password.getText().toString());
                    ed.apply();
                    password.setText("");
                    signIn.setVisibility(View.GONE);
                    startActivity(new Intent(getApplicationContext(),profile.class));
                }
            }
        });
    }
    public void LogIn(){
        title.setText("User Login");
        SharedPreferences sp = getSharedPreferences("LogIn",MODE_PRIVATE);
        uid.setText(sp.getString("Username",null));
        if(password.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(uid.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                    Toast.makeText(Login.this, "Enter UID and Password", Toast.LENGTH_SHORT).show();
                }else{
                    String userName = sp.getString("Username",null);
                    String pass = sp.getString("Password",null);
                    if(password.getText().toString().matches(pass)){
                        Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    }else{
                        Toast.makeText(Login.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}