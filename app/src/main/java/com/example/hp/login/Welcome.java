package com.example.hp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView tvusername=(TextView)findViewById(R.id.TVUname);
        String username=getIntent().getStringExtra("Username");
        tvusername.setText(username);
    }
}
