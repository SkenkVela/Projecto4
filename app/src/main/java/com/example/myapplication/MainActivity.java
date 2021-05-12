package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText date1, date2;
    Button btn_calcular;
    TextView lbl_idade, lbl_idade_futura;
    final int nascimento = 0;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date1 = findViewById(R.id.txt_data_nascimento);
        date2 = findViewById(R.id.txt_ano_actual);
        btn_calcular = findViewById(R.id.btn_calcular);
        lbl_idade_futura = findViewById(R.id.lbl_idade_futura);
        lbl_idade = findViewById(R.id.lbl_idade_actual);
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int anoNascimento = Integer.parseInt(date1.getText().toString());
                int anoActual = Integer.parseInt(date2.getText().toString());

                int idadeActual = anoActual - anoNascimento;
                int idadeFutura = 2050 - anoNascimento;
                lbl_idade.setText(idadeActual);
                lbl_idade_futura.setText(idadeFutura);
            }
        });


    }
}