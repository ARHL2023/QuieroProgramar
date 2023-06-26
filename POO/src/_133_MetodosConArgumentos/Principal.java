package _133_MetodosConArgumentos;

public class Principal {
    public static void main(String[] args) {

        Automovil auto = new Automovil(); //instancia de la clase

        auto.fabricante = "Subaru";
        auto.modelo = "Impresa";
        auto.color = "Rojo";
        auto.cilindraje = 2;

        System.out.println(auto.detalle());//imprime

        System.out.println(auto.acelerar(5));
        System.out.println(auto.frenar());
        System.out.println("metodo \n"+auto.acelerarFrenar(400));

    }//MAIN
}//CLASS
