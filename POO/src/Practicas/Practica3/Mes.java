package Practicas.Practica3;

import java.util.Scanner;

public class Mes {

    //ATRIBUTOS
    private String nombre;
    private int numero;


    //CONSTRUCTORES

    public Mes() {
    }

    public Mes(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    //GET AND SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //METODOS
    public  String verMes(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: "+getNombre()+" -> "+getNumero());
        sb.append("\nNumero: "+getNumero());
        return sb.toString();
    }

}//CLASS
