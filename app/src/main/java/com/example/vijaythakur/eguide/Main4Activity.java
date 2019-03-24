package com.example.vijaythakur.eguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b5 = (Button) findViewById(R.id.button3);
        b6 = (Button) findViewById(R.id.button4);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sfactivity();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sgactivity();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shactivity();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siactivity();
            }
        });
    }
    public void sfactivity() {
        Intent ia5 = new Intent(Main4Activity.this,Main7Activity.class);
        startActivity(ia5);
    }
    public void sgactivity() {
        Intent ia6 = new Intent(Main4Activity.this,Main8Activity.class);
        startActivity(ia6);
    }
    public void shactivity() {
        Intent ia7 = new Intent(Main4Activity.this,Main9Activity.class);
        startActivity(ia7);
    }
    public void siactivity() {
        Intent ia8 = new Intent(Main4Activity.this,Main10Activity.class);
        startActivity(ia8);
    }
}
