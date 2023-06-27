package _142_143_AtributosMetodosEstaticos;


public class AutomovilStatico {

    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Impreza","Rojo",2,40);
        Automovil auto2 = new Automovil("Subar2","Impreza2","Roj2",2,40);
        Automovil auto3 = new Automovil("Subar3","Impreza3","Roj3",2,40);

        Automovil.colorPatente = "Verde";//AHORA TODOS TIENEN ESTE COLOR

        System.out.println(auto.detalle());
        System.out.println(auto2.detalle());
        System.out.println(auto3.detalle());

        System.out.println(Automovil.calcularConsumo(300,60));


    }//MAIN
}//CLASS
