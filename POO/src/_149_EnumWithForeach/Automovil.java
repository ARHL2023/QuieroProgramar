package _149_EnumWithForeach;

public class Automovil {

    private String fabricante;
    private String modelo;
    private Color color; //Color es de la clase Enum

    private TipoAutomovil tipo;

    public Automovil(){

    }

    public Automovil(String fabricante, String modelo, Color color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color.getColor());//como estaba asiciona el getColor paar hacer uso del contenido de minusculas
        sb.append("\nauto.tipo = " + this.getTipo().getNombre());
        return sb.toString();
    }

}//CLASS


