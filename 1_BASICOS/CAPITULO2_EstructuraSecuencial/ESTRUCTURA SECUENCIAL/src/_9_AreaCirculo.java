//Problema n.° 9
//        Enunciado: Crear un programa para encontrar el área de un círculo, use la fórmula:
//        A = π.r2
//        Área (A): Es el área del círculo.
//        PI (π): Representa el valor constante pi (3.14159).
//        Radio (r): Es el radio del círculo

import java.util.Scanner;

public class _9_AreaCirculo {
    public static void main(String[] args) {

        final  double PI = 3.14159;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Radio del circulo: ");
        double radio = entrada.nextDouble();

        double area = PI * (Math.pow(radio,2));

        System.out.println("area = " + area);

    }
}
