package _149_EnumWithForeach;


import java.io.FileOutputStream;

public class Principal {

    public static void main(String[] args) {

        Automovil auto1 = new Automovil();

        auto1.setModelo("Modelo 1");
        auto1.setFabricante("Fabricaente 1");
        auto1.setColor(Color.AZUL);
        auto1.setTipo(TipoAutomovil.CONVERTIBLE);

        Automovil auto2 = new Automovil();

        auto2.setModelo("Modelo 2");
        auto2.setFabricante("Fabricaente 2");
        auto2.setColor(Color.AMARILLO);
        auto2.setTipo(TipoAutomovil.SEDAN);

        System.out.println(auto1.detalle());
        System.out.println(auto2.detalle());

        /////////////////////////////////////////
        TipoAutomovil tipoAuto1 = auto1.getTipo();
        System.out.println(auto1.getFabricante());

        switch (tipoAuto1){
            case SEDAN :
                System.out.println("ES UN CASO SEDAN");
                break;
            case FURGON:
                System.out.println("ES UN CASO FURGON");
                break;
            case CONVERTIBLE:
                System.out.println("ES UN CASO CONVERTIBLE");
                break;
        }//SWITCH


        //FOREACH
        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta: tipos){
            System.out.print(ta +"->" +ta.name()+"\n"
                    +"->" +ta.getNombre()+"\n"
                    +"->" +ta.getDescipcion()+"\n"
                    +"->" +ta.getNumeroPuertas());
        }


    }//MAIN
}//CLASS
