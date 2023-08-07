package modulo2;

public class Main {
    public static void main(String[] args) {

        //Creacion de una instancia (objeto) de la clase carta
        Carta miCarta = new Carta("Dragón Blanco de Ojos Azules", 3000, 2500);

        miCarta.mostrarInformacion();

        System.out.println("\nParametros");
        // Combinaciones de parámetros para mostrarInformacionParametros
        miCarta.mostrarInformacionParametros(true, true, true);
        miCarta.mostrarInformacionParametros(true, true, false);
        miCarta.mostrarInformacionParametros(true, false, true);
        miCarta.mostrarInformacionParametros(true, false, false);
        miCarta.mostrarInformacionParametros(false, true, true);
        miCarta.mostrarInformacionParametros(false, true, false);
        miCarta.mostrarInformacionParametros(false, false, true);
        miCarta.mostrarInformacionParametros(false, false, false);

    }//MAIN
}//CLASS
