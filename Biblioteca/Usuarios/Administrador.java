package Biblioteca.Usuarios;

public class Administrador extends Persona{

    //ATRIBUTOS
    private String codigoAdministrador;

    //CONSTRUCTOR


    public Administrador() {
    }

    public Administrador(String codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }

    public Administrador(String nombre, int edad, String user, String password, String codigoAdministrador) {
        super(nombre, edad, user, password);
        this.codigoAdministrador = codigoAdministrador;
    }

    public Administrador(String user, String password, String codigoAdministrador) {
        super(user, password);
        this.codigoAdministrador = codigoAdministrador;
    }

    //GET AND SET
    public String getCodigoAdministrador() {
        return codigoAdministrador;
    }

    public void setCodigoAdministrador(String codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }
}//CLASS
