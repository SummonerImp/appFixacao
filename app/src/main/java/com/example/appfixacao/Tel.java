package com.example.appfixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tel extends AppCompatActivity {
    Button btnLigar;
    EditText txtNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel);
        btnLigar = (Button)findViewById(R.id.btnLigar);
        txtNum = (EditText)findViewById(R.id.txtNum);
    }

    public void Ligar(View v){
        Uri uri = Uri.parse("tel:"+txtNum.getText().toString());
        Intent it = new Intent(Intent. ACTION_DIAL , uri);
        startActivity(it);
    }
}