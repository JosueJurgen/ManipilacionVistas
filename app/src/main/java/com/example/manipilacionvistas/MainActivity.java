package com.example.manipilacionvistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador=0;
        mostrarResultado();
    }

    public void incrementacontador(View view) {
        contador++;
        mostrarResultado();
    }

    public void reseteacontador(View view) {
        contador=0;
        mostrarResultado();
    }

    public void decrementacontador(View view) {
        contador--;
        mostrarResultado();
    }

    public void mostrarResultado(){
        TextView textoResultado = (TextView) findViewById(R.id.contadorPosiciones);
        textoResultado.setText("Contador : "+contador);
    }
}
