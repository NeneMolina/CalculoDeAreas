package com.julianmolina.myappcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sideOne, sideTwo, sideThree;
    RadioButton triangulo, cuadrado;
    TextView resultado;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //variables
        sideOne = findViewById(R.id.ladoUno);
        sideTwo = findViewById(R.id.ladoDos);
        sideThree = findViewById(R.id.ladoTres);
        triangulo = findViewById(R.id.triangulo);
        cuadrado = findViewById(R.id.cuadrado);
        resultado = findViewById(R.id.resultado);
        calcular = findViewById(R.id.Calcular);
    }

    public void Calcular(View view){
        if (!sideOne.getText().toString().isEmpty() && !sideTwo.getText().toString().isEmpty() && !sideThree.getText().toString().isEmpty()){
            float ladoUno = Float.parseFloat(sideOne.getText().toString());
            float ladoDos = Float.parseFloat(sideTwo.getText().toString());

            if (triangulo.isChecked()){

                String Area = String.valueOf(ladoUno * ladoDos / 2);
                resultado.setText(Area);

            }else if(cuadrado.isChecked()){

                String Area = String.valueOf(ladoDos * ladoDos);
                resultado.setText(Area);
            }

        }
    }

    public void isCheekCuadro(View view){
        triangulo.setChecked(false);
    }

    public void isCheektriangulo(View view){
        cuadrado.setChecked(false);
    }
}