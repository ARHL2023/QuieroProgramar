package modulo4.claseAbstracta;

public  abstract  class Monstruo {

    //ATRIBUTOS
    private String nombre;
    private int ataque;
    private int defensa;
    private int nivel;

    //CONSTRUCTOR
    public Monstruo(){
    }

    public Monstruo(String nombre, int ataque, int defensa, int nivel) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
    }

    //METODOS

    protected String obtenerInformacionBase() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: " + getNombre() + "\n");
        sb.append("Ataque: " + getAtaque() + "\n");
        sb.append("Defensa: " + getDefensa() + "\n");
        sb.append("Nivel: " + getNivel() + "\n");
        return sb.toString();
    }

    public abstract String mostrarInformacion();

    //GET AND SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
