package _242_HashSetDuplicados.PRACTICA3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Modelo {

    Scanner entrada = new Scanner(System.in);
    String nombre;

    Set<String> invitados = new HashSet<>();

    //1
    public void mostrarInvitados() {
        System.out.println(invitados);
    }

    //2
    public String agregarIvitado() {
        System.out.print("Ingrese nombre del invitado: ");
        nombre = entrada.nextLine();
        invitados.add(nombre);
        System.out.println(getNombre()+"Agregado correctamente");
        return nombre;
    }

    //3
    public String verificarInvitado() {
        System.out.print("Ingrese nombre a buscar: ");
        nombre = entrada.nextLine();
        if (invitados.contains(getNombre())) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }

        return nombre;
    }

    //4
    public void eliminarInvitado(){
        System.out.print("Ingrese nombre a eliminar: ");
        nombre = entrada.nextLine();
        invitados.remove(getNombre());
        System.out.println(getNombre()+"Eliminado correctamente");
    }

    //5
    public void cantidadInvitados(){
        System.out.println("L lista de invitados son de: "+invitados.size());
    }

    //GET AND SET
    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}//class
