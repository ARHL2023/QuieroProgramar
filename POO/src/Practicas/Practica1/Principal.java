package Practicas.Practica1;

public class Principal {
    public static void main(String[] args) {

        Libro libro = new Libro("Mi libro", "Andy", 2022, 50);
        Libro libro2 = new Libro("Mi libro 2", "Lady", 2021, 500);

        System.out.println(libro.imprimirInformacion());
        System.out.println(libro2.imprimirInformacion());

    }//MAIN
}//CLASS
