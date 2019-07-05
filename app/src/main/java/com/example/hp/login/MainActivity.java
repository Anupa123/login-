package com.example.hp.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etuname,etpassword;
    Button btlogin,btregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etuname=(EditText) findViewById(R.id.ETuname);
        etpassword=(EditText) findViewById(R.id.ETPass);
        btlogin=(Button)findViewById(R.id.BTNLogin);
        btregister=(Button)findViewById(R.id.BTNRegister);
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String struname;
                struname=etuname.getText().toString();
                Intent intent=new Intent(MainActivity.this,Welcome.class);
                intent.putExtra("Username",struname);
                startActivity(intent);
            }
        });
    }
}
