package _244_TreeSetComparableyComparator.set;

import _244_TreeSetComparableyComparator.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreesetComparable {

    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>(Comparator.reverseOrder());//IMPRIME REVERSO CON EL ARGUMENTO

        //add alumnos
        sa.add(new Alumno("Mite",10));
        sa.add(new Alumno("Solano",8));
        sa.add(new Alumno("Lady",0));
        sa.add(new Alumno("Esthepanie",8));
        sa.add(new Alumno("Andy",9));

        //IMPRIME
        System.out.println(sa);

    }//main
}//class
