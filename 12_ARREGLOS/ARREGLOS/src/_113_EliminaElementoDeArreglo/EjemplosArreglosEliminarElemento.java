/*
Enunciado: Eliminar un elemento del arreglo

Escriba un programa que solicite al usuario ingresar 10 números enteros y los almacene en un arreglo llamado 'a'.
Luego, solicite al usuario ingresar una posición (entre 0 y 9) que desea eliminar del arreglo.
El programa debe eliminar el elemento en la posición indicada y ajustar el tamaño del arreglo.
Finalmente, se debe imprimir el nuevo arreglo resultante.

*/

import java.util.Scanner;

public class EjemplosArreglosEliminarElemento {
    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese una posición a eliminar entre 0 - 9:");
        int posicion = s.nextInt();

        for(int i = posicion; i < a.length - 1; i++){
            a[i] = a[i+1]; // Eliminar el elemento en la posición indicada desplazando los elementos hacia la izquierda
        }

        int[] b = new int[a.length-1];
        System.arraycopy(a, 0, b, 0, b.length); // Copiar los elementos restantes en un nuevo arreglo de tamaño reducido

        a = b; // Asignar el nuevo arreglo a 'a'
        for(int i = 0; i<a.length;i++){
            System.out.println(i + " => " + a[i]); // Imprimir el nuevo arreglo resultante
        }
    }
}
