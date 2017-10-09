package com.rosalvavenegas.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mCampoConteo;
    Button mBotonConteo;
    Button mBotonReiniciar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCampoConteo = (EditText) findViewById(R.id.campo_conteo);
        mBotonConteo = (Button) findViewById(R.id.boton_contar);
        mBotonReiniciar = (Button) findViewById(R.id.boton_reiniciar);

        mBotonConteo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = mCampoConteo.getText().toString();
                int contador = Integer.parseInt(s);
                contador++;
                String contadorTotal = Integer.toString(contador);
                mCampoConteo.setText(contadorTotal);
            }
        });

        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mCampoConteo.setText("0");

            }

        });

    }
}

