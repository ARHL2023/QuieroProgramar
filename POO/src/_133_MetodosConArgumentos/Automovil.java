package _133_MetodosConArgumentos;

public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindraje;
    int capacidadEstanque = 40;

    //metodos
    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindraje = " + this.cilindraje);
        return  sb.toString();
    }

    //metodos
    public float calcularConsumo(int km, float porcentajeBencina){
        return  km/(capacidadEstanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return  km/(capacidadEstanque*(porcentajeBencina/100f));
    }




}//CLASS
