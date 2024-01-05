package com.example.login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button loginBtn;
    EditText userInput;
    EditText userPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput =(EditText) findViewById(R.id.username_input);
        userPassword =(EditText) findViewById(R.id.user_password);
        loginBtn =(Button) findViewById(R.id.login_btn);



    loginBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(userInput.getText().toString().equals("rohan") &&
                    userPassword.getText().toString().equals("rohan")){
                Toast.makeText(getApplicationContext(),
                        "Redirecting....",Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(),
                        "Wrong Credential",Toast.LENGTH_SHORT).show();
            }

        }
    });

    }
}