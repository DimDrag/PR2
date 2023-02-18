package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        Log.i(TAG, "info");
        Log.v(TAG, "verbose");
        Log.w(TAG, "warning");
        try {
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение в методе onResume", exception);
        }

        Toast.makeText(getApplicationContext(), "onCreate!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Log.i(TAG, "info");
        Log.v(TAG, "verbose");
        Log.w(TAG, "warning");
        try {
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение в методе onResume", exception);
        }

        Toast.makeText(getApplicationContext(), "onStart!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Log.i(TAG, "info");
        Log.v(TAG, "verbose");
        Log.w(TAG, "warning");
        try {
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение в методе onResume", exception);
        }

        Toast.makeText(getApplicationContext(), "onStop!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Log.i(TAG, "info");
        Log.v(TAG, "verbose");
        Log.w(TAG, "warning");
        try {
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение в методе onResume", exception);
        }

        Toast.makeText(getApplicationContext(), "onDestroy!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Log.i(TAG, "info");
        Log.v(TAG, "verbose");
        Log.w(TAG, "warning");
        try {
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение в методе onResume", exception);
        }

        Toast.makeText(getApplicationContext(), "onPause!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Log.i(TAG, "info");
        Log.v(TAG, "verbose");
        Log.w(TAG, "warning");
        try {
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение в методе onResume", exception);
        }
        Log.wtf(TAG, "WTF");

        Toast.makeText(getApplicationContext(), "onResume!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "onRestart!", Toast.LENGTH_SHORT).show();
    }
}