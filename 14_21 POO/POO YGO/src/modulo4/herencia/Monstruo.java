package modulo4.herencia;

public class Monstruo {

    //ATRIBUTOS
    private String nombre;
    private int nivel;
    private int ataque;
    private int defensa;

    //CONSTRUCTOR
    public Monstruo() {
    }

    public Monstruo(String nombre, int nivel, int ataque, int defensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    //METODOS
    public int calcularPoderTotal(){
        int total = ataque + defensa;
        return total;
    }

    public void subirDeNivel() {
        nivel++;
        ataque += 300;
        defensa += 300;
    }


    public String mostrarInformacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: "+nombre);
        sb.append("\nAtaque: "+ataque);
        sb.append("\nDefensa: "+defensa);
        sb.append("\nNivel: "+nivel);
        sb.append("\nTotal: "+calcularPoderTotal());
        return  sb.toString();
    }


    //GET AND SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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


}
