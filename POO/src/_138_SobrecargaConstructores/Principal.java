package _138_SobrecargaConstructores;

public class Principal {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Impreza","Rojo",2,40);

        //imprime get- obtener valor
        System.out.println("fabricante = " + auto.getFabricante());
        System.out.println("modelo = " + auto.getModelo());
        System.out.println("color = " + auto.getColor());
        System.out.println("cilindraje = " + auto.getCilindraje());

        System.out.println("\nSobrecarga de constructores \n");

        Automovil auto2 = new Automovil("Chevrolet","aaaa");
        System.out.println("fabricante = " + auto2.getFabricante());
        System.out.println("modelo = " + auto2.getModelo());


    }//MAIN
}//CLASS
