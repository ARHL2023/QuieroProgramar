package _131_CreandoObjetos;

public class Principal {
    public static void main(String[] args) {

        Automovil auto = new Automovil(); //instancia de la clase

        //ASIGNA VALOR
        auto.fabricante = "Subaru";
        auto.modelo = "Impresa";
        auto.color = "Rojo";
        auto.cilindraje = 2;

        //imprime
        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindraje = " + auto.cilindraje);

        //otro objeto

        System.out.println("\nObjeto 2\n");

        Automovil auto2 = new Automovil(); //instancia de la clase

        auto2.fabricante = "Ruba";
        auto2.modelo = "Alexa";
        auto2.color = "Verde";
        auto2.cilindraje = 5;

        //imprime
        System.out.println("auto.fabricante = " + auto2.fabricante);
        System.out.println("auto.modelo = " + auto2.modelo);
        System.out.println("auto.color = " + auto2.color);
        System.out.println("auto.cilindraje = " + auto2.cilindraje);


    }//MAIN
}//CLASS
