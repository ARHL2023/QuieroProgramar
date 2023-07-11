package _107_CopiaParImparEnSuPopioArreglo;


import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10]; // Crear el arreglo "a" con capacidad para 10 elementos
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 números:");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt(); // Solicitar al usuario que ingrese los números y almacenarlos en el arreglo "a"
        }

        // Contar la cantidad de números pares e impares en el arreglo "a"
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                totalPares++; // Incrementar el contador de números pares
            } else {
                totalImpares++; // Incrementar el contador de números impares
            }
        }

        pares = new int[totalPares]; // Crear el arreglo "pares" con capacidad para almacenar los números pares
        impares = new int[totalImpares]; // Crear el arreglo "impares" con capacidad para almacenar los números impares

        int j = 0;
        int k = 0;
        // Copiar los números pares e impares del arreglo "a" a los arreglos "pares" e "impares", respectivamente
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                pares[j++] = a[i]; // Copiar el número par a "pares"
            } else {
                impares[k++] = a[i]; // Copiar el número impar a "impares"
            }
        }

        System.out.println("Pares");
        // Imprimir los números pares
        for(int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\nImpares");
        // Imprimir los números impares
        for(int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
