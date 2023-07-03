package _246_FormasLoopIteracionesCollectionSetList.modelo;

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



}//fin class
