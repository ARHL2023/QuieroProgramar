package practicas.treeset.practice3.modelo;

import java.util.Scanner;
import java.util.TreeSet;

public class Alumno implements Comparable<Alumno> {

    //ATRIBUTOS
    private String nombre;
    private double nota;

    //COSNTRUCTOTRS
    public Alumno() {
    }

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //METODOS
    //AGREGAR
    public void ingresarAlumnos(TreeSet<Alumno> alumnos) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese nombre de alumno: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese nota de alumno: ");
        nota = entrada.nextDouble();
        entrada.nextLine(); // Limpiar el búfer del Scanner

        Alumno alumno = new Alumno(nombre, nota);
        alumnos.add(alumno);
        System.out.println("Alumno agregado exitosamente.");
    }

    //LISTAR
    public static void listarAlumnos(TreeSet<Alumno> alumnos) {
        System.out.println("\nLista de Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    //ELIMINAR



    // Override de toString()
    @Override
    public String toString() {
        return "Nombre: "+nombre + "Nota: "+nota;
    }

    @Override//creado con el implements de la class
    public int compareTo(Alumno o) {
        return 0;
    }

    // GET AND SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


}//CLASS
