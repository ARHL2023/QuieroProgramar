//Problema n.° 2
//        Enunciado: Hallar el cociente y el residuo (resto) de dos números enteros

import java.util.Scanner;

public class _2_CocienteAndResiduo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        double numero1 = entrada.nextDouble();
        System.out.print("Ingrese segundo numero: ");
        double numero2 = entrada.nextDouble();

        double cociente = numero1/numero2;
        double residuo = numero1%numero2;

        System.out.println("cociente = " + cociente);
        System.out.println("residuo = " + residuo);

    }
}
