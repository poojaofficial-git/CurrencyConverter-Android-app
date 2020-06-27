package com.pooja.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction (View view) {
        EditText myAmountText = (EditText) findViewById(R.id.myAmountText);

        Double dollarAmountDouble = Double.parseDouble(myAmountText.getText().toString());
        Double rupeeAmount=dollarAmountDouble *69.83;
        Toast.makeText(this, "Indian Rs." + rupeeAmount.toString(), Toast.LENGTH_LONG).show();

        Log.i("Info",myAmountText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
