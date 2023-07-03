package _246_FormasLoopIteracionesCollectionSetList.set;

import _246_FormasLoopIteracionesCollectionSetList.modelo.Alumno;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreesetComparable {

    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>(Comparator.reverseOrder());//IMPRIME REVERSO CON EL ARGUMENTO
        //SI FURA LIST TAMBIEN FUNCIOAN LOS 3 ITERADORES, ADICIONAL ESTE SE PUEDE ITERAR CON EL FOR CLASICO

        //add alumnos
        sa.add(new Alumno("Mite",10));
        sa.add(new Alumno("Solano",8));
        sa.add(new Alumno("Lady",0));
        sa.add(new Alumno("Esthepanie",8));
        sa.add(new Alumno("Andy",9));

        //IMPRIME
        System.out.println(sa);

        //ITERANDO LOS SET

        //En este bucle, se utiliza la sintaxis del bucle foreach para recorrer todos los elementos del conjunto sa.
        // En cada iteración, se almacena un objeto Alumno en la variable a, y se imprime en la consola.
        System.out.println("\nIterando usando foreach");
        for (Alumno a: sa){
            System.out.println(a);
        }

        //En este bucle, se utiliza un bucle while junto con un objeto Iterator para iterar sobre los elementos del conjunto sa.
        // Primero, se obtiene un iterador llamando al método iterator() en el conjunto.
        // Luego, se utiliza el método hasNext() para verificar si hay más elementos en el conjunto.
        // Si es así, se avanza al siguiente elemento utilizando el método next().
        // En cada iteración, se almacena un objeto Alumno en la variable a y se imprime su nombre en la consola.
        System.out.println("\nIterando usando while e iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }


        //En este bucle, se utiliza la funcionalidad de streams de Java junto con una expresión lambda para iterar sobre los elementos del conjunto sa.
        // Se llama al método forEach() en el conjunto y se proporciona una expresión lambda que toma un objeto Alumno y lo imprime en la consola.
        // Esta forma de iteración es más compacta y concisa.
        System.out.println("\nIterando usando stream foreach (lamda)");
        sa.forEach( a->System.out.println(a.getNombre()));

    }//main
}//class
