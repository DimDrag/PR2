package com.example.pr2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Instrumentation;
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
    boolean dark_theme;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dark_theme = false;
        intent = new Intent(this, Profile.class);
        startup_logo = (ImageView) findViewById(R.id.image_view);
        enter_system_btn = (Button) findViewById(R.id.button);
        startup_page_text_view = (TextView) findViewById(R.id.text_view);
        login_edit_text = (EditText) findViewById(R.id.login_edit_text);
        enter_system_btn.setOnClickListener(view -> {
            String login = login_edit_text.getText().toString().split("@")[0];
            intent.putExtra("login", login);
            intent.putExtra("dark_theme_on", dark_theme);
            mStartForResult.launch(intent);
        });
    }
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                Intent res_intent = result.getData();
                Bundle args = res_intent.getExtras();
                if ((boolean) args.get("dark_theme_on")) {
                    startup_logo.setImageResource(R.drawable.s21_vector_logo);
                    dark_theme = true;
                } else {
                    startup_logo.setImageResource(R.drawable.s21_logo);
                    dark_theme = false;
                }
            }
    );
}