package com.example.aplicativo;

import android.widget.EditText;

import java.io.Serializable;

public class Usuario implements Serializable {

    public String nombre;
    public String apellido;
    public int edad;
    public double estatura;
    public double peso;
    public double dinero;

    public Usuario(String nombre,String apellido,int edad,double estatura,double peso,double dinero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.dinero = dinero;
    }

    public Usuario(){

    }
    public String getnombre() {return nombre;}
    public void setnombre( String nombre ){this.nombre = nombre;}

    public String getapellido() {return apellido;}
    public void setapellido( String apellido) {this.apellido = apellido;}

    public int getedad() {return edad;}
    public void setedad( int edad) {this.edad = edad;}

    public double getestatura() {return estatura;}
    public void setestatura( double estatura) {this.estatura = estatura;}

    public double getpeso() {return peso;}
    public void setpeso( int peso) {this.peso = peso;}

    public double getdinero() {return dinero;}
    public void setdinero( double dineroPersona) {this.dinero = dineroPersona;}

}
