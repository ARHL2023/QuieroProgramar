package _134_135_MétodosconArgumentosSobrecargaEncapsulamiento;

public class Principal {
    public static void main(String[] args) {

        Automovil auto = new Automovil(); //instancia de la clase

        //asiga con set- asigna valor
        auto.setFabricante("Subaru");
        auto.setModelo("Impresa");
        auto.setColor("Rojo");
        auto.setCilindraje(2);

        //imprime get- obtener valor
        System.out.println("fabricante = " + auto.getFabricante());
        System.out.println("modelo = " + auto.getModelo());
        System.out.println("color = " + auto.getColor());
        System.out.println("cilindraje = " + auto.getCilindraje());


    }//MAIN
}//CLASS
