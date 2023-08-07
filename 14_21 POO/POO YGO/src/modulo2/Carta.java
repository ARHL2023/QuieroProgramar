package modulo2;

public class Carta {

    //ATRBUTOS
    String nombre;
    int ataque;
    int defensa;

    //CONSTRUCTOR
    public Carta(String nombre, int ataque, int defensa) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    //METODOS
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
    }

    public void mostrarInformacionParametros(boolean name, boolean atk, boolean def) {
        System.out.println("");
        if (name) {
            System.out.println("Nombre: " + nombre);
        } else {
            System.out.println("No se ha seleccionado el atributo Nombre.");
        }

        if (atk) {
            System.out.println("Ataque: " + ataque);
        } else {
            System.out.println("No se ha seleccionado el atributo Ataque.");
        }

        if (def) {
            System.out.println("Defensa: " + defensa);
        } else {
            System.out.println("No se ha seleccionado el atributo Defensa.");
        }

    }

}
