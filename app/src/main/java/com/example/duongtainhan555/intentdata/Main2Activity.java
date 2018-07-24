package com.example.duongtainhan555.intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        if(intent!=null)
        {
            String chuoi = intent.getStringExtra("String");
            Toast.makeText(this,chuoi,Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"No value in ",Toast.LENGTH_SHORT).show();
        }
    }
}
