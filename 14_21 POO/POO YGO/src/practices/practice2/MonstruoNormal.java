package practices.practice2;

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
    @Override
    public String mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mostrarInformacion());
        sb.append("\nDescripcion: " + descripcion);
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
