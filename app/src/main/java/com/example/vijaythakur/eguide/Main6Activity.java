package com.example.vijaythakur.eguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {
    private Button b15;
    private Button b17;
    private Button b18;
    private Button b19;
    private Button b20;
    private Button b21;
    private Button b22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b15 = (Button) findViewById(R.id.button10);
        b17 = (Button) findViewById(R.id.button12);
        b18 = (Button) findViewById(R.id.button13);
        b19 = (Button) findViewById(R.id.button14);
        b20 = (Button) findViewById(R.id.button15);
        b21 = (Button) findViewById(R.id.button22);
        b22 = (Button) findViewById(R.id.button23);

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spactivity();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sractivity();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ssactivity();
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stactivity();
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suactivity();
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svactivity();
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swactivity();
            }
        });
    }
    public void spactivity() {
        Intent ia15 = new Intent(Main6Activity.this,Main17Activity.class);
        startActivity(ia15);
    }
    public void sractivity() {
        Intent ia17 = new Intent(Main6Activity.this,Main19Activity.class);
        startActivity(ia17);
    }
    public void ssactivity() {
        Intent ia18 = new Intent(Main6Activity.this,Main20Activity.class);
        startActivity(ia18);
    }
    public void stactivity() {
        Intent ia19 = new Intent(Main6Activity.this,Main21Activity.class);
        startActivity(ia19);
    }
    public void suactivity() {
        Intent ia20 = new Intent(Main6Activity.this,Main22Activity.class);
        startActivity(ia20);
    }
    public void svactivity() {
        Intent ia21 = new Intent(Main6Activity.this,Main23Activity.class);
        startActivity(ia21);
    }
    public void swactivity() {
        Intent ia22 = new Intent(Main6Activity.this,Main24Activity.class);
        startActivity(ia22);
    }
}
