package _97_IteraArregloOdenDescendente;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForDescendente {

    public static void main(String[] args) {

        // Declaración e inicialización de un arreglo de enteros con capacidad para 5 elementos
        //int [] enteros = new int[5];
        //String[] productos = new String[5];

//        // Asignación del valor elemento del arreglo
//        enteros[0] = 11;
//        enteros[1] = Integer.valueOf("20"); // Convierte la cadena "2" en un valor entero y lo asigna al segundo elemento del arreglo
//        enteros[2] = 32;
//        enteros[3] = 24;
//        enteros[4] = 5;

//        productos[0] = "telefono";
//        productos[1] = "tablet";
//        productos[2] = "laptop";
//        productos[3] = "computadora";
//        productos[4] = "celular";


        String[] productos = {"telefono","table","laptop","cpmputadora","celular"};

        Arrays.sort(productos);

        System.out.println("\nImprimir con for");
        System.out.println("\nIterando orden normal");
        int totalString = productos.length; // Obtiene la longitud del arreglo productos
        for (int i = 0; i < totalString; i++) { // Itera sobre los elementos del arreglo utilizando un bucle for
            System.out.println("Indice " + i + ": " + productos[i]); // Imprime el índice y el valor del elemento actual del arreglo
        }

        System.out.println("\nIterando orden inverso");
        for (int i = 0; i < totalString; i++) {
            System.out.println("Indice " + (totalString-1-i) + ": " + productos[totalString-1-i]);
        }

        System.out.println("\nIterando orden inverso 2");
        for (int i = totalString-1; i >= 0; i--) {
            System.out.println("Indice " + (i) + ": " + productos[i]);
        }

        System.out.println("\nIterando orden inverso 3");
        // Utiliza Arrays.sort() con un Comparator para ordenar en orden descendente
        Arrays.sort(productos, Collections.reverseOrder());

        // Imprime los elementos del arreglo en orden descendente
        for (String producto : productos) {
            System.out.println(producto);
        }

    }
}
