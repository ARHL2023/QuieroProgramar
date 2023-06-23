package Biblioteca.Data;

import Biblioteca.Usuarios.Administrador;
import Biblioteca.Usuarios.Cliente;
import Biblioteca.Usuarios.Persona;

import java.util.Objects;
import java.util.Scanner;

public class Data {

    Scanner entrada = new Scanner(System.in);

    Administrador ad = new Administrador();
    Cliente cl = new Cliente();

    public void validarSesion(Persona persona) {

//        Administrador administrador = new Administrador();
//        Cliente cliente = new Cliente();

        if(persona instanceof Administrador){
            System.out.println("Ingresando como administrador");

            ingresaAdministrador();
        } else if (persona instanceof Cliente) {
            System.out.println("Ingresando como cliente");
            ingresandoCliente();
        }

    }//METODO

    private void ingresandoCliente() {

        String usuarioCliente = "Cliente";
        String passwordCliente = "123";

        System.out.print("\nIngrese usuario: ");
        String usuario = entrada.nextLine();
        System.out.print("\nIngrese password: " );
        String password = entrada.nextLine();


        if (usuarioCliente.equals(usuario) && passwordCliente.equals(password)){
            System.out.println("\nCredenciales correctas cliente");
        }
        else {
            System.out.println("\nCredenciales incorrectas cliente");
        }

    }//METODO

    private void ingresaAdministrador() {

        String usuarioAdministrador = "Admin";
        String passwordAdministrador = "123";

        System.out.print("\nIngrese usuario: ");
        String usuario = entrada.nextLine();
        System.out.print("\nIngrese password: " );
        String password = entrada.nextLine();


        if (usuarioAdministrador.equals(usuario) && passwordAdministrador.equals(password)){
            System.out.println("\nCredenciales correctas administador");
        }
        else {
            System.out.println("\nCredenciales incorrectas administador");
        }

    }//METODO


}//CLASS
