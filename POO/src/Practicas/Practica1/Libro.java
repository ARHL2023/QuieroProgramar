package Practicas.Practica1;

public class Libro {

    //ATRIBUTOS
    private String TituloLibro;
    private String AutorLibro;
    private int AnioPublicacion;
    private int numeroPaginas;


    //CONSTRUCTOR
    public Libro(String tituloLibro, String autorLibro, int anioPublicacion, int numeroPaginas) {
        TituloLibro = tituloLibro;
        AutorLibro = autorLibro;
        AnioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    //METODOS
    public String imprimirInformacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nTitulo del Libro = " + this.TituloLibro);
        sb.append("\nAutor del libro = " + getAutorLibro());
        sb.append("\nAnio de publicacion = " + getAnioPublicacion());
        sb.append("\nNumero de paginas = " + getNumeroPaginas());
        return  sb.toString();

    }

    //GET AND SET
    public String getTituloLibro() {
        return TituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        TituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return AutorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        AutorLibro = autorLibro;
    }

    public int getAnioPublicacion() {
        return AnioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        AnioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

}//CLASS


