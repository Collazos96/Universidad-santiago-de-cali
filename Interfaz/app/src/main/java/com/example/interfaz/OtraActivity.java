package com.example.interfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);

        TextView textView = (TextView) findViewById(R.id.textView);

        Intent intent=getIntent();

        textView.setText(intent.getStringExtra("nombre"));
    }
}