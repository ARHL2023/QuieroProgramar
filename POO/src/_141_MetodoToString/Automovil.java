package _141_MetodoToString;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindraje;
    private int capacidadEstanque = 40;

    //CONSTRUCTOR
    public Automovil(String fabricante, String modelo, String color, double cilindraje, int capacidadEstanque) {
        this(fabricante, modelo);
        this.color = color;
        this.cilindraje = cilindraje;
        this.capacidadEstanque = capacidadEstanque;
    }

    //SOBRECARGA CONSTRUCTOR
    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    //METODOS
    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindraje = " + this.cilindraje);
        return sb.toString();
    }


    public String acelerar(int rpm) {
        return "El auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return "El auto " + fabricante + " frenando!!!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }


    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadEstanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadEstanque * (porcentajeBencina / 100f));
    }


    //METODO EQUALS

//    Si alguno de los valores involucrados en la comparación con el método equals es null,
//    debes manejar esa situación en tu implementación para evitar errores de NullPointerException
//    y definir el comportamiento deseado en ese caso.

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Automovil)){
            return false;
        }

        Automovil a = (Automovil) obj;
        return this.fabricante.equals(a.getFabricante())
                && this.modelo.equals((a.getModelo()))
                && this.fabricante != null
                && this.modelo != null ;
    }

    //METODO TO STRING


    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + cilindraje +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }

    //GET AND SET
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

}//CLASS
