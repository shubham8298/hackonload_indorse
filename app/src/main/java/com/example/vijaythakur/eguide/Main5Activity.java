package com.example.vijaythakur.eguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    private Button b9;
    private Button b12;
    private Button b13;
    private Button b14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b9 = (Button) findViewById(R.id.button16);
        b12 = (Button) findViewById(R.id.button19);
        b13 = (Button) findViewById(R.id.button20);
        b14 = (Button) findViewById(R.id.button21);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sjactivity();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smactivity();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snactivity();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soactivity();
            }
        });
    }
    public void sjactivity() {
        Intent ia9 = new Intent(Main5Activity.this,Main11Activity.class);
        startActivity(ia9);
    }

    public void smactivity() {
        Intent ia12 = new Intent(Main5Activity.this,Main14Activity.class);
        startActivity(ia12);
    }
    public void snactivity() {
        Intent ia13 = new Intent(Main5Activity.this,Main15Activity.class);
        startActivity(ia13);
    }
    public void soactivity() {
        Intent ia14 = new Intent(Main5Activity.this,Main16Activity.class);
        startActivity(ia14);
    }
}