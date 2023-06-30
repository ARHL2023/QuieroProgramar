package _151_CreandoClasesRelacionales;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    private String apellido;

    //CONSTRUCTORES
    Persona (){

    }
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //GET AND SET

    //METODOS


    @Override
    public String toString() {
        return "nombre= " + nombre  + ", apellido= " + apellido ;
    }
}//
