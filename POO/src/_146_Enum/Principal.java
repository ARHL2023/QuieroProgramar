package _146_Enum;


public class Principal {

    public static void main(String[] args) {

        Automovil auto1 = new Automovil();

        auto1.setModelo("Modelo 1");
        auto1.setFabricante("Fabricaente 1");
        auto1.setColor(Color.AZUL);

        Automovil auto2 = new Automovil();

        auto2.setModelo("Modelo 2");
        auto2.setFabricante("Fabricaente 2");
        auto2.setColor(Color.AMARILLO);

        System.out.println(auto1.detalle());
        System.out.println(auto2.detalle());

    }//MAIN
}//CLASS
