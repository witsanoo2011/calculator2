package com.example.destinypc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click (View v){
        EditText edt = (EditText)findViewById(R.id.num1);
        if(!edt.getText().toString().matches("")){
            String num1 = edt.getText().toString();

            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("num1", num1);
            startActivityForResult(intent,2);
        }
    }
    @Override
    protected void  onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode,data);
        if(requestCode==2)
        {
            String message=data.getStringExtra("num3");

            TextView tv = (TextView)findViewById(R.id.txt1);
            tv.setText(message);
        }
    }



}
