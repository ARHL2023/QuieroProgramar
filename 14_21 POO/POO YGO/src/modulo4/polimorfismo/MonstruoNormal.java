package modulo4.polimorfismo;

public class MonstruoNormal extends Monstruo {

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

    public void leerDescripcion(){
        System.out.println("Mi Monstruo "+getNombre()+" es un poderoso mago");
    }

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
