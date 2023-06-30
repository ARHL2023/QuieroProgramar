package _151_CreandoClasesRelacionales;


public class Automovil {

    //ATRIBUTOS
    private int id;
    private String fabricante;
    private String modelo;

    //color

    private Motor motor;
    private Persona persona;
    private Estanque estanque;
    private Rueda[] ruedas;

    //CONSTRUCTORES
    public Automovil() {

    }

    public Automovil(String fabricante, String modelo, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Automovil(int id, String fabricante, String modelo, Motor motor, Persona persona, Estanque estanque, Rueda[] ruedas) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.motor = motor;
        this.persona = persona;
        this.estanque = estanque;
        this.ruedas = ruedas;
    }

    //GET AND SET

    //METODOS

}//CLASS


