package modulo4.claseAbstracta;

public class MonstruoEfecto extends Monstruo {

    //ATRIBUTOS
    private String efecto;

    //CONSTRUCTOR
    public MonstruoEfecto() {
    }

    public MonstruoEfecto(String nombre, int ataque, int defensa, int nivel, String efecto) {
        super(nombre, ataque, defensa, nivel);
        this.efecto = efecto;
    }

    //METODOS
    public void activarEfecto(){
        System.out.println("Mi monstruo "+getNombre()+" Ha activado su efecto"+" el cual es " +getEfecto());
    }

    @Override
    public String mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append(obtenerInformacionBase());
        sb.append("\nEfecto: " + efecto);
        return sb.toString();
    }

    //GET AND SET

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
}
