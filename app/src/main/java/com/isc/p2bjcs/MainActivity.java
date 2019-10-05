package com.isc.p2bjcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnSig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSig=(Button) findViewById(R.id.button);

        btnSig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent frm2=new Intent(this, Frm2Activity.class);
        startActivity(frm2);
        finish();
    }
}
