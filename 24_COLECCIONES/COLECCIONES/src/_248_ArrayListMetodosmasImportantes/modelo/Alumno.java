package _248_ArrayListMetodosmasImportantes.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

    //atributos
    private String nombre;
    private double nota;

    //constructor
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno(){

    }

    //METODOS
    @Override
    public String toString() {
        return  "nombre='" + nombre + " nota=" + nota ;
    }

    //METODO IMPLEMENTADO de -->public class Alumno  implements Comparable<Alumno>
    @Override
    public int compareTo(Alumno a) {

        //CON NOMBRE
        if(this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(a.nombre);

//        //con nota
//        if(this.nota == a.nota){
//            return 0;
//        }
//        if (this.nota > a.nota){
//            return 1;
//        }
//        else {
//            return -1;
//        }

    }

    //get and set
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Double.compare(alumno.nota, nota) == 0 && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}//fin class
