//Problema n.° 7
//        Enunciado: Determinar la suma de los N primeros números enteros posi􀆟 vos (Z+). Use la siguiente
//        fórmula.

import java.util.Scanner;

public class _7_SumaPrimerosNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese numero: ");
        int numero = entrada.nextInt();

        int sumaN = ( numero*(numero+1) )/2;

        System.out.println("sumaN  = " + sumaN);


    }
}
