package modulo4.herencia;

public class MonstruoNormal extends Monstruo{

    //ATRIBUTOS
    String descripcion;

    //CONSTRUCTOR
    public MonstruoNormal(){

    }

    public MonstruoNormal(String nombre, int nivel, int ataque, int defensa, String descripcion) {
        super(nombre, nivel, ataque, defensa);
        this.descripcion = descripcion;
    }

    //METODOS
    @Override
    public String mostrarInformacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nMonstruo normal");
        sb.append(super.mostrarInformacion());
        sb.append("\nDescripcion : "+descripcion);
        sb.append("\nTotal : "+calcularPoderTotal());
        return  sb.toString();
    }


    //GET AND SET
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
