package _248_ArrayListMetodosmasImportantes.set;

import _248_ArrayListMetodosmasImportantes.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {

    public static void main(String[] args) {

        List<Alumno>al = new ArrayList<>();

        //add alumnos

        System.out.println(al +"Size "+ al.size());//0
        System.out.println("Esta vacia = " +al.isEmpty());//esta vacia (por ahora)

        al.add(new Alumno("Mite",10));
        al.add(new Alumno("Solano",8));
        al.add(0,new Alumno("Lady",0));//al poner el indice estos toman la posicion y los demas se desplazan
        al.add(1,new Alumno("Esthepanie",8));
        al.add(new Alumno("Andy",9));

        System.out.println("\n"+al +"Tamanio:  "+ al.size());//cuenta ya con elementos

        //eliminar
        //RECORDAR TENER EL METODO EQUALS IMPLEMENTADO AUTOMATICAMENTE EN LA OTRA CLASE
        System.out.println("ELIMINANDO...");

        al.remove(new Alumno("Mite",10));//elimina con objetos, debe ser identico, SI FUERA DIFERENTE NO LO CONSIDERA
        al.remove(0);//elimina por indice

        System.out.println("\n"+al +"Tamanio:  "+ al.size());


    }//main
}//class
