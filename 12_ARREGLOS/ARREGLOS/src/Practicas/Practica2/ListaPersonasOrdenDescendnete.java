package Practicas.Practica2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ListaPersonasOrdenDescendnete {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Cantidad de personas a ingresar: ");
        int cantidad = entrada.nextInt();

        String personas[] = new String[cantidad];

        for (int i = 0; i<cantidad; i++){
            System.out.print("Nombre de persona "+(i+1)+": ");
            personas[i] = entrada.next();
            //entrada.nextLine();
        }


        Arrays.sort(personas, Collections.reverseOrder());

        for (int i = 0; i<cantidad; i++){
            System.out.println("Persona "+(i)+"-> "+personas[i]);
        }


    }
}
