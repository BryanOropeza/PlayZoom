package com.bryan.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnGetStarted;
    //private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //btnGetStarted = findViewById(R.id.btn_get_started);
        //btnGetStarted = setOnClickListener(v ->{
        //    Toast.makeText(this,"comenzar",Toast.LENGTH_LONG).show();
        //});
    }
}