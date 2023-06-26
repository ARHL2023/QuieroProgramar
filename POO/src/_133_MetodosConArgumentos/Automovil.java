package _133_MetodosConArgumentos;
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

    public String acelerar(int rpm){
        return "El auto " + fabricante  + " acelerando a " +rpm +"rpm";
    }

    public String frenar(){
        return "El auto " + fabricante + " frenando!!!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" +frenar;
    }

}//CLASS
