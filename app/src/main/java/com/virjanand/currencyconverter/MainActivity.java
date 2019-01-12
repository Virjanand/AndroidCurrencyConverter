package com.virjanand.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertAmountToDollars(View view) {
        double exchangeRate = 1.29;

        EditText amountText = (EditText) findViewById(R.id.amountEditNumberDecimal);
        double amountInPounds = Double.parseDouble(amountText.getText().toString());

        double amountInDollars = exchangeRate * amountInPounds;

        Toast.makeText(getApplicationContext(),
                "$ " + String.format("%.2f",amountInDollars),
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
