package com.example.proba1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proba1.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEur;
    private EditText editTextKursEur;
    private EditText editTextDol;
    private EditText editTextKursDol;
    private TextView textViewIznosDin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEur = findViewById(R.id.editTextTextPersonName);
        editTextKursEur = findViewById(R.id.editTextTextPersonName1);
        editTextDol = findViewById(R.id.editTextTextPersonName2);
        editTextKursDol = findViewById(R.id.editTextTextPersonName3);
        textViewIznosDin = findViewById(R.id.textView6);

        Button buttonKonvertujEur = findViewById(R.id.button);
        buttonKonvertujEur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double iznosEur = Double.parseDouble(editTextEur.getText().toString());
                    double kursEur = Double.parseDouble(editTextKursEur.getText().toString());
                    double iznosDin = iznosEur * kursEur;
                    textViewIznosDin.setText(String.format("%.2f", iznosDin));
                } catch (NumberFormatException e) {
                    textViewIznosDin.setText("Niste uneli ispravan broj.");
                }
            }
        });

        Button buttonKonvertujDol = findViewById(R.id.button2);
        buttonKonvertujDol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double iznosDol = Double.parseDouble(editTextDol.getText().toString());
                    double kursDol = Double.parseDouble(editTextKursDol.getText().toString());
                    double iznosDin = iznosDol * kursDol;
                    textViewIznosDin.setText(String.format("%.2f", iznosDin));
                } catch (NumberFormatException e) {
                    textViewIznosDin.setText("Niste uneli ispravan broj.");
                }
            }
        });
    }
}
