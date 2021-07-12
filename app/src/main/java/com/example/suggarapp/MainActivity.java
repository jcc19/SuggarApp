package com.example.suggarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user, pass;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.txtUser);
        pass = (EditText) findViewById(R.id.txtPass);
        btn = (Button) findViewById(R.id.btnInicio);
    }
    public void aceder (View view){
        if (user.getText().toString().equals("ricardo") && pass.getText().toString().equals("hakunamatata")){
            Intent intent = new Intent(getApplicationContext(), central.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "ingrese 8 caracteres", Toast.LENGTH_LONG).show();
        }
    }
}