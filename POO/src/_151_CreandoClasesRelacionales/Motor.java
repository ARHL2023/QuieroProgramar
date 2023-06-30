package _151_CreandoClasesRelacionales;

public class Motor {

    //ATRIBUTOS
    private double cilindrada;
    private TipoMotor tipo;

    //CONSTRUCTORES
    Motor(){

    }

    public Motor(double cilindrada, TipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    //GET AND SET

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }


    //METODOS

}//
