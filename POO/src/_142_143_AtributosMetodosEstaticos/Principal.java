package _142_143_AtributosMetodosEstaticos;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {


//        Automovil auto = new Automovil("Subaru","Impreza","Rojo",2,40);
//
//        //imprime get- obtener valor
//        System.out.println("fabricante = " + auto.getFabricante());
//        System.out.println("modelo = " + auto.getModelo());
//        System.out.println("color = " + auto.getColor());
//        System.out.println("cilindraje = " + auto.getCilindraje());
//
//        System.out.println("\nSobrecarga de constructores \n");
//
//        Automovil auto2 = new Automovil("Chevrolet","aaaa");
//        System.out.println("fabricante = " + auto2.getFabricante());
//        System.out.println("modelo = " + auto2.getModelo());

        //EQUALS
        Automovil auto4 = new Automovil("Subaru","Impreza","Rojo",2,40);
        Automovil auto5 = new Automovil("Subaru","Impreza","Rojo",2,40);

        System.out.println("\n----------------EQUALS-----------------");

        //EQUALS: Compara objetos y son diferentes asi tengan los mismos datos, porque cada objeto que se crea en memoria
        //se guarda en memoria distinta indiferete si tienen los mismos datos

        Date fecha = new Date();


        //estamos compranado una fecha, ver implementacion en otra clase
        System.out.println("Otro objeto: "+(auto5.equals(fecha)));//f

        System.out.println("Son iguales? "+(auto4==auto5));//F
        System.out.println("Son iguales con equals? "+(auto4.equals(auto5)));//V

    }//MAIN
}//CLASS
