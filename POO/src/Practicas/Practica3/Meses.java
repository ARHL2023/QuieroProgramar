package Practicas.Practica3;

public enum Meses {
    ENERO("Enero",1),
    FEBRERO("Febrero",2),
    MARZO("Marzo",3),
    ABRIL("Abril",4),
    MAYO("Mayo",5),
    JUNIO("Junio",6),
    JULIO("Julio",7),
    AGOSTO("Agosto",8),
    SEPTIEMBRE("Septiembre",9),
    OCTUBRE("Octubre",10),
    NOVIEMBRE("Noviembre",11),
    DICIEMBRE("Diciembre",12);


    //ATRIBUTOS
    private final String nombre;
    private final int numero;

    //CONSTRUCTORES
    Meses(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    //GET

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    //METODOS


}//ENUM
