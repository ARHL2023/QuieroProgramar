//En este código, se solicita al usuario que ingrese 10 números y los almacena en el arreglo "a".
// Luego, se solicita al usuario que ingrese un nuevo elemento y la posición donde desea agregarlo en el arreglo.
// Después de agregar el elemento en la posición indicada, se crea un nuevo arreglo "b" de tamaño aumentado,
// se copian los elementos de "a" en "b" y se asigna el nuevo arreglo "b" a "a".
// Finalmente, se coloca el último elemento en la última posición del arreglo y se imprime el arreglo resultante.

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt(); // Solicitar al usuario que ingrese los números y almacenarlos en el arreglo "a"
        }
        System.out.println();

        System.out.println("Nuevo elemento:");
        elemento = s.nextInt(); // Solicitar al usuario que ingrese el nuevo elemento a agregar

        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion = s.nextInt(); // Solicitar al usuario que ingrese la posición donde agregar el elemento

        ultimo = a[a.length -1]; // Almacenar el último elemento del arreglo en la variable "ultimo"
        for(int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i]; // Desplazar los elementos hacia la derecha desde la posición indicada
        }
        int[] b = new int[a.length+1];
        System.arraycopy(a, 0, b, 0, a.length); // Crear un nuevo arreglo "b" de tamaño aumentado
        a = b; // Asignar el nuevo arreglo "b" a "a"
        a[posicion] = elemento; // Agregar el nuevo elemento en la posición indicada

        a[a.length -1] = ultimo; // Colocar el último elemento en la última posición del arreglo

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]); // Imprimir los elementos del arreglo
        }

    }
}
