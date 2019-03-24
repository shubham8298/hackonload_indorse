package com.example.vijaythakur.eguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
private Button bt1;
private Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt1 = (Button) findViewById(R.id.b1);
        bt2 = (Button) findViewById(R.id.b2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sactivity();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbactivity();
            }
        });
    }
    public void sactivity() {
        Intent i1 = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(i1);
    }
    public void sbactivity() {
        Intent i2 = new Intent (Main2Activity.this,Main4Activity.class);
        startActivity(i2);
    }
}
