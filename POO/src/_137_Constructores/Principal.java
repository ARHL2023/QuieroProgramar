package _137_Constructores;

public class Principal {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Impreza","Rojo",2,40);

        //imprime get- obtener valor
        System.out.println("fabricante = " + auto.getFabricante());
        System.out.println("modelo = " + auto.getModelo());
        System.out.println("color = " + auto.getColor());
        System.out.println("cilindraje = " + auto.getCilindraje());

    }//MAIN
}//CLASS
