package Practicas.Practica3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Mes mes = new Mes();

        mes.setNombre("Febrero");
        mes.setNumero(2);

        System.out.println(mes.verMes());



    }//MAIN
}//CLASS
