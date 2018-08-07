package com.example.hp.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button login,map,singup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent sendlogin  = new Intent(MainActivity.this,login_activity.class);
        final Intent sendmap  = new Intent(MainActivity.this,MapsActivity.class);
        final Intent sendsingup  = new Intent(MainActivity.this,CreateNewAccount_activity.class);
        login = (Button)findViewById(R.id.login_page);
        map = (Button)findViewById(R.id.map_page);
        singup=(Button)findViewById(R.id.singup_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(sendlogin);
            }
        });

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(sendsingup);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(sendmap);
            }
        });
    }
}
