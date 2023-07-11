import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10]; // Crear el arreglo "a" con capacidad para 10 elementos
        int ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt(); // Solicitar al usuario que ingrese los números y almacenarlos en el arreglo "a"
        }

        System.out.println();

        ultimo = a[a.length-1]; // Almacenar e l último elemento del arreglo en la variable "ultimo"
        for(int i = a.length - 2; i >= 0; i--){
            a[i+1] = a[i]; // Desplazar los elementos hacia la derecha en el arreglo
        }
        a[0] = ultimo; // Colocar el último elemento en la posición inicial del arreglo

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]); // Imprimir los elementos del arreglo
        }

    }
}
