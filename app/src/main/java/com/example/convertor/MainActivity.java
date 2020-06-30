package com.example.convertor;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Miles to Km convertor Code
        Button buttonConvMilesToKm = (Button) findViewById(R.id.milesKmButton);
        Button buttonConvKmToMiles = (Button) findViewById(R.id.kmMilesButton);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Hello World Prabhakar Jha");
                EditText textBoxMiles = (EditText) findViewById(R.id.milesInput);
                EditText textBoxKm = (EditText) findViewById(R.id.kmInput);

                double milesValue = Double.valueOf(textBoxMiles.getText().toString());
                double kmValue = milesValue / 0.62137;
                System.out.println("kmValue " + kmValue);
                System.out.println("Arre main yahan hoon");

                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(kmValue));
//                textBoxKm.setText((int) kmValue);
            }
        });
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles = (EditText) findViewById(R.id.milesInput);
                EditText textBoxKm = (EditText) findViewById(R.id.kmInput);

                double kmValue = Double.valueOf(textBoxKm.getText().toString());
                double milesValue = kmValue * 0.62137;
                System.out.println("kmValue " + kmValue);

                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(milesValue));
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}