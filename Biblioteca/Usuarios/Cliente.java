package Biblioteca.Usuarios;

public class Cliente extends Persona{

    //ATRIBUTOS
    private String codigoCliente;
    private String librosPrestados;

    //CONSTRUCTOR


    public Cliente() {
    }

    public Cliente(String codigoCliente, String librosPrestados) {
        this.codigoCliente = codigoCliente;
        this.librosPrestados = librosPrestados;
    }

    public Cliente(String nombre, int edad, String user, String password, String codigoCliente, String librosPrestados) {
        super(nombre, edad, user, password);
        this.codigoCliente = codigoCliente;
        this.librosPrestados = librosPrestados;
    }

    public Cliente(String user, String password, String codigoCliente, String librosPrestados) {
        super(user, password);
        this.codigoCliente = codigoCliente;
        this.librosPrestados = librosPrestados;
    }


    //GET AND SET


    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(String librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
}//CLASS
