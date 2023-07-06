package _95_EjemploArregloStringAndOrdenarWithSort;

import java.util.Arrays;

public class EjemploArreglos {

    public static void main(String[] args) {

        // Declaración e inicialización de un arreglo de enteros con capacidad para 5 elementos
        int [] enteros = new int[5];
        String [] productos = new String[5];

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

        //ORDENA NUMEROS
        Arrays.sort(enteros);// Ordena los elementos del arreglo de enteros en orden ascendente

        // Imprime elemento del arreglo
        System.out.println(enteros[0]);
        System.out.println(enteros[1]);
        System.out.println(enteros[2]);
        System.out.println(enteros[3]);
        System.out.println(enteros[4]);

        //ORDENA STRING
        Arrays.sort(productos);//// Ordena los elementos del arreglo de productos en orden alfabético

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);

        //Obtener ultimo elmento del arreglo (NUMEROS)
        int ultimo = enteros[enteros.length-1];
        System.out.println("ultimo = " + ultimo);


    }
}
