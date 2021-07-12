package com.example.suggarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principal extends AppCompatActivity {
    private Button btnIniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);
    }
    public void iniciar (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}