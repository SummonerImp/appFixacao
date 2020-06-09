package com.example.appfixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTel, btnBusca, btnEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTel = (Button)findViewById(R.id.btnTel);
        btnBusca =(Button)findViewById(R.id.btnBusca);
        btnEmail = (Button)findViewById(R.id.btnEmail);
    }

    public void Tel(View v){
        Intent it = new Intent(this, Tel.class);
        startActivity(it);
    }

    public void Busca(View v){
        Intent it = new Intent(this, Busca.class);
        startActivity(it);
    }

    public void Email(View v){
        Intent it = new Intent(this, Email.class);
        startActivity(it);
    }
}