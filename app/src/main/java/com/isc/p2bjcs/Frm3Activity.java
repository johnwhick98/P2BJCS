package com.isc.p2bjcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm3);
    }
    public void pantalla1(View v){
        Intent Frmini=new Intent(this, MainActivity.class);
        startActivity(Frmini);
        finish();

    }
}
