import java.util.Scanner;


public class EjemploArreglosBuscarString {

    public static void main(String[] args) {

        String[] a = new String[4]; // Crear el arreglo "a" con capacidad para 4 elementos de tipo String

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un nombre: ");
            a[i] = s.next(); // Solicitar al usuario que ingrese los nombres y almacenarlos en el arreglo "a"
        }

        System.out.println("\r\nIngrese un nombre a buscar:");
        String nombre = s.next(); // Solicitar al usuario el nombre a buscar
        int i = 0;
        // Buscar el nombre en el arreglo
        for(; i < a.length && !a[i].equalsIgnoreCase(nombre); i++){}

        if(i == a.length){
            System.out.println("Nombre no encontrado"); // El nombre no se encontró en el arreglo
        } else if(a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0){
            System.out.println("Encontrado en la posición: " + i); // El nombre se encontró en la posición i
        }
    }
}
