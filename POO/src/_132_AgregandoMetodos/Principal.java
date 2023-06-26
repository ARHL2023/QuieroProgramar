package _132_AgregandoMetodos;

public class Principal {
    public static void main(String[] args) {

        Automovil auto = new Automovil(); //instancia de la clase

        auto.fabricante = "Subaru";
        auto.modelo = "Impresa";
        auto.color = "Rojo";
        auto.cilindraje = 2;

        System.out.println(auto.detalle());//imprime


    }//MAIN
}//CLASS
