package com.example.appchap3tickets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    double ticketCost=8.00 ;
    int numbertickets;
    double totCost;
    String groupchoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tickets= (EditText)findViewById(R.id.selectPrice);
        final Spinner group =(Spinner)findViewById(R.id.spinner);
        Button cost =(Button) findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView result = (TextView) findViewById(R.id.result);
                numbertickets= Integer.parseInt(tickets.getText().toString());
                totCost=numbertickets*ticketCost;
                DecimalFormat currency= new DecimalFormat("$ ###,###.###");
                groupchoice= group.getSelectedItem().toString();
                result.setText(" The Cost for the "+ groupchoice + " concert is "+ currency.format(totCost));
            }
        });

    }
}