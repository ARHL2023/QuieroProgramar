package _132_AgregandoMetodos;
public class Automovil {

    //ATRIBUTOS
    String fabricante;
    String modelo;
    String color;
    double cilindraje;

    //METODOS
    public String detalle(){
        //podria usar sout e imprimir pero no es buena practica
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindraje = " + this.cilindraje);
        return  sb.toString();
    }


}//CLASS
