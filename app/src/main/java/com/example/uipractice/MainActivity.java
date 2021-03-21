package com.example.uipractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.balysv.materialripple.MaterialRippleLayout;

public class MainActivity extends AppCompatActivity {

    MaterialRippleLayout registerMRL;
    MaterialRippleLayout loginMRL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginMRL=findViewById(R.id.login_mrl);
        loginMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "login", Toast.LENGTH_SHORT).show();
            }
        });
        registerMRL=findViewById(R.id.register_mrl);

        registerMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });
    }


}