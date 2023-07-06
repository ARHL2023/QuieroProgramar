package _96_IterandoArreglo;

import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        // Declaración e inicialización de un arreglo de enteros con capacidad para 5 elementos
        int [] enteros = new int[5];
        String[] productos = new String[5];

        // Asignación del valor elemento del arreglo
        enteros[0] = 11;
        enteros[1] = Integer.valueOf("20"); // Convierte la cadena "2" en un valor entero y lo asigna al segundo elemento del arreglo
        enteros[2] = 32;
        enteros[3] = 24;
        enteros[4] = 5;

        productos[0] = "telefono";
        productos[1] = "tablet";
        productos[2] = "laptop";
        productos[3] = "computadora";
        productos[4] = "celular";


        Arrays.sort(productos);

        System.out.println("\nImprimir con for");
        int totalString = productos.length; // Obtiene la longitud del arreglo productos
        for (int i = 0; i < totalString; i++) { // Itera sobre los elementos del arreglo utilizando un bucle for
            System.out.println("Indice " + i + ": " + productos[i]); // Imprime el índice y el valor del elemento actual del arreglo
        }

        System.out.println("\nImprimir con foreach");
        for (String p : productos) { // Itera sobre los elementos del arreglo utilizando un bucle for-each
            System.out.println(p); // Imprime el valor del elemento actual del arreglo
        }

        //IMPRIMER NUMEROS ENTEROS
        int totalEnteros = enteros.length;
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i * 3; // Asignación del valor al elemento del arreglo multiplicado por 3
            System.out.println(enteros[i]); // Imprime el valor del elemento actual del arreglo
        }

    }
}
