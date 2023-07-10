//Problema n.° 8
//        Enunciado: Calcular el interés compuesto generado por un capital depositado durante cierta can􀆟 dad de
//        􀆟 empo, a una tasa de interés determinada; aplique las siguientes fórmulas:
//        M = (1 + r%)t.C
//        I = M – C

//Monto (M): Es la suma del capital más los intereses producidos en determinado 􀆟 empo.
//        Tasa de interés (r%): Es la ganancia que se ob􀆟 ene por cada 100 unidades monetarias en cada periodo
//        de 􀆟 empo.
//        Capital (C): Es todo aquello que se va a ceder o imponer durante algún 􀆟 empo para generar una ganancia.
//        Interés (I): Parte de la u􀆟 lidad que ob􀆟 ene el capitalista al prestar su dinero.
//        Tiempo (t): Es el periodo de 􀆟 empo durante el cual se cede el capital.

import java.util.Scanner;

public class _8_InteresCompuesto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese capital: ");
        double capital = entrada.nextDouble();

        System.out.print("Ingrese tasa de interés: ");
        double tasaInteres = entrada.nextDouble();

        System.out.print("Ingrese tiempo en años: ");
        int tiempo = entrada.nextInt();

        double monto = capital * Math.pow((1 + tasaInteres / 100), tiempo);
        double interes = monto - capital;

        System.out.println("Capital: $" + capital);
        System.out.println("Tasa de interés: " + tasaInteres + "%");
        System.out.println("Tiempo: " + tiempo + " años");
        System.out.println("Monto: $" + monto);
        System.out.println("Interés: $" + interes);


    }
}
