package _147_EnumConMasAributos;

public enum TipoAutomovil {

    SEDAN("Sedan", "Auto mediano", 4),
    STATION("Station", "Auto familiar", 5),
    PICKUP("Pickup", "Camioneta de carga", 2),
    CONVERTIBLE("Convertible", "Auto descapotable", 2),
    FURGON("Furgon", "Vehículo de carga", 4);

    private final String nombre;
    private final int numeroPuertas;
    private final String descipcion;


    TipoAutomovil(String nombre, String descipcion , int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descipcion = descipcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescipcion() {
        return descipcion;
    }

}//ENUM
