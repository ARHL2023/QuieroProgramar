/*
Enunciado: Agregar un elemento manteniendo el arreglo ordenado

Escriba un programa que solicite al usuario ingresar 6 números enteros y los almacene en un arreglo llamado 'a'.
Luego, solicite al usuario ingresar un nuevo número a insertar en el arreglo.
El programa debe insertar el nuevo número en la posición correcta de manera que el arreglo se mantenga
ordenado de forma ascendente. Finalmente, se debe imprimir el nuevo arreglo ordenado.

*/

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion;

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length - 1; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese un número a insertar:");
        numero = s.nextInt();

        posicion = 0;
        while(posicion < 6 && numero > a[posicion]){
            posicion++;
        }

        for(int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }

        a[posicion] = numero;
        System.out.println("El nuevo arreglo ordenado:");
        for(int i = 0; i < a.length; i++){
            System.out.println(i + " => " + a[i]);
        }

    }
}
