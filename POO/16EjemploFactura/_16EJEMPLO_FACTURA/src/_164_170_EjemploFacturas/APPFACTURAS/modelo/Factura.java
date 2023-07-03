package _164_170_EjemploFacturas.APPFACTURAS.modelo;

import java.util.Date;

public class Factura {

    //ATRIBUTOS
    private int folio; //ID
    private String descripcion;
    private Date fecha;

    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;

    public  static final int MAX_ITEMS = 10;

    private static int ultimoFolio;

    //CONSTRUCTORES

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;//autogenerar
        this.fecha = new Date();
    }



    //GET AND SET

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    //METODOS

    public void addItemFactura(ItemFactura item){
        if(indiceItems<MAX_ITEMS){
            this.items[indiceItems++] = item;
        }

    }//

}//
