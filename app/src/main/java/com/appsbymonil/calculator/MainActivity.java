package com.appsbymonil.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button value7 , value8;
    TextView txt ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getId();
    }

    public void append7(View v){
        String n = txt.getText().toString();
        txt.append("7");

    }

    public void getId(){
        value7 = (Button)findViewById(R.id.v7);
        value8 = (Button)findViewById(R.id.v8);
        txt = (TextView)findViewById(R.id.view);
    }
    public void del(View v ){

    }
}
