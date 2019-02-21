package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etuser, etpassword;
    TextView tview1, tvmsg;
    Button btnlogin, btncancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etpassword = findViewById(R.id.etpassword);
        etuser = findViewById(R.id.etuser);
        tview1 = findViewById(R.id.tview1);
        tvmsg = findViewById(R.id.tvmsg);
        btncancel = findViewById(R.id.btncancel);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username =etuser.getText().toString();
            Intent intent = new Intent(MainActivity.this,Second_activity.class);
            intent.putExtra("Name",username);
            startActivity(intent);
            }
        });
    }
}
