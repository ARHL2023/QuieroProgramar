package practices.practice1;

public class Main {
    public static void main(String[] args) {

        Monstruo cartaMonstruo = new Monstruo();

        cartaMonstruo.setNombre("Dark Magician");
        cartaMonstruo.setAtaque(2500);
        cartaMonstruo.setDefensa(2100);
        cartaMonstruo.setNivel(7);


        for(int i =1; i<4; i++){
            System.out.println("\nsalida "+i);
            System.out.print(cartaMonstruo.mostrarInformacionDetallada());
            cartaMonstruo.subirDeNivel();
        }

    }
}
