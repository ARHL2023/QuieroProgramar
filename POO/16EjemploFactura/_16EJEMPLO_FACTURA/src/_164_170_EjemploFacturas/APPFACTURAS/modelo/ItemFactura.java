package _164_170_EjemploFacturas.APPFACTURAS.modelo;

public class ItemFactura {

    //ATRIBUTOS
    private int cantidad;
    private Proudcto proudcto;

    //CONSTRUCTORES

    public ItemFactura(int cantidad, Proudcto proudcto) {
        this.cantidad = cantidad;
        this.proudcto = proudcto;
    }


    //GET AND SET

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Proudcto getProudcto() {
        return proudcto;
    }

    public void setProudcto(Proudcto proudcto) {
        this.proudcto = proudcto;
    }

    //METODOS

}//
