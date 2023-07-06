package Practicas.Practica3;

import java.util.Scanner;

public class ComienzanConLetra {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;

        System.out.print("Cantodad de palabras: ");
        int cantidad = entrada.nextInt();

        String palabras[] = new String[cantidad];

        for (int i = 0; i<cantidad; i++){
            System.out.print("Ingrese palabra "+(i+1)+ ": ");
            palabras[i] = entrada.next();

            // Obtener la primera letra de la palabra
            char primeraLetra = palabras[i].charAt(0);

            // Verificar si la primera letra es 'A' o 'a'
            if (primeraLetra == 'A' || primeraLetra == 'a') {
                contador++;
            }

        }

        System.out.println("\nPalabras que comeinzan con A son: " +contador );

    }
}
