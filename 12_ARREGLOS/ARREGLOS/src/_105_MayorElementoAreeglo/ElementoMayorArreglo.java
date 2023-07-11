package _105_MayorElementoAreeglo;

import java.util.Scanner;

public class ElementoMayorArreglo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a[] = new int[5]; // Crear el arreglo "a" con capacidad para 5 elementos

        // Solicitar al usuario que ingrese los valores del arreglo "a"
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            a[i] = entrada.nextInt();
        }

        int max = 0;
        // Encontrar el índice del elemento máximo en el arreglo "a"
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }

        //LO MISMO DE ARRIBA PERO EN FORMATO IF ELSE
//        int max = 0;
//        // Encontrar el índice del elemento máximo en el arreglo "a"
//        for (int i = 1; i < a.length; i++) {
//            if (a[max] > a[i]) {
//                max = max;
//            } else {
//                max = i;
//            }
//        }

        System.out.println("a[max] = " + a[max]); // Imprimir el valor del elemento máximo en el arreglo "a"

    }
}
