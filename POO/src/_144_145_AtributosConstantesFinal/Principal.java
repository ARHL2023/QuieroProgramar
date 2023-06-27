package _144_145_AtributosConstantesFinal;


public class Principal {

    public static void main(String[] args) {

        AutomovilFinal auto = new AutomovilFinal("Subaru","Impreza","Rojo",2,40);
        AutomovilFinal auto2 = new AutomovilFinal("Subar2","Impreza2","Roj2",2,40);
        AutomovilFinal auto3 = new AutomovilFinal("Subar3","Impreza3","Roj3",2,40);

        AutomovilFinal.colorPatente = "Verde";//AHORA TODOS TIENEN ESTE COLOR

        auto.setColor(AutomovilFinal.COLOR_AMARILLO);
        auto2.setColor(AutomovilFinal.COLOR_AZUL);
        auto3.setColor(AutomovilFinal.COLOR_AZUL);

        System.out.println(auto.detalle());
        System.out.println(auto2.detalle());
        System.out.println(auto3.detalle());

        System.out.println(AutomovilFinal.calcularConsumo(300,60));


    }//MAIN
}//CLASS
