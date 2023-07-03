package _247_Ejemplo;

import java.util.*;

public class EjemploListComparableComparator {

    public static void main(String[] args) {

        List<_247_Ejemplo.Alumno>sa = new ArrayList<>();

        //add alumnos
        sa.add(new _247_Ejemplo.Alumno("Mite",10));
        sa.add(new _247_Ejemplo.Alumno("Solano",8));
        sa.add(new _247_Ejemplo.Alumno("Lady",0));
        sa.add(new _247_Ejemplo.Alumno("Esthepanie",8));
        sa.add(new _247_Ejemplo.Alumno("Andy",9));


        //ORDENANDO
        Collections.sort(sa,Comparator.reverseOrder());//EN LIST SE PASA EL ORDEN REVERSO

        //IMPRIME
        System.out.println(sa);

        System.out.println("\nIterando usando stream foreach (lamda)");
        sa.forEach(System.out::println);


    }//main
}//class
