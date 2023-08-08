package modulo4.herencia;

public class Main {
    public static void main(String[] args) {

        MonstruoNormal cartaMonstruoNormal = new MonstruoNormal("Dark Magician", 7, 2500, 2100, "Mago");
        MonstruoEfecto cartaMonstruoEfecto = new MonstruoEfecto("Maga oscura", 6, 2100, 2000, "aumenta 300");

        System.out.println("\nImprimiendo de forman normal");

        System.out.println(cartaMonstruoNormal.mostrarInformacion());
        System.out.println(cartaMonstruoEfecto.mostrarInformacion());


        System.out.println("/////////////////////////////////////////////////////////////////////////");

        System.out.println("\nImprimiendo de forman repetida aumentando stats");
        System.out.println("\nImprimiendo de forman repetida mosntruo normal");
        for (int i = 1; i < 4; i++) {
            System.out.println("\nVuelta " + i);
            System.out.println(cartaMonstruoNormal.mostrarInformacion());
            cartaMonstruoNormal.subirDeNivel();
        }

        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println("\nImprimiendo de forman repetida mosntruo cartaMonstruoEfecto");
        for (int i = 1; i < 4; i++) {
            System.out.println("\nVuelta " + i);
            System.out.println(cartaMonstruoEfecto.mostrarInformacion());
            cartaMonstruoEfecto.subirDeNivel();
        }


    }//MAIN
}//CLASS
