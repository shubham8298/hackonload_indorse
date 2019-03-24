package com.example.vijaythakur.eguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submit;
    private Button submitt;
    private EditText Name;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.textView);
        password = findViewById(R.id.textView2);
        submit = findViewById(R.id.button);
        submitt = findViewById(R.id.button2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitbtn(Name.getText().toString(), password.getText().toString());
            }
        });
        submitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();
            }
        });
    }

    private void submitbtn(String username, String userPassword) {
        if ((username.equals("Admin") && userPassword.equals("1234")) || (username.equals("Employee1") && userPassword.equals("5678")) || (username.equals("Employee2") && userPassword.equals("9012") || (username.equals("Employee3") && userPassword.equals("3456")))) {
            Intent i = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "INVALID USER", Toast.LENGTH_LONG).show();
        }
    }
    public void openactivity() {
        Toast.makeText(this, "Paasword send to your email", Toast.LENGTH_LONG).show();
    }
}


