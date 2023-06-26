package _141_MetodoToString;

import java.util.Date;

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

        System.out.println("\n----------------TO STRING-----------------");


//        El método toString es un método predefinido en Java que se utiliza para obtener una representación en forma de cadena de texto de un objeto.
//                La implementación por defecto del método toString devuelve una cadena que contiene el nombre de la clase del objeto,
//        seguido del símbolo "@" y la representación hexadecimal del valor hash del objeto.
//
//                Sin embargo, es común y útil personalizar la implementación del método toString en una clase para
//        proporcionar una representación más legible y significativa del objeto. Puedes incluir información relevante de los atributos
//        del objeto y cualquier otra información que consideres importante.

//        en Java, cuando invocas el método toString() de un objeto, se puede omitir explícitamente
//        el llamado al método y simplemente imprimir el objeto directamente usando System.out.println()

        System.out.println(auto4.toString());
        System.out.println(auto4);//NO ES NECESARIO COLOCAR EL TO STRING

    }//MAIN
}//CLASS
