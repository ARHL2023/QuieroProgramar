package _242_HashSetDuplicados;

//"Imagina que estás desarrollando un programa para administrar una biblioteca.
// Necesitas almacenar el conjunto de géneros literarios disponibles en la biblioteca.
// Utilizando la interfaz Set, crea una colección que contenga los siguientes géneros:
// 'Novela', 'Ciencia Ficción', 'Misterio', 'Fantasía' y 'Romance'. Luego, realiza las siguientes operaciones:
//
//        1. Agrega el género 'Aventura' a la colección.
//        2. Verifica si el género 'Romance' está presente en la colección.
//        3. Imprime el tamaño actual de la colección de géneros literarios.
//        4. Itera sobre la colección e imprime cada uno de los géneros literarios presentes."

import java.util.HashSet;
import java.util.Set;

public class Practica2 {
    public static void main(String[] args) {

        //AGREGANDO AL ARRAY LOS GENEROS DISPONIBLES
        String generosLiterarios[] = {"Novela", "Ciencia Ficción", "Misterio", "Fantasia", "Romance"};
        //CREA UN SET PARA ALMACENAR LOS GENEROS
        Set<String> generos = new HashSet<>();

        //AGREGA CADA ELEEMNTO DEL ARRAY AL SET
        for (String g : generosLiterarios) {
            generos.add(g);
        }

        // 1. AGERGA GENERO "Aventura"
        System.out.print("\n1. Agrega nuevo genero\n");
        System.out.println("Imprime el original: " + "\n" + generos);//IMPRIME LOS GENEROS ORIGINALES
        generos.add("Aventura");//AGREGA EL NUEVO GENERO
        System.out.println("Imprimiendo mas el nuevo: " + "\n" + generos); //IMPRIME LA COLELCION

        //2. VERIFICA SI "Romance esta en la coleccion"
        System.out.print("\n2. Verifica si Romance existe\n");
        System.out.println(generos.contains("Romance"));//asi solo imprime true, constains es true o false

        if (generos.contains("Romance")) {
            System.out.println("El género Romance está presente en la colección.");
        } else {
            System.out.println("El género Romance no está presente en la colección.");
        }

        //3. IMPRIME TAMANIO
        System.out.print("\n3. Imprime tamanio\n");
        System.out.println("El tamanio de la coleccio es: "+generos.size());

        //4 IMPRIME TODA LA COLECCION
        System.out.print("\n3. Imprime todo\n");
        for (String g:generos){
            System.out.println(g);
        }


    }//main
}//classs
