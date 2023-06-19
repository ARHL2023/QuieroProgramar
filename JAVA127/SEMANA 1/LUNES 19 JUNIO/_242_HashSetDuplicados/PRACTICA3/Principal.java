package _242_HashSetDuplicados.PRACTICA3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        Modelo modelo = new Modelo();

        do {

            System.out.println("\n\tMenu Principal");
            System.out.print("\n1. Mostrar lista de invitados"
                    + "\n2. Agregar invitado"
                    + "\n3. Verificar invitado"
                    + "\n4. Eliminar invitado"
                    + "\n5. Cantidad de invitados"
                    + "\n6. Salir"
                    + "\nOpcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nMostarndo invitados: ");
                    modelo.mostrarInvitados();
                    break;

                case 2:
                    System.out.println("\nAgregando invitados");
                    modelo.agregarIvitado();
                    break;

                case 3:
                    System.out.println("\nBuscar invitados");
                    modelo.verificarInvitado();
                    break;

                case 4:
                    System.out.println("\nEliminar invitados");
                    modelo.eliminarInvitado();
                    break;

                case 5:
                    System.out.println("\nCantidad de invitados");
                    modelo.cantidadInvitados();
                    break;

                default:
                    System.out.println("Invalido");
            }

        } while (opcion != 6);

    }//MAIN
}//CLASS
