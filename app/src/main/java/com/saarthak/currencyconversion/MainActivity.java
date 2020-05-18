package com.saarthak.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void rupeeToDollar(View view){
        EditText r =(EditText)findViewById(R.id.editText5);
        String rup = r.getText().toString();
        Double rupee = Double.parseDouble(rup);
        Double dollar = 0.013*rupee;
        Toast.makeText(this, dollar+ " $", Toast.LENGTH_SHORT).show();
    }
    public void dollarToRupee(View view)
    {
        EditText d =(EditText)findViewById(R.id.editText6);
        String dol = d.getText().toString();
        double dollar = Double.parseDouble(dol);
        double rupee = 76.17* dollar;
        Toast.makeText(this, rupee+ " Rs.", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
