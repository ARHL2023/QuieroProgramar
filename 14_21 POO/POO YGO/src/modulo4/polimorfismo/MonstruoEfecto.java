package modulo4.polimorfismo;

public class MonstruoEfecto extends Monstruo {

    //ATRIBUTOS
    String efecto;

    //CONSTRUCTOR
    public MonstruoEfecto() {
    }

    public MonstruoEfecto(String nombre, int nivel, int ataque, int defensa, String efecto) {
        super(nombre, nivel, ataque, defensa);
        this.efecto = efecto;
    }

    //METODOS

    public void activarEfecto(){
        System.out.println("Mi Monstruo "+getNombre()+" a activado su efecto");
    }
    @Override
    public String mostrarInformacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nMonstruo efecto");
        sb.append(super.mostrarInformacion());
        sb.append("\nEfecto : "+efecto);
        sb.append("\nTotal : "+calcularPoderTotal());
        return  sb.toString();
    }


    //GET AND SET
    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

}
