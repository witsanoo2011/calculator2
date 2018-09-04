package com.example.destinypc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private EditText num2;
    private Button sum,lop,koon,div;
    private TextView txt1;
    int num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String data = intent.getStringExtra("num1").toString();
        num1 = Integer.parseInt(data);
    }
    public void sumClick(View v) {
        EditText edt = (EditText) findViewById(R.id.num2);
        if (!edt.getText().toString().matches("")) {
            int num2 = Integer.parseInt(edt.getText().toString());
            int num3 = num1 + num2;
            Intent intent = new Intent();
            intent.putExtra("num3", String.valueOf(num3));
            setResult(2, intent);
            finish();
        }
    }
        public void lopClick(View v){
            EditText edt = (EditText)findViewById(R.id.num2);
            if(!edt.getText().toString().matches("")) {
                int num2 = Integer.parseInt(edt.getText().toString());
                int num3 = num1 - num2;
                Intent intent = new Intent();
                intent.putExtra("num3", String.valueOf(num3));
                setResult(2, intent);
                finish();
            }
    }
    public void koonClick(View v){
        EditText edt = (EditText)findViewById(R.id.num2);
        if(!edt.getText().toString().matches("")) {
            int num2 = Integer.parseInt(edt.getText().toString());
            int num3 = num1*num2;
            Intent intent = new Intent();
            intent.putExtra("num3", String.valueOf(num3));
            setResult(2, intent);
            finish();
        }
    }
    public void divClick(View v){
        EditText edt = (EditText)findViewById(R.id.num2);
        if(!edt.getText().toString().matches("")) {
            double num2 = Double.parseDouble(edt.getText().toString());
            double num3 = num1/num2;
            Intent intent = new Intent();

            setResult(2, intent);
            if(num2==0){
                intent.putExtra("num3", "NO intput 0");
            }else intent.putExtra("num3", String.valueOf(num3));
            finish();
        }
    }
}
