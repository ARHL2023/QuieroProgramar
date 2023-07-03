package _164_170_EjemploFacturas.APPFACTURAS.modelo;

public class Proudcto {

    //ATRIBUTOS
    private int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo;


    //CONSTRUCTORES

    public Proudcto() {
        this.codigo = ++ultimoCodigo;
    }


    //GET AND SET

    public int getCodigo() {
        return codigo;
    }

//    public void setCodigo(int codigo) {
//        this.codigo = codigo;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    //METODOS

}//
