//Problema n.° 10
//        Enunciado: Crear un programa que permita conver􀆟 r una can􀆟 dad de segundos en horas, minutos y
//        segundos

import java.util.Scanner;

public class _10_SegundosEnHorasAndMinutos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int HORA = 360;
        final int MINUTO = 60;

        System.out.print("Ingrese tiempo: ");
        int tiempo = entrada.nextInt();

        int horas = tiempo / HORA;
        tiempo = tiempo % HORA;
        int minuto = tiempo/MINUTO;
        int segundos = tiempo % MINUTO;

        System.out.println("horas = " + horas);
        System.out.println("minuto = " + minuto);
        System.out.println("segundos = " + segundos);


    }
}
