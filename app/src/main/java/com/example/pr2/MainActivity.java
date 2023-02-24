package com.example.pr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pr2.R;


public class MainActivity extends AppCompatActivity {

    TextView startup_page_text_view;
    Button enter_system_btn;
    ImageView startup_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startup_logo = (ImageView) findViewById(R.id.image_view);
        enter_system_btn = (Button) findViewById(R.id.button);
        startup_page_text_view = (TextView) findViewById(R.id.text_view);

        enter_system_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startup_page_text_view.setText(R.string.system_in_page_text);
                startup_logo.setImageResource(R.drawable.s21_vector_logo);
            }
        });
    }
}