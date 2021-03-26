package com.example.aula3dispositivosmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void layout1Click(View view) {

        startActivity(new Intent(this, TelaLayout1.class));
    }

    public void layout2Click(View view) {
        startActivity(new Intent(this, TelaLayout2.class));
    }

    public void layout3Click(View view) {
        startActivity(new Intent(this, TelaLayout3.class));
    }

    public void layout4Click(View view) {
        startActivity(new Intent(this, TelaLayout4.class));
    }
}