package _98_ModificandoArregloReverse;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosInversoMutable {

    public static void main(String[] args) {

        String[] productos = {"telefono","table","laptop","cpmputadora","celular"};

        Arrays.sort(productos);

        System.out.println("\nIterando orden normal");
        int totalString = productos.length; // Obtiene la longitud del arreglo productos
        for (int i = 0; i < totalString; i++) { // Itera sobre los elementos del arreglo utilizando un bucle for
            System.out.println("Indice " + i + ": " + productos[i]); // Imprime el índice y el valor del elemento actual del arreglo
        }

        System.out.println("\nIterando Inmutable");
//        for (int i = 0; i < totalString/2; i++) {
//            String actual = productos[i]; // Almacena el valor actual en una variable temporal
//            String inverso = productos[totalString-1-i]; // Almacena el valor inverso en otra variable temporal
//            productos[i] = inverso; // Asigna el valor inverso al elemento actual
//            productos[totalString-1-i] = actual; // Asigna el valor actual al elemento inverso
//        }

        //LO MISMO DE ARRIBA COMENTADO PERO USANDO METODOS
        Collections.reverse(Arrays.asList(productos)); // Invierte el orden de los elementos en el arreglo "productos"


        for (int i = 0; i < totalString; i++) { // Itera sobre los elementos del arreglo utilizando un bucle for
            System.out.println("Indice " + i + ": " + productos[i]); // Imprime el índice y el valor del elemento actual del arreglo
        }

    }
}
