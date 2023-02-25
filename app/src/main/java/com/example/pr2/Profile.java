package com.example.pr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    TextView hello_text_view;
    Switch dark_theme_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        hello_text_view = (TextView) findViewById(R.id.hello_text_view);
        dark_theme_switch = (Switch) findViewById(R.id.dark_theme_switch);
        Bundle arguments = getIntent().getExtras();
        String login = arguments.get("login").toString();
        hello_text_view.setText("Привет, " + login + "!");

        dark_theme_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "YAS", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}