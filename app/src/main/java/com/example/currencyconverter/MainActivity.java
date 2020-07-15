package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    public void convertToRupee(View view) {

        EditText dollaramountEditText =(EditText) findViewById(R.id.dollaramountEditText);
        Double dollaramountDouble=Double.parseDouble(dollaramountEditText.getText().toString());
        Double rupee = dollaramountDouble * 71.89;
        Toast.makeText(MainActivity.this,"Rs."+String.format("%.2f",rupee),Toast.LENGTH_LONG).show();
        Log.i("amount", dollaramountEditText.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

}
