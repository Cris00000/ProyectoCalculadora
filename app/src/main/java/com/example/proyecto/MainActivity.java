package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int calculador = 0;
    String tipo = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView operacion = (TextView) findViewById(R.id.operacion);
        TextView mostrar = (TextView) findViewById(R.id.mostrar);
        operacion.setText("0");

        Button numero1 = (Button) findViewById(R.id.numero1);
        Button numero2 = (Button) findViewById(R.id.numero2);
        Button numero3 = (Button) findViewById(R.id.numero3);
        Button numero4 = (Button) findViewById(R.id.numero4);
        Button numero5 = (Button) findViewById(R.id.numero5);
        Button numero6 = (Button) findViewById(R.id.numero6);
        Button numero7 = (Button) findViewById(R.id.numero7);
        Button numero8 = (Button) findViewById(R.id.numero8);
        Button numero9 = (Button) findViewById(R.id.numero9);
        Button numero0 = (Button) findViewById(R.id.numero0);
        Button suma = (Button) findViewById(R.id.suma);
        Button resta = (Button) findViewById(R.id.resta);
        Button multiplica = (Button) findViewById(R.id.multiplica);
        Button divide = (Button) findViewById(R.id.divide);
        Button igual = (Button) findViewById(R.id.igual);


        numero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("1");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"1");
                }
            }
        });
        numero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("2");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"2");
                }
            }
        });
        numero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("3");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"3");
                }
            }
        });
        numero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("4");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"4");
                }
            }
        });
        numero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("5");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"5");
                }
            }
        });
        numero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("6");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"6");
                }
            }
        });
        numero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("7");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"7");
                }
            }
        });
        numero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("8");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"8");
                }
            }
        });
        numero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("9");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"9");
                }
            }
        });
        numero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calculador==Integer.parseInt((String)operacion.getText())){
                    calculador=0;
                    operacion.setText("0");
                    tipo="";
                } else {
                    operacion.setText(operacion.getText()+"0");
                }
            }
        });

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tipo=="+"){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                } else if(tipo==""){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                }else if(tipo=="-"){
                    calculador = calculador - Integer.parseInt((String)operacion.getText());
                }else if(tipo=="*"){
                    calculador = calculador * Integer.parseInt((String)operacion.getText());
                }else if(tipo=="/"){
                    calculador = calculador / Integer.parseInt((String)operacion.getText());
                }
                tipo = "+";
                operacion.setText("0");
                mostrar.setText(String.valueOf(calculador));
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tipo=="+"){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                } else if(tipo==""){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                }else if(tipo=="-"){
                    calculador = calculador - Integer.parseInt((String)operacion.getText());
                }else if(tipo=="*"){
                    calculador = calculador * Integer.parseInt((String)operacion.getText());
                }else if(tipo=="/"){
                    calculador = calculador / Integer.parseInt((String)operacion.getText());
                }
                tipo = "-";
                operacion.setText("0");
                mostrar.setText(String.valueOf(calculador));
            }
        });
        multiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tipo=="+"){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                } else if(tipo==""){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                }else if(tipo=="-"){
                    calculador = calculador - Integer.parseInt((String)operacion.getText());
                }else if(tipo=="*"){
                    calculador = calculador * Integer.parseInt((String)operacion.getText());
                }else if(tipo=="/"){
                    calculador = calculador / Integer.parseInt((String)operacion.getText());
                }
                tipo = "*";
                operacion.setText("0");
                mostrar.setText(String.valueOf(calculador));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tipo=="+"){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                } else if(tipo==""){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                }else if(tipo=="-"){
                    calculador = calculador - Integer.parseInt((String)operacion.getText());
                }else if(tipo=="*"){
                    calculador = calculador * Integer.parseInt((String)operacion.getText());
                }else if(tipo=="/"){
                    calculador = calculador / Integer.parseInt((String)operacion.getText());
                }
                tipo = "/";
                operacion.setText("0");
                mostrar.setText(String.valueOf(calculador));

            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tipo=="+"){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                } else if(tipo==""){
                    calculador = calculador + Integer.parseInt((String)operacion.getText());
                }else if(tipo=="-"){
                    calculador = calculador - Integer.parseInt((String)operacion.getText());
                }else if(tipo=="*"){
                    calculador = calculador * Integer.parseInt((String)operacion.getText());
                }else if(tipo=="/"){
                    calculador = calculador / Integer.parseInt((String)operacion.getText());
                }
                tipo="=";
                String resultadito = String.valueOf(calculador);
                operacion.setText(resultadito);
                mostrar.setText(String.valueOf(calculador));
            }
        });



    }
}