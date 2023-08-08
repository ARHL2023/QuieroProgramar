package modulo4.claseAbstracta;

public class MonstruoNormal extends Monstruo {

    //ATRIBUTOS
    private String descripcion;

    //CONSTRUCTOR
    public MonstruoNormal() {
    }

    public MonstruoNormal(String nombre, int ataque, int defensa, int nivel, String descripcion) {
        super(nombre, ataque, defensa, nivel);
        this.descripcion = descripcion;
    }

    //METODOS
    // Implementación del método abstracto
    @Override
    public String mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append(obtenerInformacionBase());
        sb.append("Descripcion: " + descripcion + "\n");
        return sb.toString();
    }

    public void activarEfecto() {
        System.out.println("no tiene ningun efecto xd");
    }

    //GET AND SET
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
