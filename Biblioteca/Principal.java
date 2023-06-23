package Biblioteca;

import Biblioteca.Data.Data;
import Biblioteca.Usuarios.Administrador;
import Biblioteca.Usuarios.Cliente;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Data d = new Data();

        Administrador ad = new Administrador();
        Cliente cl = new Cliente();

        int opcion = 0;

        do {
            System.out.println("\n\tMenu principal");
            System.out.println("\nIniciar sesion"
                    + "\n1. Administrador"
                    + "\n2. Cliente"
                    + "\n3. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa como administrador");
                    d.validarSesion(ad);
                    break;
                case 2:
                    System.out.println("Ingresa como cliente");
                    d.validarSesion(cl);
                    break;
                case 3:
                    System.out.println("Salimos");
                    break;
                default:
                    System.out.println("Opción inválida");
            }


        } while (opcion != 3);

    }//MAIN
}//CLAS
