package _133_MetodosConArgumentos;

public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindraje;
    int capacidadEstanque = 40;

    //METODOS
    public String detalle(){
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


    public float calcularConsumo(int km, float porcentajeBencina){
        return  km/(capacidadEstanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return  km/(capacidadEstanque*(porcentajeBencina/100f));
    }




}//CLASS
