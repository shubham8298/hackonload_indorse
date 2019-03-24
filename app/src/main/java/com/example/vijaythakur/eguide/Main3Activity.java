package com.example.vijaythakur.eguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
private Button b3;
private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b3 = (Button) findViewById(R.id.button5);
        b4 = (Button) findViewById(R.id.button6);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sdactivity();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seactivity();
            }
        });
    }
    public void sdactivity() {
        Intent ia3 = new Intent(Main3Activity.this,Main5Activity.class);
        startActivity(ia3);
    }
    public void seactivity() {
        Intent ia4 = new Intent(Main3Activity.this,Main6Activity.class);
        startActivity(ia4);
    }
}
