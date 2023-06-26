package _133_MetodosConArgumentos;

public class Principal {
    public static void main(String[] args) {

        Automovil auto = new Automovil(); //instancia de la clase

        auto.fabricante = "Subaru";
        auto.modelo = "Impresa";
        auto.color = "Rojo";
        auto.cilindraje = 2;

        System.out.println(auto.detalle());//imprime

        System.out.println(auto.calcularConsumo(300,0.75f));
        System.out.println(auto.calcularConsumo(300,60));


    }//MAIN
}//CLASS
