package practicas.treeset.practice3.set;

import practicas.treeset.practice3.modelo.Alumno;

import java.util.Scanner;
import java.util.TreeSet;

public class Principal {

    private static Scanner entrada = new Scanner(System.in);
    private static TreeSet<Alumno> alumnos = new TreeSet<>();

    public static void main(String[] args) {

        int opcion;
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el búfer del Scanner

            switch (opcion) {
                case 1:
                    Alumno alumno = new Alumno();
                    alumno.ingresarAlumnos(alumnos);
                    break;
                case 2:
                    Alumno.listarAlumnos(alumnos);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 3);
    }

    private static void mostrarMenu() {
        System.out.println("\n\tMENU DE OPCIONES");
        System.out.println("SISTEMA DE GESTION DE ALUMNOS");
        System.out.println("\n1. Agregar alumno");
        System.out.println("2. Listar alumnos");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
    }
}
