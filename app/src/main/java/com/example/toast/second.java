package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class second extends AppCompatActivity {
TextView nb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i=getIntent();
        String n=i.getStringExtra("nombre");
        nb=(TextView)findViewById(R.id.nb);
        nb.setText(n);
    }
}