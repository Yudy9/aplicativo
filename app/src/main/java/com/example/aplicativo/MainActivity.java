package com.example.aplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private EditText edad;
    private EditText estatura;
    private EditText peso;
    private EditText dinero;
    private Button boton_enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre = (EditText) findViewById(R.id.nombre);
        apellido = (EditText) findViewById(R.id.apellido);
        edad = (EditText) findViewById(R.id.edad);
        estatura = (EditText) findViewById(R.id.estatura);
        peso = (EditText) findViewById(R.id.peso);
        dinero = (EditText) findViewById(R.id.dinero);
        boton_enviar = (Button) findViewById(R.id.boton_enviar);

        boton_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validacion()){
                    String nombrep = nombre.getText().toString();
                    String apellidop = apellido.getText().toString();
                    int edadp = Integer.parseInt(edad.getText().toString());
                    double estaturap= Double.parseDouble(estatura.getText().toString());
                    double pesop= Double.parseDouble(peso.getText().toString());
                    double dinerop = Double.parseDouble(dinero.getText().toString());

                    Usuario usu = new Usuario(nombrep,apellidop ,edadp ,estaturap,pesop,dinerop);

                    Intent miIntent = new Intent (MainActivity.this,Activity_2.class);

                    Bundle bundle = new Bundle();
                    bundle.putSerializable("Usuario",usu);

                    miIntent.putExtras(bundle);
                    startActivity(miIntent);
                }
            }
        });
    }
    public boolean validacion() {
        boolean result = true;

        String valor = nombre.getText().toString();
        String valor1 = apellido.getText().toString();
        String valor2 = edad.getText().toString();
        String valor3 = estatura.getText().toString();
        String valor4 = peso.getText().toString();
        String valor5 = dinero.getText().toString();

        if(valor.isEmpty()){
            nombre.setError("Tiene que completar el campo vacio");
            result = false;
        }
        if(valor1.isEmpty()){
            apellido.setError("Tiene que completar el campo vacio");
            result = false;
        }
        if(valor2.isEmpty()){
            edad.setError("Tiene que completar el campo vacio");
            result = false;
        }
        if(valor3.isEmpty()){
            estatura.setError("Tiene que completar el campo vacio");
            result = false;
        }
        if(valor4.isEmpty()){
            peso.setError("Tiene que completar el campo vacio");
            result = false;
        }
        if(valor5.isEmpty()){
            dinero.setError("Tiene que completar el campo vacio");
            result = false;
        }
        return result;
    }

}
