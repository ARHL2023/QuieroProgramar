package Practicas.Practica2;

public class Principal {
    public static void main(String[] args) {

        Libro libro = new Libro("Mi libro", "Andy", 2022, 50);
        Libro libro2 = new Libro("Mi libro 2", "Andy", 2021, 500);

        System.out.println(libro.imprimirInformacion());
        System.out.println(libro2.imprimirInformacion());


        System.out.println("Imprime con To String: \n");
        System.out.println(libro.toString());

        System.out.println("Compara con autor: " + (libro.equals(libro2)));

    }//MAIN
}//CLASS
