package modulo4.claseAbstracta;

public class Main {
    public static void main(String[] args) {

        //MONSTRUO NORMAL
        MonstruoNormal cartaMonstruoNormal = new MonstruoNormal();
        cartaMonstruoNormal.setNombre("Dark Magician");
        cartaMonstruoNormal.setAtaque(2500);
        cartaMonstruoNormal.setDefensa(2100);
        cartaMonstruoNormal.setNivel(7);
        cartaMonstruoNormal.setDescripcion("Mago");

        System.out.println(cartaMonstruoNormal.mostrarInformacion());

        //polimorfismo del normal
        Monstruo polimorfismoNormal = cartaMonstruoNormal;

        System.out.println("\nPolimorfismo con MonstruoNormal:");

        //MONSTRUO EFECTO
        MonstruoEfecto cartaMonstruoEfecto = new MonstruoEfecto();
        cartaMonstruoEfecto.setNombre("Kuriboh");
        cartaMonstruoEfecto.setAtaque(300);
        cartaMonstruoEfecto.setDefensa(200);
        cartaMonstruoEfecto.setNivel(1);
        cartaMonstruoEfecto.setEfecto("No reciebe daño de batallas");

        System.out.println(cartaMonstruoEfecto.mostrarInformacion());

        //polimorfismo del efecto
        Monstruo polimorfismoEfecto = cartaMonstruoEfecto;
        System.out.println("\nPolimorfismo con MonstruoEfecto:");
       ((MonstruoEfecto) polimorfismoEfecto).activarEfecto();


       //MONSTRUO FUSION
        MonstruoFusion cartaMonstruoFusion = new MonstruoFusion();
        cartaMonstruoFusion.setNombre("HÉROE Elemental de la Llama Wingman");
        cartaMonstruoFusion.setAtaque(2100);
        cartaMonstruoFusion.setDefensa(1200);
        cartaMonstruoFusion.setNivel(6);
        cartaMonstruoFusion.setMaterial1("HÉROE Elemental Avian");
        cartaMonstruoFusion.setMaterial2("HÉROE Elemental Burstinatrix");

        System.out.println(cartaMonstruoFusion.mostrarInformacion());

        //polimorfismo del fusion
        Monstruo polimorfismoFusion = cartaMonstruoFusion;
        System.out.println("\nPolimorfismo con MonstruoFusion:");
       // cartaMonstruoFusion.realizarFusion();
        ((MonstruoFusion)polimorfismoFusion).realizarFusion();


    }
}
