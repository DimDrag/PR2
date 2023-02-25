package com.example.pr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pr2.R;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    TextView startup_page_text_view;
    Button enter_system_btn;
    ImageView startup_logo;
    EditText login_edit_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startup_logo = (ImageView) findViewById(R.id.image_view);
        enter_system_btn = (Button) findViewById(R.id.button);
        startup_page_text_view = (TextView) findViewById(R.id.text_view);
        login_edit_text = (EditText) findViewById(R.id.login_edit_text);
        enter_system_btn.setOnClickListener(view -> {
//            startup_page_text_view.setText(R.string.system_in_page_text);
//            startup_logo.setImageResource(R.drawable.s21_vector_logo);
            Intent intent = new Intent(this, Profile.class);

            String login = login_edit_text.getText().toString().split("@")[0];
            intent.putExtra("login", login);
            startActivity(intent);
        });
    }
}