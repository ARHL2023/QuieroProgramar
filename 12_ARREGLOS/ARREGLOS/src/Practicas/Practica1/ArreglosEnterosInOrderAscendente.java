package Practicas.Practica1;

import java.util.Arrays;
import java.util.Scanner;

public class ArreglosEnterosInOrderAscendente {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Cantidad de elementos a ingresar: ");
        int cantidad = entrada.nextInt();

        int numeros[] = new int[cantidad];


        //INGRESANDO DATOS
        for (int i = 0; i<cantidad; i++){
            System.out.print("Ingrese numero "+(i+1)+": ");
            numeros[i] = entrada.nextInt();
            entrada.nextLine();
        }

        Arrays.sort(numeros);

        //MOSTRANDO DATOS
        for (int i = 0; i<cantidad; i++){
            System.out.println("Posicion "+(i)+"-> "+numeros[i]);
        }


    }
}
