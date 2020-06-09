package com.example.appfixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Busca extends AppCompatActivity {
    Button btnBuscar;
    EditText txtBusca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);
        btnBuscar = (Button)findViewById(R.id.btnPesq);
        txtBusca = (EditText)findViewById(R.id.txtBusca);
    }

    public void Buscar(View v){
        Intent it = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = txtBusca.getText().toString();
        it.putExtra(SearchManager.QUERY, query);
        startActivity(it);
    }
}