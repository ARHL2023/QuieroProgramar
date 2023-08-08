package practices.practice2;

public class Monstruo {

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
    public String mostrarInformacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: "+nombre );
        sb.append("\nAtaque: "+ataque );
        sb.append("\nDefensa: "+defensa );
        sb.append("\nNivel: "+nivel );
        return  sb.toString();
    }

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
