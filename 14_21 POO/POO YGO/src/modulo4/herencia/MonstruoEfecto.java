package modulo4.herencia;

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
