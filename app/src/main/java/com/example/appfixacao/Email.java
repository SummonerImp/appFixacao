package com.example.appfixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Email extends AppCompatActivity {
    Button btnSend;
    EditText txtEmail, txtSubject, txtBody;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        btnSend = (Button)findViewById(R.id.btnSend);
        txtEmail = (EditText)findViewById(R.id.txtEmail);
        txtSubject = (EditText)findViewById(R.id.txtAssunto);
        txtBody = (EditText) findViewById(R.id.txtBody);
    }

    public void Enviar(View v) throws UnsupportedEncodingException {
        String uriEmail = "mailto:"+txtEmail.getText().toString()+
                "?subject="+ URLEncoder.encode(txtSubject.getText().toString(), "utf-8") +
                "&body=" + URLEncoder.encode(txtBody.getText().toString(), "utf-8");
        Uri uri = Uri.parse(uriEmail);
        Intent it = new Intent(Intent.ACTION_SENDTO);
        it.setData(uri);
        startActivity(Intent.createChooser(it, "Enviar Email"));
    }
}