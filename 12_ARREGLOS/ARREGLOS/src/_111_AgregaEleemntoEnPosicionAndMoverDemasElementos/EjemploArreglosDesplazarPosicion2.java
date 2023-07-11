//En este código, se solicita al usuario que ingrese 9 números y se almacenan en el arreglo "a". Luego, se solicita al usuario que ingrese un nuevo elemento y la posición donde desea agregarlo en el arreglo.
//
//        Después de solicitar la entrada del nuevo elemento y la posición, se realiza un desplazamiento de los elementos del arreglo hacia la derecha desde la posición indicada. Luego, se asigna el nuevo elemento en la posición especificada.
//
//        Finalmente, se imprime el arreglo resultante.


import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10]; // Crear el arreglo "a" con capacidad para 10 elementos
        int elemento, posicion;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length-1; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt(); // Solicitar al usuario que ingrese los números y almacenarlos en el arreglo "a"
        }
        System.out.println();

        System.out.println("Nuevo elemento:");
        elemento = s.nextInt(); // Solicitar al usuario que ingrese el nuevo elemento a agregar

        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion = s.nextInt(); // Solicitar al usuario que ingrese la posición donde agregar el elemento

        for(int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i]; // Desplazar los elementos hacia la derecha desde la posición indicada
        }
        a[posicion] = elemento; // Agregar el nuevo elemento en la posición indicada

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]); // Imprimir los elementos del arreglo
        }

    }
}
