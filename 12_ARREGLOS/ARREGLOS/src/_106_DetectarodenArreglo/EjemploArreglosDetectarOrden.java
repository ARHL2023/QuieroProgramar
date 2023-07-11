package _106_DetectarodenArreglo;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7]; // Crear el arreglo "a" con capacidad para 7 elementos

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 números:");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt(); // Solicitar al usuario que ingrese los números y almacenarlos en el arreglo "a"
        }

        boolean ascendente = false; // Bandera para indicar si el arreglo está ordenado de forma ascendente
        boolean descendente = false; // Bandera para indicar si el arreglo está ordenado de forma descendente

        // Verificar el orden de los elementos en el arreglo
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i+1]){
                descendente = true; // Existe un elemento mayor seguido de un elemento menor, indicando un orden descendente
            }
            if(a[i] < a[i+1]){
                ascendente = true; // Existe un elemento menor seguido de un elemento mayor, indicando un orden ascendente
            }
        }

        // Determinar el tipo de orden del arreglo y mostrar el resultado
        if(ascendente == true && descendente == true){
            System.out.println("Arreglo = desordenado");
        }
        if(ascendente == false && descendente == false){
            System.out.println("Arreglo = todos son iguales");
        }
        if(ascendente == true && descendente == false){
            System.out.println("Arreglo = ordenado de forma ascendente");
        }
        if(ascendente == false && descendente == true){
            System.out.println("Arreglo = ordenado de forma descendente");
        }
    }
}
