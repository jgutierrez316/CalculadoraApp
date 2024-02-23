package com.jhongu.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button butt_sumar;
    private Button butt_restar;
    private Button butt_division;
    private Button butt_multiplicacion;

    private TextView txt_resultado;
    private EditText edit_numero1;
    private EditText edit_numero2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txt_resultado = findViewById(R.id.resultado);
        edit_numero1 = findViewById(R.id.numero1);
        edit_numero2 = findViewById(R.id.numero2);



        butt_sumar = findViewById(R.id.btn_sumar);
        butt_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_resultado.setText( sumar(Integer.parseInt(edit_numero1.getText().toString()),Integer.parseInt(edit_numero2.getText().toString()) )+"");

            }
        });
        butt_restar = findViewById(R.id.btn_restar);
        butt_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_resultado.setText( restar(Integer.parseInt(edit_numero1.getText().toString()),Integer.parseInt(edit_numero2.getText().toString()) )+"");

            }
        });

        butt_division = findViewById(R.id.btn_division);
        butt_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_resultado.setText( division(Integer.parseInt(edit_numero1.getText().toString()),Integer.parseInt(edit_numero2.getText().toString()) )+"");

            }
        });
        butt_multiplicacion = findViewById(R.id.btn_multiplicacion);
        butt_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_resultado.setText( multiplicacion(Integer.parseInt(edit_numero1.getText().toString()),Integer.parseInt(edit_numero2.getText().toString()) )+"");
            }
        });


    }


    public int sumar (int a, int b){
        return a+b;
    }

    public int restar (int a, int b){
        return a-b;
}
    public double division (double a, double b){
        return a/b;
}
    public int multiplicacion (int a, int b){
        return a*b;
}
}