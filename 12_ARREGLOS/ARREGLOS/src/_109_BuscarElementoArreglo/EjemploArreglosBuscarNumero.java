import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10]; // Crear el arreglo "a" con capacidad para 10 elementos

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt(); // Solicitar al usuario que ingrese los números y almacenarlos en el arreglo "a"
        }

        System.out.println("\r\nIngrese un número a buscar:");
        int num = s.nextInt(); // Solicitar al usuario el número a buscar
        int i = 0;
        // Buscar el número en el arreglo
        for(; i < a.length && a[i] != num; i++){}

        if(i == a.length){
            System.out.println("Número no encontrado"); // El número no se encontró en el arreglo
        } else if(a[i] == num){
            System.out.println("Encontrado en la posición: " + i); // El número se encontró en la posición i
        }
    }
}
