package Biblioteca.Usuarios;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String user;
    private String password;

    //CONSTRUCTOR

    public Persona() {
    }

    public Persona(String nombre,int edad, String user, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        this.password = password;
    }

    public Persona(String user, String password) {
        this.user = user;
        this.password = password;
    }


    //GET AND SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}//CLASS

