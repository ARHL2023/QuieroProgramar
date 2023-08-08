package modulo4.polimorfismo;

public class Main {
    public static void main(String[] args) {

        MonstruoNormal cartaMonstruoNormal = new MonstruoNormal("Dark Magician", 7, 2500, 2100, "Mago");
        MonstruoEfecto cartaMonstruoEfecto = new MonstruoEfecto("Maga oscura", 6, 2100, 2000, "aumenta 300");

        System.out.println(cartaMonstruoNormal.mostrarInformacion());
        System.out.println(cartaMonstruoEfecto.mostrarInformacion());

        Monstruo polimorfismoNormal = cartaMonstruoNormal;
        Monstruo polimorfismoEfecto = cartaMonstruoEfecto;

        System.out.println("\nPolimorfismo con MonstruoNormal:");
        System.out.println(polimorfismoNormal.mostrarInformacion());
        ((MonstruoNormal)polimorfismoNormal).leerDescripcion();

        System.out.println("\nPolimorfismo con MonstruoEfecto:");
        System.out.println(polimorfismoEfecto.mostrarInformacion());
        ( (MonstruoEfecto) polimorfismoEfecto).activarEfecto();

    }//MAIN
}//CLASS
